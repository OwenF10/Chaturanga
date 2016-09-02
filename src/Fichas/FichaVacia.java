/*
 * To change this license header, choose License Headers in Project Properties.
 * Owen Figueroa -10-
 */
package Fichas;

/**
 *
 * @author Owen Figueroa
 */
public final class FichaVacia extends Ficha{
    public FichaVacia(int turno){
        super(turno);
    }
    @Override
    public boolean validarMove(int x, int y, int x1, int y1) {
        return false;
    }

    @Override
    public String icon() {
        return "";
    }
}
