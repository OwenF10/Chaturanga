/*
 * To change this license header, choose License Headers in Project Properties.
 * Owen Figueroa -10-
 */
package Chaturanga;

import Visual.Menu;
import Visual.MenuPrincipal;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sun.util.logging.resources.logging;

/**
 *
 * @author Owen Figueroa
 */
public class Chaturanga implements Savable{
    static ArrayList<Users> users = new ArrayList<>();
    public static Users loggedIn, loggedIn2;
    
    @Override
    public Users search(String user) {
        for(int i=0; i<users.size(); i++)
            if(users.get(i).user.equals(user))
                return users.get(i);        
        return null;
    }

    @Override
    public boolean login(String user, String pass) {
        Users u=search(user);
        if(u!=null)
            if(u.pass.equals(pass)){
                loggedIn = u;
                return true;
            }
        return false;
    }
    
    @Override
    public boolean login2(String user) {
        Users u = search(user);
        if(u!=null)
            return true;
        return false;
    }

    @Override
    public boolean saveUser(String user, String pass) {
        if(search(user)==null && pass.length()==5){
            users.add(new Users(user, pass));
            return true;
        }
        return false;
    }

    @Override
    public boolean changePass(String user, String pass, String pass2) {
        Users u=search(user);
        if(u!=null){
            if(u.pass.equals(pass) && pass2.length()==5){
                u.pass=pass2;
                return true;
            }
        }
        return false;
    }
    
    public final void surrender(int t){
        int confirm = JOptionPane.showConfirmDialog(Menu.menu, "Seguro?", "Retirirarse",JOptionPane.YES_NO_CANCEL_OPTION);
        if(confirm==JOptionPane.YES_OPTION){
            String user1 = (t==1 ? Menu.userLogged : Menu.userLogged2);
            String user2 = (t==1 ? Menu.userLogged2 : Menu.userLogged);
            Menu.menu.setPanel(new MenuPrincipal());
        }
    }
}
