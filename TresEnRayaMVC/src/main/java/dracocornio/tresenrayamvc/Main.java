/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dracocornio.tresenrayamvc;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String args[]){
        ModelGame model = new ModelGame();
        ViewGame view = new ViewGame();
        ControllerGame controlador = new ControllerGame(view, model);
        view.setLocationRelativeTo(null);
        view.setVisible(true);
        
    }
}
