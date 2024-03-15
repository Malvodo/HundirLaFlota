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

    
    public static void pedirNombre(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre para el jugador 1? ");
        jugador1 = new Jugador(sc.next());
        
        System.out.println("Nombre para el jugador 2? ");
        jugador2 = new Jugador(sc.next());

    }
    
}
