/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author barrodgu
 */
public abstract class Barco implements Comparable<Barco>{
    int longitud;
    String denom;
    char[] secciones = new char[longitud];
    int centro;

    public Barco(int longitud, String denom, int centro) {
        this.longitud = longitud;
        this.denom = denom;
        this.centro = centro;
    }
    
    protected void rellenSec(){
        for (int i = 0; i < secciones.length; i++) {
            secciones[i] = denom.toUpperCase().charAt(0);
        }
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

    public char[] getSecciones() {
        return secciones;
    }

    public void setSecciones(char[] secciones) {
        this.secciones = secciones;
    }

    public int getCentro() {
        return centro;
    }

    public void setCentro(int centro) {
        this.centro = centro;
    }

    @Override
    public int compareTo(Barco o) {
        return this.compareTo(o);
    }
    
    
    
}
