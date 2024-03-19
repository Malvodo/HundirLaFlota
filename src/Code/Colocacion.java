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

    private int cont = 9;

    public void colocacion(Barco[] b, char[][] tabl, Jugador jugador) {
        try {
            do {
                for(int i = 0;i < jugador.barcos.length;i++){  //for creado para sustituir la variable t ya que sigue un orden concreto de colocacion de barcos
                    MenuColocarBarco.elegirBarco(i);  //modificacion hecha este metodo esta en menuColocar
                    b[i].setCentro(MenuColocarBarco.menuColocar());
                    b[i].Rotation(MenuColocarBarco.girarbarco(), tabl);
                    jugador.mostrarTablero(); // Mostrar el tablero actualizado
                    cont--;
                }
            } while (cont > 0);
        } catch (Exception ex) {
            ex.getMessage();
            colocacion(b, tabl, jugador);
        }
    }

    public void colocabarco(Barco[] b, char[][] tabl, Jugador jugador) {
        cont = jugador.getContPortaviones() + jugador.getContBuque()
                + jugador.getContSubmarino() + jugador.getContLancha();
        while (cont > 0) {
            colocacion(b, tabl, jugador);
        }
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
}
