/*
 * To change this license header, choose License Headers in Project Properties.
 * Owen Figueroa -10-
 */
package Fichas;

/**
 *
 * @author Owen Figueroa
 */
public class Torre extends Ficha{
    
    public Torre(int turno) {
        super(turno);
    }

    @Override
    public boolean validarMove(int x, int y, int x1, int y1) {
        return (x>x1 || x<x1 || y>y1 || y<y1);
    }

    @Override
    public String icon() {
        return "src/Imagenes/Fichas/Torre-"+(turno==1 ? "N" : "B")+".png";
    }
}
