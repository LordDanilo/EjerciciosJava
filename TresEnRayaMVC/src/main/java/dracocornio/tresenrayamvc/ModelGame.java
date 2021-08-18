/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dracocornio.tresenrayamvc;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class ModelGame {

    private String turno;
    private boolean end;
    private boolean draw;
    private JLabel cuadroj1;
    private JLabel cuadroj2;
    private String[][] tablero;
    private int cantMovidas;
    private int victoriasJ1;
    private int victoriasJ2;

    public ModelGame() {
        turno = "X";
        end = false;
        draw = false;
        tablero = new String[3][3];
        cantMovidas = 0;
        victoriasJ1 = 0;
        victoriasJ2 = 0;
    }

    public void marcarCasilla(int i, int j, JLabel[][] casillas) {
        if (!end) {
            if (tablero[i][j] == null) {
                tablero[i][j] = turno;
                casillas[i][j].setText(turno);
                cantMovidas++;
                verificarEstado();
                if (!end) {
                    if (turno.equals("X")) {
                        turno = "O";
                    } else {
                        turno = "X";
                    }
                }else{
                    terminarJuego();
                }
            }
        }
    }

    private void verificarEstado() {
        verificarFilas();
        if (!end) {
            verificarColumnas();
            if (!end) {
                verificarDiagonalP();
                if (!end) {
                    verificarDiagonalS();
                    if (!end) {
                        if (cantMovidas == 9) {
                            draw = true;
                            end = true;
                        }
                    }

                }
            }
        }
    }

    private void verificarFilas() {
        for (int i = 0; i < 3 && !end; i++) {
            boolean win = true;
            for (int j = 0; j < 3 && win; j++) {
                if (tablero[i][j] == null || !tablero[i][j].equals(turno)) {
                    win = false;
                }
            }
            if (win) {
                end = true;
            }
        }
    }

    private void verificarColumnas() {
        for (int j = 0; j < 3 && !end; j++) {
            boolean win = true;
            for (int i = 0; i < 3 && win; i++) {
                if (tablero[i][j] == null || !tablero[i][j].equals(turno)) {
                    win = false;
                }
            }
            if (win) {
                end = true;
            }
        }
    }

    private void verificarDiagonalP() {

        boolean win = true;
        for (int i = 0; i < 3 && win; i++) {
            if (tablero[i][i] == null || !tablero[i][i].equals(turno)) {
                win = false;
            }
        }
        if (win) {
            end = true;
        }

    }

    private void verificarDiagonalS() {

        boolean win = true;
        int j = 2;
        for (int i = 0; i < 3 && win; i++, j--) {
            if (tablero[i][j] == null || !tablero[i][j].equals(turno)) {
                win = false;
            }
        }
        if (win) {
            end = true;
        }

    }

    private void terminarJuego() {
        if(draw){
            JOptionPane.showMessageDialog(null, "Empate");
        }else{
            if(turno.equals("X")){
                victoriasJ1++;
                cuadroj1.setText(String.valueOf(victoriasJ1));
                JOptionPane.showMessageDialog(null, "Victoria del jugador 1");  
            }else{
                victoriasJ2++;
                cuadroj2.setText(String.valueOf(victoriasJ2));
                JOptionPane.showMessageDialog(null, "victoria del jugador 2");
            }
        }
    }

    void setJugadores(JLabel j1, JLabel j2) {
        cuadroj1 = j1;
        cuadroj2 = j2;
    }

    void resetGame(JLabel[][] casillas) {
        turno = "X";
        end = false;
        draw = false;
        cantMovidas = 0;
        for (int i = 0; i < 3; i++) {        
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = null;
                casillas[i][j].setText("");
            }
        }
    }
}
