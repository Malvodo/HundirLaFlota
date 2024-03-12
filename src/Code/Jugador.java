/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author barrodgu
 */
public class Jugador {
    char[][] tablero;
    String nombre;
    Barco[] barcos;

    public Jugador(String nombre) {
        this.tablero = new char[10][10];
        this.nombre = nombre;
        this.barcos = new Barco[]{
            new Barco(5, "portaviones"),
            new Barco(3, "buque"),
            new Barco(3, "buque"),
            new Barco(3, "buque"),
            new Barco(2, "submarino"),
            new Barco(2, "submarino"),
            new Barco(2, "submarino"),
            new Barco(1, "lancha"),
            new Barco(1, "lancha")
        };
    }

    public char[][] getTablero() {
        return tablero;
    }

    public void setTablero(char[][] tablero) {
        this.tablero = tablero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Barco[] getBarcos() {
        return barcos;
    }

    public void setBarcos(Barco[] barcos) {
        this.barcos = barcos;
    }
    
    
}
