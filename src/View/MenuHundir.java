/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.util.Scanner;

/**
 *
 * @author barrodgu
 */
public class MenuHundir {
    
    public static void menuColocar(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("CASILLA A HUNDIR?");
        
        System.out.println("Elija la Columna de la casilla");
        int columna = sc.nextInt();
        
        System.out.println("Elija la fila de la casilla");
        char fila = sc.next().charAt(0);

    }
    
}
