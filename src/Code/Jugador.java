/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import View.MenuColocarBarco;
import java.util.Scanner;

/**
 *
 * @author barrodgu
 */
public class Jugador {

    private char[][] tablero;
    private String nombre;
    private Barco[] barcos;
    
    public Jugador(String nombre) {
        this.tablero = new char[10][10];
        this.nombre = nombre;
        barcos = new Barco[]{
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
        inicializarTablero();

    }
    
    //crea tablero y le pone las olas
    private void inicializarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '~' ;
            }
        }
    }

    //muestra el tablero
    public void mostrarTablero() {
        System.out.println("   0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(i  + "  ");
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Barco[] getBarcos() {
        return barcos;
    }

    public void setBarcos(Barco[] barcos) {
        this.barcos = barcos;
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

    
    
    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + '}';
    }
}
