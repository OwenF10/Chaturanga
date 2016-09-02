/*
 * To change this license header, choose License Headers in Project Properties.
 * Owen Figueroa -10-
 */
package Fichas;

/**
 *
 * @author Owen Figueroa
 */
public class Peon extends Ficha{
    
    public Peon(int turno) {
        super(turno);
    }

    @Override
    public boolean validarMove(int x, int y, int x1, int y1) {
        if(turno == 1){
            return (x==x1 && y+1==y1);
        }
        else{
            return (x==x1 && y-1==y1);
        }
    }

    @Override
    public String icon() {
        return "src/Imagenes/Fichas/Peon-"+(turno==1 ? "N" : "B")+".png";
    }
}
