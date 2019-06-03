/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombola.electronica;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import static tombola.electronica.TombolaElectronica.v;

/**
 *
 * @author Fernando
 */
public class TombolaElectronica {

    /**
     * @param args the command line arguments
     */

        /* Create and display the form */
    public static  Listado v;
    public static void main(String[] args) throws UnsupportedLookAndFeelException {

        JFrame.setDefaultLookAndFeelDecorated(true);
        try {
            UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TombolaElectronica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TombolaElectronica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TombolaElectronica.class.getName()).log(Level.SEVERE, null, ex);
        }
       v = new Listado();
                v.setVisible(true);
                v.setBounds(200,180,v.getSize().width,v.getSize().height);
     
    }
    
}
