/*
 * To change this license header, choose License Headers in Project Properties.
 * Owen Figueroa -10-
 */
package Chaturanga;

import java.io.IOException;

/**
 *
 * @author Owen Figueroa
 */
public interface Savable {
    boolean searchUser(String u) throws IOException;
    boolean searchUser2 (String u, String u2) throws IOException;
    boolean saveUser(String u, String pass) throws IOException;
    boolean deleteUser(String u) throws IOException;
    boolean Login(String u, String pass)throws IOException;
    String search(String u)throws IOException;
    void changePassword()throws IOException;
    void listUsers();
    void saveLogs(String msg);
    void surrender(int t)throws IOException;   
}
