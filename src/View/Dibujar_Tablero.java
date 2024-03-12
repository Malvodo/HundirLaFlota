/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author barrodgu
 */
public class Dibujar_Tablero {
    
    public static void Tablero() {

        char[][] tablero = new char[10][10]; // Tablero de 5x5

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
    
}
