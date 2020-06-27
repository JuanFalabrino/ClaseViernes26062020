
package juagovaso;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Juagovaso {

    public static void main(String[] args) {
        Random RD = new Random();
        int pelotita = RD.nextInt(3);
        ImageIcon BIEN = new ImageIcon("src/imagenes/bien.png");
        ImageIcon MAL  = new ImageIcon("src/imagenes/mal.png");
        ImageIcon ICON = new ImageIcon("src/imagenes/juego.png");
        
        int seleccion = JOptionPane.showOptionDialog(null,"Encuentre la pelotita escondida",
                "Juego del Vaso",JOptionPane.YES_NO_CANCEL_OPTION,
                 JOptionPane.INFORMATION_MESSAGE,ICON,
                 new Object [] {"Vaso 1", "Vaso 2", "Vaso 3"},"Vaso 1");
        
        if (pelotita==seleccion){
            JOptionPane.showMessageDialog(null,"MUY BIEN LE PEGASTE!","Juego del Vaso",JOptionPane.INFORMATION_MESSAGE,BIEN);
              
        }else {
            JOptionPane.showMessageDialog(null,"MUY MAL VOLVE A JUGAR","Juego del Vaso",JOptionPane.INFORMATION_MESSAGE,MAL);
        
        }
        
        
        
        
    }
    
}
