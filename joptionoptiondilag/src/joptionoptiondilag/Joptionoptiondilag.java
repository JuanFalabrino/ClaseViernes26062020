
package joptionoptiondilag;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Joptionoptiondilag {

    public static void main(String[] args) {
             
            ImageIcon icono = new ImageIcon("src/imagenes/r.png");
            
        
             int  seleccion = JOptionPane.showOptionDialog(null,"Seleccione una Opcion",
             "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION, 
             JOptionPane.INFORMATION_MESSAGE,icono,
             new Object []{"Opcion 1", "Opcion 2","Opcion 3"},"Opcion 2");
        
            if(seleccion != -1){
                
                JOptionPane.showMessageDialog(null,"Usted seleccionó la Opcion N " + (seleccion + 1) );
            
            }
        
                 
        
        
        
    }
    
}
