/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Code.Colocacion;
import Code.Jugador;
import View.Dibujar_Tablero;


/**
 *
 * @author barrodgu
 */
public class main {
    
    public static void main(String[] args) {
        Dibujar_Tablero.pedirNombre(); // Pedir nombres de jugadores

        Jugador jugador1 = Dibujar_Tablero.jugador1;
        Jugador jugador2 = Dibujar_Tablero.jugador2;

        Colocacion colocacion = new Colocacion();
        do{
            System.out.println("Turno de " + jugador1.getNombre());
            colocacion.colocacion(jugador1.getBarcos(), jugador1.getTablero(),jugador1);
        }while(colocacion.getCont() > 0);
        do{
            System.out.println("Turno de " + jugador2.getNombre());
            colocacion.colocacion(jugador2.getBarcos(), jugador2.getTablero(),jugador2);
        }while(colocacion.getCont() > 0);

        //hundir
    }
    
}
