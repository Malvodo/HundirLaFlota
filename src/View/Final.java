/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import static Code.EleccionFinal.eleccionFinal;
import Code.Jugador;

/**
 *
 * @author barrodgu
 */
public class Final {
    
    public static void pantallaFinal(){
     
        System.out.println("Enhorabuena " + /*ganador +*/ " ha ganado");
        
        System.out.println();
        
        System.out.println("1. Volver a jugar");
        System.out.println("2. Salir");
        
        eleccionFinal();
        
    }
    
}
