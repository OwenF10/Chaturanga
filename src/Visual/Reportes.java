/*
 * To change this license header, choose License Headers in Project Properties.
 * Owen Figueroa -10-
 */
package Visual;

/**
 *
 * @author Owen Figueroa
 */
public class Reportes extends javax.swing.JPanel {

    /**
     * Creates new form Reportes
     */
    public Reportes() {
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

        btnRanking = new javax.swing.JButton();
        btnLogs = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        btnRanking.setFont(new java.awt.Font("Hobo Std", 0, 48)); // NOI18N
        btnRanking.setText("Ranking");
        btnRanking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRankingMouseClicked(evt);
            }
        });
        add(btnRanking);
        btnRanking.setBounds(270, 250, 220, 90);

        btnLogs.setFont(new java.awt.Font("Hobo Std", 0, 48)); // NOI18N
        btnLogs.setText("Logs");
        btnLogs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogsMouseClicked(evt);
            }
        });
        add(btnLogs);
        btnLogs.setBounds(600, 250, 220, 90);

        jButton1.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
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
        jButton1.setBounds(930, 560, 160, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1150, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRankingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRankingMouseClicked
        // TODO add your handling code here:
        Menu.menu.setPanel(new Ranking());
    }//GEN-LAST:event_btnRankingMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        Menu.menu.setPanel(new MenuPrincipal());
    }//GEN-LAST:event_jButton1MouseClicked

    private void btnLogsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogsMouseClicked
        // TODO add your handling code here:
        Menu.menu.setPanel(new Logs());
    }//GEN-LAST:event_btnLogsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogs;
    private javax.swing.JButton btnRanking;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}