/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import View.MenuColocarBarco;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author barrodgu
 */
public class Colocacion {

    public void colocacion(){
        
    }
    
    public Barco comprobarT(char bt, Barco[] barcos) throws Exception{
        for (int i = 0; i < barcos.length; i++) {
            if(bt == barcos[i].getDenom().charAt(0)){
                return barcos[i];
            } 
        }
        throw new Exception("no existe este tipo de barco");
    }
}
