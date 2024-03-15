/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import static View.Dibujar_Tablero.jugador1;
import View.MenuColocarBarco;

/**
 *
 * @author barrodgu
 */
public class Colocacion {

    private int cont;
    
    public void colocacion(Barco[] b, char[][] tabl, Jugador jugador) {
    try {
        cont = 1;
        for (int i = 0; i < tabl.length; i++) {
            do {
                Barco brc = null;        
                brc = comprobarT(MenuColocarBarco.elegirbarco(), b);      
                brc.setCentro(MenuColocarBarco.menuColocar());
                brc.Rotation(MenuColocarBarco.girarbarco(), tabl);
                jugador.mostrarTablero(); // Mostrar el tablero actualizado
                cont--;
                System.out.println(cont);
            } while (!MenuColocarBarco.confirmacion());
        }
    } catch (Exception ex) {
        ex.getMessage();
        colocacion(b, tabl,jugador);
    }
}

    public Barco comprobarT(char bt, Barco[] barcos) throws Exception {
        for (int i = 0; i < barcos.length; i++) {
            if (bt == barcos[i].getDenom().charAt(0)) {
                return barcos[i];
            }
        }
        throw new Exception("no existe este tipo de barco");
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
}
