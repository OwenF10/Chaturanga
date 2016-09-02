/*
 * To change this license header, choose License Headers in Project Properties.
 * Owen Figueroa -10-
 */
package Visual;

import Chaturanga.Chaturanga;
import javax.swing.DefaultListModel;
/**
 *
 * @author Owen Figueroa
 */
public class JugadoresDisponibles extends javax.swing.JPanel {
    public static DefaultListModel dlm;
    /**
     * Creates new form JugadoresDisponibles
     */
    public JugadoresDisponibles() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jugador2 = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(624, 485));
        setLayout(null);

        jButton1.setFont(new java.awt.Font("Hobo Std", 0, 18)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(930, 570, 170, 40);

        jLabel2.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingrese el Jugador 2");
        add(jLabel2);
        jLabel2.setBounds(440, 200, 240, 60);

        jugador2.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        jugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugador2ActionPerformed(evt);
            }
        });
        add(jugador2);
        jugador2.setBounds(380, 300, 350, 40);

        btnAceptar.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });
        add(btnAceptar);
        btnAceptar.setBounds(490, 430, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1150, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        Menu.menu.setPanel(new JugarChaturanga());
    }//GEN-LAST:event_jButton1MouseClicked

    private void jugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugador2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jugador2ActionPerformed

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        // TODO add your handling code here:
        try{
            if(Menu.users.login2(jugador2.getText())){
                Menu.menu.setPanel(new Juego());
                Menu.userLogged=jugador2.getText();
            }
        }catch(Exception e){}
        
    }//GEN-LAST:event_btnAceptarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jugador2;
    // End of variables declaration//GEN-END:variables

}