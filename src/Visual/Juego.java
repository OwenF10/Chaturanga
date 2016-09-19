/*
 * To change this license header, choose License Headers in Project Properties.
 * Owen Figueroa -10-
 */
package Visual;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Owen Figueroa
 */
public class Juego extends javax.swing.JPanel {

    /**
     * Creates new form Juego
     */
    public Juego() {
        initComponents();
        setTableroPanel(new Tablero());
    }
    
    public void setTableroPanel(JPanel panel){
        tablero.removeAll();
        tablero.add(panel);
        tablero.repaint();
        tablero.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tablero = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        fondoLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1150, 650));
        setLayout(null);

        tablero.setMinimumSize(new java.awt.Dimension(600, 600));
        tablero.setPreferredSize(new java.awt.Dimension(600, 600));

        javax.swing.GroupLayout tableroLayout = new javax.swing.GroupLayout(tablero);
        tablero.setLayout(tableroLayout);
        tableroLayout.setHorizontalGroup(
            tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        tableroLayout.setVerticalGroup(
            tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        add(tablero);
        tablero.setBounds(300, 30, 600, 600);

        jButton1.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        jButton1.setText("Retirar");
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
        jButton1.setBounds(50, 380, 170, 60);

        fondoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        add(fondoLabel);
        fondoLabel.setBounds(0, 0, 1150, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        Menu.users.surrender(Menu.tablero.t);
        }catch(Exception e){}
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondoLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel tablero;
    // End of variables declaration//GEN-END:variables
}
