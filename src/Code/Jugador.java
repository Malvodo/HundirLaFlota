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
    protected Barco[] barcos;
    
    private int contPortaviones;
    private int contBuque;
    private int contSubmarino;
    private int contLancha;
    
    private int contMax;
    
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
        
        contPortaviones = 1;
        contBuque = 3;
        contSubmarino = 3;
        contLancha = 2;
        
        contMax = 9;
        
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
        int c = 9;
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(c  + "  ");
            c--;
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int getContMax() {
        return contMax;
    }

    public void setContMax(int contMax) {
        this.contMax = contMax;
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

    public int getContPortaviones() {
        return contPortaviones;
    }

    public void setContPortaviones(int contPortaviones) {
        this.contPortaviones = contPortaviones;
    }

    public int getContBuque() {
        return contBuque;
    }

    public void setContBuque(int contBuque) {
        this.contBuque = contBuque;
    }

    public int getContSubmarino() {
        return contSubmarino;
    }

    public void setContSubmarino(int contSubmarino) {
        this.contSubmarino = contSubmarino;
    }

    public int getContLancha() {
        return contLancha;
    }

    public void setContLancha(int contLancha) {
        this.contLancha = contLancha;
    }

    
    
    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + '}';
    }
}
