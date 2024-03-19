/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import Code.Jugador;
import static View.Dibujar_Tablero.jugador1;
import static View.Dibujar_Tablero.jugador2;
import java.util.Scanner;

/**
 *
 * @author barrodgu
 */
public class Hundir {
    
    public static Jugador tablero1 = new Jugador("tablero1");
    public static Jugador tablero2 = new Jugador("tablero2");
    
    public static void hundir(){
        do{
            System.out.println("Turno de ataque de: " + jugador1.getNombre());
            ataque(jugador2.getTablero(), tablero1.getTablero(), jugador2); //ataque del jugador 1
            tablero1.mostrarTablero();
            
            System.out.println("Turno de ataque de: " + jugador2.getNombre());
            ataque(jugador1.getTablero(), tablero2.getTablero(), jugador1); //ataque del jugador 2
            tablero2.mostrarTablero();
        }while(jugador1.getContMax() > 0 || jugador2.getContMax() > 0);
        terminar();
        
    }
    
    public static void terminar(){
        if(jugador1.getContMax() == 0){
            System.out.println("Ha ganaado " + jugador1.getNombre());
        }else {
            System.out.println("Ha ganaado " + jugador2.getNombre());
        }
    }
    
    public static void ataque(char[][] tableroJugador, char[][] TableroResolver, Jugador jugador){
        Scanner sc = new Scanner(System.in);
        System.out.println("CASILLA A HUNDIR?");
        System.out.println("Elija la Columna de la casilla (0 - 9)");
        int columna = sc.nextInt();
        
        System.out.println("Elija la fila de la casilla (0 - 9)");
        int fila = sc.nextInt();
        
        if(tableroJugador[columna][fila] == '~'){
            TableroResolver[columna][fila] = 'O';
            
            
        }else{
            System.out.println("Barco Tocado");
            TableroResolver[columna][fila] = 'X';
            
            for(int i = 0;i < jugador.barcos.length;i++){
                if(jugador.barcos[i].getLongitud() <= 0){
                    System.out.println("Barco hundido");
                    jugador.setContMax(jugador.getContMax() - 1);
                    
                    
                }
            }
        }
    }
}
