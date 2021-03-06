/*
 * To change this license header, choose License Headers in Project Properties.
 * Owen Figueroa -10-
 */
package Visual;

import Fichas.Caballo;
import Fichas.Consejero;
import Fichas.Elefante;
import Fichas.Ficha;
import Fichas.FichaVacia;
import Fichas.Peon;
import Fichas.Rey;
import Fichas.Torre;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public final class Tablero extends JPanel implements Serializable{
    public int currentX, currentY, t;
    boolean chosenPiece = false;
    transient Image background = Toolkit.getDefaultToolkit().createImage("src/Imagenes/tablero2.png");
    JLabel[][] pieces = new Ficha[10][9];
    GridLayout gridLayout = new GridLayout(8, 8);
    
    public Tablero(){
        initCuadros();
        setBounds(0, 0, 600, 600);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(background, 0, 0, this);
    }
    
    public void changeTurn(){
        if(t==1)
            t=2;
        else
            t=1;
    }
    
    public void initCuadros(){
        setLayout(gridLayout);
        int contTurnos = 0;
        t = 1;
        
        for(int y = 0; y<8; y++){
            for(int x = 0; x<8; x++){
                if((y==0 && (x==0 || x==7)) || (y==7 && (x==0 || x==7)))
                    pieces[y][x] = new Torre(t);
                
                else if((y==0 && (x==1 || x==6)) || (y==7 && (x==1 || x==6)))
                    pieces[y][x] = new Caballo(t);
                    
                else if((y==0 && (x==2 || x==5)) || (y==7 && (x==2 || x==5)))
                    pieces[y][x] = new Elefante(t);
                
                else if((y==0 && x==3) || (y==7 && x==4))
                    pieces[y][x] = new Rey(t);
                
                else if((y==0 && x==4) || (y==7 && x==3))
                    pieces[y][x] = new Consejero(t);
                
                else if((y==1 && (x==0 || x==1 || x==2 || x==3 || x==4 || x==5 || x==6 || x==7)) ||
                        (y==6 && (x==0 || x==1 || x==2 || x==3 || x==4 || x==5 || x==6 || x==7)))
                    pieces[y][x] = new Peon(t);
                
                else
                    pieces[y][x] = new FichaVacia(t);
                
                contTurnos++;
                pieces[y][x].setIcon(new ImageIcon(((Ficha)pieces[y][x]).icon()));
                pieces[y][x].addMouseListener(new MousePressed());
                pieces[y][x].setBounds(x*60, y*60, 60, 60);
                add(pieces[y][x]);
            }
            if(contTurnos == 32)
                changeTurn();
        }changeTurn();
    }
    
    class MousePressed implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent me) {
            Object source = me.getSource();            
            for(int y = 0; y<8; y++){
                for(int x = 0; x<8; x++){
                    if(source==pieces[y][x] && !(source instanceof FichaVacia) && ((Ficha)pieces[y][x]).turno == t){
                        currentX = x; 
                        currentY = y;
                        chosenPiece = true;
                    }
                    
                    else if(source == pieces[y][x] && source instanceof FichaVacia && chosenPiece)
                        moverPieza(x, y);
                }
            }
        }
        @Override
        public void mousePressed(MouseEvent me) {}
        @Override
        public void mouseReleased(MouseEvent me) {}
        @Override
        public void mouseEntered(MouseEvent me) {}
        @Override
        public void mouseExited(MouseEvent me) {}
    }
    
    public void moverPieza(int x, int y){
        if(((Ficha)pieces[currentY][currentX]).validarMove(currentX, currentY, x, y))
            setNewFicha(x, y);
    }
    
    public void setNewFicha(int x, int y){
        pieces[y][x] = pieces[currentY][currentX];
        newFichaVacia(currentX, currentY);
        chosenPiece = false;
        changeTurn();
        refresh();
    }
    
    public void newFichaVacia(int x, int y){
        pieces[y][x] = new FichaVacia(t);
        pieces[y][x].addMouseListener(new MousePressed());
    }
    
    public void refresh(){
        removeAll();
        for(int y = 0; y<8; y++){
            for(int x = 0; x<8; x++){
                pieces[y][x].addMouseListener(new MousePressed());
                add(pieces[y][x]);
            }
        }
        repaint();
        revalidate();
    }
    /*public void endGame(){
        if(!generalsAlive()){
            String winner = (t==1 ? Menu.userLogged2 : Menu.userLogged);
            String loser = (t==1 ? Menu.userLogged : Menu.userLogged2);
            
            String victory = winner+" has won the game against "+loser+". "+winner+" has gained 3 points.";
            
            new File(Menu.path).delete();
            Menu.xia.addPoints(winner, victory);
            Menu.xia.saveLogs(victory);
            Menu.menu.setPanel(new MenuPrincipal());
        }
    }*/
    
    public static void newGame(String user) throws IOException{
        Menu.userLogged2 = user;
        Menu.path = "Players/"+Menu.userLogged+"/"+Menu.cha.getCode()+"-"+user;
        FileOutputStream file = new FileOutputStream(Menu.path);
        Tablero tab = new Tablero();
        Menu.tablero = tab;        
        file.close();        
    }
    
    public void saveGame() throws IOException{
        FileOutputStream fos = new FileOutputStream(Menu.path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(Menu.tablero);
        fos.close();
    }
    
    public static Tablero loadGame(String path) throws IOException, ClassNotFoundException{
        String[] game = path.split("-");
        Menu.userLogged2 = game[1];
        String fileName = Menu.cha.getFileName(game);
        Menu.path = "Players/"+Menu.userLogged+"/"+fileName;
        FileInputStream file = new FileInputStream(Menu.path);
        ObjectInputStream data = new ObjectInputStream(file);
        Tablero tab = (Tablero)data.readObject();        
        return tab;
    }
    
}