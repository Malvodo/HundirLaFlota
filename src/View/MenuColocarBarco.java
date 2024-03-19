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
        System.out.println("Como lo quieres colocar?(horizontal/vertical):");
        char c= sc.nextLine().toLowerCase().charAt(0);
        if(c == 'h'){
            return true;
        }else if(c == 'v'){
            return false;
        }else{
            System.out.println("Respuesta no indentificada:");
            girarbarco();
        }
        
        return false;
    }
    
    
    public static int[][] menuColocar(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("CASILLA DEL CENTRO DEL BARCO");
        
        System.out.println("Elija la Columna de la casilla (0 - 9)");
        int columna = sc.nextInt();
        
        System.out.println("Elija la fila de la casilla (0 - 9)");
        int fila = sc.nextInt();
        int[][] ct = new int[][]{{columna, fila}};
        return ct;
    }
    
    public static void elegirBarco(int pos){  //sigue segun se suma en la i del for de Colocacion
        Scanner sc = new Scanner(System.in);
        
        if(pos <= 0){
            System.out.println("Donde quieres colocar el Portaviones(Tamanio: 5 casillas)? ");
        }
        
        if(pos >= 1 && pos <=3){
            System.out.println("Donde quieres colocar el Buque(Tamanio: 3 casillas)? ");
        }
        
        if(pos >= 4 && pos <=6){
            System.out.println("Donde quieres colocar el Submarino(Tamanio: 2 casillas)? ");
        }
        
        if(pos >= 7 && pos <= 8){
            System.out.println("Donde quieres colocar la Lancha(Tamanio: 1 casillas)? ");
        }
    }
    
}
