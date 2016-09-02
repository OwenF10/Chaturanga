/*
 * To change this license header, choose License Headers in Project Properties.
 * Owen Figueroa -10-
 */
package Fichas;

/**
 *
 * @author Owen Figueroa
 */
public class Consejero extends Ficha{

    public Consejero(int turno) {
        super(turno);
    }

    @Override
    public boolean validarMove(int x, int y, int x1, int y1) {
        return ((x-1)==x1 && (y+1)==y1) || ((x+1)==x1 && (y+1)==y1) || ((x-1)==x1 && (y-1)==y1) || ((x+1)==x1 && (y-1)==y1);
    }

    @Override
    public String icon() {
        return "src/Imagenes/Fichas/Reina-"+(turno==1 ? "N" : "B")+".png";
    }
    
}
