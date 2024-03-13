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
    
    public static boolean girarbarco(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quires girar barco?(s/n):");
        char c= sc.nextLine().toLowerCase().charAt(0);
        if(c == 's'){
            return true;
        }else if(c == 'n'){
            return false;
        }else{
            System.out.println("Respuesta no indentificada:");
            girarbarco();
        }
        return false;
    }
    
    public static char elegirbarco(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce que barco quieres colocar(portaviones, buque, submarino, lancha)");
        return sc.next().toLowerCase().charAt(0);
    }
    
    public static int[][] menuColocar(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("CASILLA A COLOCAR BARCO");
        
        System.out.println("Elija la Columna de la casilla");
        int columna = sc.nextInt();
        
        System.out.println("Elija la fila de la casilla");
        int fila = sc.next().charAt(0);
        int[][] ct = new int[][]{{columna},{fila}};
        return ct;
    }
    
}
