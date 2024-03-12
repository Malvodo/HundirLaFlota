/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Code.Jugador;
import java.util.Scanner;

/**
 *
 * @author barrodgu
 */
public class Dibujar_Tablero {
    
    public static Jugador jugador1;
    public static Jugador jugador2;
    
    public static void Tablero() {

        char[][] tablero = new char[10][10]; // Tablero de 10x10

        // Inicializar tablero vacio
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '~'; 
            }
        }

        // Mostrar tablero inicial
        System.out.println("Tablero inicial:");
        mostrarTablero(tablero);
    }

    public static void mostrarTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            System.out.print("|");
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + "|");
            }
            System.out.println();
        }
    }
    
    public static void pedirNombre(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre para el jugador 1? ");
        jugador1 = new Jugador(sc.next());
        
        System.out.println("Nombre para el jugador 2? ");
        jugador2 = new Jugador(sc.next());
        
        System.out.println(jugador1.getNombre());
        System.out.println(jugador2.getNombre());
    }
    
}
