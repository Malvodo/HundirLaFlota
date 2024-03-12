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
public class MenuColocarBarco {
    
    public static char elegirbarco(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce que barco quieres colocar(portaviones, buque, submarino, lancha)");
        return sc.next().toLowerCase().charAt(0);
    }
    
    public static void menuColocar(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("CASILLA A COLOCAR BARCO");
        
        System.out.println("Elija la Columna de la casilla");
        int columna = sc.nextInt();
        
        System.out.println("Elija la fila de la casilla");
        char fila = sc.next().charAt(0);
    }
    
}
