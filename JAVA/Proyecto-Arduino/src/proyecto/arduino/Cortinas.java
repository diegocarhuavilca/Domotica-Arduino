/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.arduino;

import com.panamahitek.ArduinoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jssc.SerialPortException;
import static proyecto.arduino.GUI.Arduino;

public class Cortinas extends javax.swing.JPanel {

    public Cortinas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnApagar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnDerecha = new javax.swing.JLabel();
        btnIzquierda = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(737, 386));
        setPreferredSize(new java.awt.Dimension(737, 386));

        btnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-power-off-button-100.png"))); // NOI18N
        btnApagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnApagarMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Cortinas");

        btnDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-circled-play-100.png"))); // NOI18N
        btnDerecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDerechaMouseClicked(evt);
            }
        });

        btnIzquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-circled-izquierda-100.png"))); // NOI18N
        btnIzquierda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIzquierdaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(btnIzquierda)
                .addGap(83, 83, 83)
                .addComponent(btnApagar)
                .addGap(81, 81, 81)
                .addComponent(btnDerecha)
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(301, 301, 301))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnApagar)
                    .addComponent(btnDerecha)
                    .addComponent(btnIzquierda))
                .addContainerGap(105, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIzquierdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIzquierdaMouseClicked
        try {
            Arduino.sendData("a");
        } catch (ArduinoException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SerialPortException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIzquierdaMouseClicked

    private void btnApagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApagarMouseClicked
        try {
            Arduino.sendData("b");
        } catch (ArduinoException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SerialPortException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnApagarMouseClicked

    private void btnDerechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDerechaMouseClicked
        try {
            Arduino.sendData("c");
        } catch (ArduinoException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SerialPortException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDerechaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnApagar;
    private javax.swing.JLabel btnDerecha;
    private javax.swing.JLabel btnIzquierda;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
