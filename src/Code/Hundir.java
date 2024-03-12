/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import View.Dibujar_Tablero;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author barrodgu
 */
public class Hundir {
    
    public static void hundir(){
        Scanner sc = new Scanner(System.in);
        
        int portaviones1 = 5;
        int buque1 = 9;
        int submarino1 = 6;
        int lancha1 = 2;
        
        int portaviones2 = 5;
        int buque2 = 9;
        int submarino2 = 6;
        int lancha2 = 2;
        
        int cont1 = portaviones1 + buque1 + lancha1 + submarino1;
        int cont2 = portaviones2 + buque2 + lancha2 + submarino2;
        
        boolean turno = true;
        
        String jugador1 = Dibujar_Tablero.jugador1.getNombre();
        String jugador2 = Dibujar_Tablero.jugador2.getNombre();
        
        char[][] tablero1 = Dibujar_Tablero.jugador1.getTablero();
        char[][] tablero2 = Dibujar_Tablero.jugador2.getTablero();
        char[][] tableronuevo1 = Dibujar_Tablero.Tablero();
        char[][] tableronuevo2 = Dibujar_Tablero.Tablero();
        
        while(cont1 > 0 ||cont2 > 0){
            
            if(turno = true){
                
                
                System.out.println("Turno de " + jugador1);

                System.out.println("CASILLA A HUNDIR?");
                System.out.println("Elija la Columna de la casilla");
                int columna = sc.nextInt();

                System.out.println("Elija la fila de la casilla");
                char fila = sc.next().charAt(0);

                if(tablero2[fila][columna] == 'P' /*|| tablero1[fila][columna] == 'S' || tablero1[fila][columna] == 'B' || tablero1[fila][columna] == 'L'*/){
                    portaviones1--;
                    cont1--;

                    tableronuevo1[fila][columna] = 'X';

                    if(portaviones1 > 0){
                        System.out.println("Tocado");

                    }else if(portaviones1 == 0){
                        System.out.println("Hundido");
                    }        
                }
            
            }else if(turno = false){
                
            }
        }
        
        
        
    }

}
