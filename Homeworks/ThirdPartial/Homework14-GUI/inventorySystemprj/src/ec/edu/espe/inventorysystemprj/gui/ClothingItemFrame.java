package ec.edu.espe.inventorysystemprj.gui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.WindowConstants;

/**
 *
 * @author TopCoders
 */
public class ClothingItemFrame extends javax.swing.JFrame {

    public ClothingItemFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTopCoders = new java.awt.Label();
        lblTitle = new java.awt.Label();
        lblIntro = new java.awt.Label();
        lblLogo = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();
        menSystem = new javax.swing.JMenuBar();
        mnuStore = new javax.swing.JMenu();
        mnuProducts = new javax.swing.JMenuItem();
        mnuSalesNote = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mnuCustomer = new javax.swing.JMenu();
        mnuAddCustomer = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTopCoders.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        lblTopCoders.setText("TopCoders © 2018");
        getContentPane().add(lblTopCoders, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 419, -1, -1));

        lblTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitle.setText("Sistema de Inventario de Ropa | TopCoders © 2018");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        lblIntro.setText("Bienvenidoa a nuestro sistema, por favor sea amable de elegir todas nuestras opciones \nen el menú superior\n");
        getContentPane().add(lblIntro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/inventorysystemprj/images/JMGDistribucionesLogo.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 170, 130));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/inventorysystemprj/images/Background.jpg"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -30, 780, 490));

        mnuStore.setText("Gestión de Almacén");
        mnuStore.setActionCommand("");
        mnuStore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuStoreMouseClicked(evt);
            }
        });

        mnuProducts.setText("Products");
        mnuProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProductsActionPerformed(evt);
            }
        });
        mnuStore.add(mnuProducts);

        menSystem.add(mnuStore);

        mnuSalesNote.setText("Nota de Venta");

        jMenuItem3.setText("Añadir producto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnuSalesNote.add(jMenuItem3);

        jMenuItem4.setText("Borrar producto");
        mnuSalesNote.add(jMenuItem4);

        jMenu2.setText("Añadir cliente");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        mnuSalesNote.add(jMenu2);

        jMenu3.setText("Solicitar Nota de Venta");
        mnuSalesNote.add(jMenu3);

        menSystem.add(mnuSalesNote);

        mnuCustomer.setText("Cliente");

        mnuAddCustomer.setText("Añadir Cliente");
        mnuAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAddCustomerActionPerformed(evt);
            }
        });
        mnuCustomer.add(mnuAddCustomer);

        menSystem.add(mnuCustomer);

        setJMenuBar(menSystem);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        CustomerFrame customer = new CustomerFrame();
        this.setVisible(false);
        customer.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void mnuStoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuStoreMouseClicked

    }//GEN-LAST:event_mnuStoreMouseClicked

    private void mnuProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProductsActionPerformed
        ListProduct list;
        try {
            list = new ListProduct();
            this.setVisible(false);
            list.setVisible(true);
            dispose();
        } catch (IOException ex) {
            Logger.getLogger(ClothingItemFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_mnuProductsActionPerformed

    private void mnuAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAddCustomerActionPerformed
        CustomerFrame customer = new CustomerFrame();
        this.setVisible(false);
        customer.setVisible(true);
        dispose();
    }//GEN-LAST:event_mnuAddCustomerActionPerformed

    /**
     * @param args the command line arguments
     */
//CAMBIAR AL MAIN CUANDO SE DESHAGA TODA LA UNIDAD DE CONSOLA
    public static void main(String args[]) {
        /* //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClothingItemFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClothingItemFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClothingItemFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClothingItemFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClothingItemFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JLabel lblBackground;
    private java.awt.Label lblIntro;
    private javax.swing.JLabel lblLogo;
    private java.awt.Label lblTitle;
    private java.awt.Label lblTopCoders;
    private javax.swing.JMenuBar menSystem;
    private javax.swing.JMenuItem mnuAddCustomer;
    private javax.swing.JMenu mnuCustomer;
    private javax.swing.JMenuItem mnuProducts;
    private javax.swing.JMenu mnuSalesNote;
    private javax.swing.JMenu mnuStore;
    // End of variables declaration//GEN-END:variables
}
