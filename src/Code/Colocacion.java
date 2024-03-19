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
            do {
                for(int i = 0;i < jugador.barcos.length;i++){  //for creado para sustituir la variable t ya que sigue un orden concreto de colocacion de barcos
                    try {
                        MenuColocarBarco.elegirBarco(i);  //modificacion hecha este metodo esta en menuColocar
                        b[i].setCentro(MenuColocarBarco.menuColocar());
                        b[i].Rotation(MenuColocarBarco.girarbarco(), tabl);
                        jugador.mostrarTablero(); // Mostrar el tablero actualizado
                        cont--;
                    }catch (IndexOutOfBoundsException ex) {
                      System.out.println("El barco esta coloado fuera de campo intenta colocarlo de nuevo");
                      i--;
                    }catch (Exception ex2) {
                        System.out.println(ex2.getMessage());
                        i--;
                    }
                }
            } while (cont > 0);
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
