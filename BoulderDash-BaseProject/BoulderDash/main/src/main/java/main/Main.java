package main;

import java.sql.SQLException;

import javax.swing.*;


import controller.ControllerFacade;
import model.ModelFacade;
import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class Main {

	
    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
   
    		new Main();
    		
    
    		
    		

    

        final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());

        try {
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }
    }



public Main(){
	JFrame fenetre = new  JFrame("Jeu");
	//*fenetre.add(new Panneau());
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fenetre.setSize(1088, 864);
	fenetre.setLocationRelativeTo(null);
	fenetre.setResizable(false);
	fenetre.setVisible(true);
	
	}
}






