/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import View.MenuColocarBarco;

/**
 *
 * @author barrodgu
 */
public class Colocacion {

    public void colocacion(Barco[] b, char[][] tabl){
        
        try {
            Barco brc = null;
            brc = comprobarT(MenuColocarBarco.elegirbarco(), b);
            brc.setCentro(MenuColocarBarco.menuColocar());
            brc.Rotation(MenuColocarBarco.girarbarco(), tabl);
            
            
            
            
        } catch (Exception ex) {
            ex.getMessage();
            colocacion(b, tabl);
        }
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
