/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dracocornio.tresenrayamvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author USUARIO
 */
public class ControllerGame {
    private ViewGame view;
    private ModelGame model;
    private JLabel[][] casillas;
    public ControllerGame(ViewGame view, ModelGame model){
        this.view = view;
        this.model = model;
        casillas = view.getCasillas();
        agregarListeners();
        crearJugadores();
    }

    private void agregarListeners() {
         for(int i=0; i<3; i++){
             for(int j=0; j<3; j++){
                 agregarEventoMouse(i,j);
             }
         }
         JButton botonReset = view.getBotonReset();
         botonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.resetGame(casillas);
            }
        });
    }

    private void agregarEventoMouse(int i, int j) {
        JLabel casillaActual = casillas[i][j];
        casillaActual.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                model.marcarCasilla(i,j,casillas);
            }
        });
    }

    private void crearJugadores() {
        JLabel j1 = view.getVictoriasJ1();
        JLabel j2 = view.getVictoriasJ2();
        model.setJugadores(j1,j2);
    }
}
