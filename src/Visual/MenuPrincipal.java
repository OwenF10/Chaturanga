/*
 * To change this license header, choose License Headers in Project Properties.
 * Owen Figueroa -10-
 */
package Visual;

/**
 *
 * @author Owen Figueroa
 */
public class MenuPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        btnJugar = new javax.swing.JButton();
        btnMiCuenta = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        btnJugar.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        btnJugar.setText("Jugar Chaturanga");
        btnJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnJugarMouseClicked(evt);
            }
        });
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        btnJugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnJugarKeyTyped(evt);
            }
        });
        add(btnJugar);
        btnJugar.setBounds(460, 190, 230, 50);

        btnMiCuenta.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        btnMiCuenta.setText("Mi Cuenta");
        btnMiCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiCuentaActionPerformed(evt);
            }
        });
        add(btnMiCuenta);
        btnMiCuenta.setBounds(460, 290, 230, 50);

        btnReportes.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        btnReportes.setText("Reportes");
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportesMouseClicked(evt);
            }
        });
        add(btnReportes);
        btnReportes.setBounds(460, 390, 230, 50);

        btnLogOut.setFont(new java.awt.Font("Hobo Std", 0, 18)); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOutMouseClicked(evt);
            }
        });
        add(btnLogOut);
        btnLogOut.setBounds(930, 540, 150, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1150, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseClicked
        // TODO add your handling code here:
        Menu.menu.setPanel(new MenuInicial());
    }//GEN-LAST:event_btnLogOutMouseClicked

    private void btnJugarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnJugarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJugarKeyTyped

    private void btnJugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJugarMouseClicked
        // TODO add your handling code here:
        Menu.menu.setPanel(new JugarChaturanga());
    }//GEN-LAST:event_btnJugarMouseClicked

    private void btnMiCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiCuentaActionPerformed
        // TODO add your handling code here:
        Menu.menu.setPanel(new MiCuenta());
    }//GEN-LAST:event_btnMiCuentaActionPerformed

    private void btnReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseClicked
        // TODO add your handling code here:
        Menu.menu.setPanel(new Reportes());
    }//GEN-LAST:event_btnReportesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnMiCuenta;
    private javax.swing.JButton btnReportes;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
