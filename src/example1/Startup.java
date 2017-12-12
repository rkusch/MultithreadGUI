package example1;

import javax.swing.UIManager;

/**
 *
 * @author jlombardo
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Set the O/S System Look and Feel
        try {          
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            System.out.println("Couldn't load System Look and Feel, continuing without...");
        } 
        
        MainWindow win = new MainWindow();
        win.setVisible(true);
        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainWindow().setVisible(true);
//            }
//        });
    }
    
}
