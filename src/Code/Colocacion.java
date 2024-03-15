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

    private int cont;
    

    public void colocacion(Barco[] b, char[][] tabl, Jugador jugador) {
        try {
            do {
                int t = comprobarT(MenuColocarBarco.elegirbarco(), b, jugador);
                b[t].setCentro(MenuColocarBarco.menuColocar());
                b[t].Rotation(MenuColocarBarco.girarbarco(), tabl);
                jugador.mostrarTablero(); // Mostrar el tablero actualizado
            } while (!MenuColocarBarco.confirmacion());
        } catch (Exception ex) {
            ex.getMessage();
            colocacion(b, tabl, jugador);
        }
    }

    public void colocabarco(Barco[] b, char[][] tabl, Jugador jugador) {
        int cont = jugador.getContPortaviones() + jugador.getContBuque()
                + jugador.getContSubmarino() + jugador.getContLancha();
        while (cont > 0) {
            colocacion(b, tabl, jugador);
        }
    }

    public int comprobarT(char bt, Barco[] barcos, Jugador j) throws Exception {
        for (int i = 0; i < barcos.length; i++) {
            if (bt == barcos[i].getDenom().charAt(0)) {
                switch (barcos[i].getDenom().charAt(0)) {
                    case 'p':
                        if(j.getContPortaviones() > 0)
                        j.setContPortaviones(j.getContPortaviones() - 1);
                        return i;
                    case 'b':
                        if(j.getContBuque()> 0)
                        j.setContBuque(j.getContBuque()- 1);
                        return i;
                    case 's':
                        if(j.getContSubmarino()> 0)
                        j.setContSubmarino(j.getContSubmarino()- 1);
                        return i;
                    case 'l':
                        if(j.getContLancha()> 0)
                        j.setContLancha(j.getContLancha()- 1);
                        return i;
                    default:
                        throw new Exception("no existe este tipo de barco");
                }
                
            }
        }
        throw new Exception("has puesto maxima cantidad de ese tipo de barcos");
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
}
