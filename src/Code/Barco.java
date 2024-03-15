/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author barrodgu
 */
public class Barco implements Comparable<Barco>{
    private int longitud;
    private String denom;
    private char secciones;
    private int[][] centro = new int[1][1];
    private boolean isDestroid = false;
    

    public Barco(int longitud, String denom) {
        this.longitud = longitud;
        this.denom = denom;
        secciones =this.denom.toUpperCase().charAt(0);
    }
    

    public void Rotation(boolean isHorizontal, char[][] tablero){
    if (isHorizontal) {
        tablero[centro[0][0]][centro[0][0]] = secciones;
        for (int i = 1; i < longitud / 2 + 1; i++) {
            tablero[centro[0][0] + i][centro[0][0]] = secciones;
            tablero[centro[0][0] - i][centro[0][0]] = secciones;
        }
    } else {
        for (int i = 1; i < longitud / 2 + 1; i++) {
            tablero[centro[0][0]][centro[0][0] + i] = secciones;
            tablero[centro[0][0]][centro[0][0] - i] = secciones;
        }
    }
}
    
    public boolean isIsDestroid() {
        return isDestroid;
    }

    public void setIsDestroid(boolean isDestroid) {
        this.isDestroid = isDestroid;
    }
    
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getDenom() {
        return denom;
    }

    public void setDenom(String denom) {
        this.denom = denom;
    }

    public char getSecciones() {
        return secciones;
    }

    public void setSecciones(char secciones) {
        this.secciones = secciones;
    }

    public int[][] getCentro() {
        return centro;
    }

    public void setCentro(int[][] centro) {
        this.centro = centro;
    }

    @Override
    public int compareTo(Barco o) {
        return this.compareTo(o);
    }
}
