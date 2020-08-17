
package clases;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Portada  extends javax.swing.JPanel{
     public static String Portadas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Portada()
    {
        this.setSize(1000,800);
    }    
   public void paint(Graphics grafico){
      
            Dimension height=getSize();
            
            ImageIcon Img = new ImageIcon(getClass().getResource("/Imagenes/fondocasa.jpg"));

            grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
}
}
