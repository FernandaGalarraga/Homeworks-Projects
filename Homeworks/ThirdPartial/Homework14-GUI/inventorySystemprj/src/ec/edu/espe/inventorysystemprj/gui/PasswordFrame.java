
package ec.edu.espe.inventorysystemprj.gui;

import ec.edu.espe.inventorysystemprj.cmd.InventorySystemPrj;
import ec.edu.espe.inventorysystemprj.utils.FilePrj;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author TopCoders
 */
public class PasswordFrame extends javax.swing.JFrame {

   private final String masterKey="TopCodersX";
   private String oldSeller=null;
   private String oldStore=null;
   private String newSeller=null;
   private String newStore=null;
   private String oldCriptSeller=null;
   private String oldCriptStore=null;
  
  
    public PasswordFrame() {
        initComponents();
         this.setLocationRelativeTo(null);
    }
       public void setSellerPass()
     {
            String cript;
         FilePrj file=new FilePrj();
         try
         {
            newSeller=txtPass2.getText();
            cript=InventorySystemPrj.cript(newSeller);
            file.deleteLine(this.oldCriptSeller, "Vendedor.txt");
            file.save("Vendedor.txt", cript);
             
         } catch(Exception ex){}

     }
    
     public void getSellerPass()
     {
         FilePrj file=new FilePrj();
         try
         {
             oldCriptSeller=file.readLine("Vendedor.txt");
            oldSeller=InventorySystemPrj.decript(file.readLine("Vendedor.txt"));
       
             
         } catch(Exception ex){}

     }
     public void setStorePass()
     {
         String cript;
         FilePrj file=new FilePrj();
         try
         {
            newStore=txtPass2.getText();
            cript=InventorySystemPrj.cript(newStore);
            file.deleteLine(this.oldCriptStore, "Bodega.txt");
            file.save("Bodega.txt", cript);
             
         } catch(Exception ex){}

     }
     
     public void getStorePass()
     {
         FilePrj file=new FilePrj();
         try
         {
            oldCriptStore=file.readLine("Bodega.txt");
            oldStore=InventorySystemPrj.decript(file.readLine("Bodega.txt"));
     
             
         } catch(Exception ex){}
     }
     
    public void validatePass()
    {
         if(passCheck.getText().equals(masterKey))
         {
               showMessageDialog(null, "Contraseña Correcta, está listo para administrar las claves", "Listo", INFORMATION_MESSAGE); 
               this.cmbChoose.setEnabled(true);
               this.txtPass1.setEnabled(true);
               passCheck.setEnabled(false);
               btnValidate.setEnabled(false);
             
         }
         else
         {
               showMessageDialog(null, "Contraseña Masterizada incorrecta", "ERROR", ERROR_MESSAGE);  
               btnValidate.setEnabled(false);
               passCheck.setText("");
         }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passCheck = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        cmbChoose = new javax.swing.JComboBox<>();
        txtPass2 = new javax.swing.JPasswordField();
        btnGo = new javax.swing.JButton();
        btnValidate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPass1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrador de Contraseña");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passCheck.setToolTipText("Ingresar contraseña previamente establecida ");
        passCheck.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passCheckKeyReleased(evt);
            }
        });
        getContentPane().add(passCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 76, 137, -1));

        jLabel1.setText("Contraseña Maestra");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 79, -1, -1));

        cmbChoose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bodega", "Vendedor" }));
        cmbChoose.setToolTipText("Usted se identifica como...");
        cmbChoose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbChoose.setEnabled(false);
        cmbChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbChooseActionPerformed(evt);
            }
        });
        getContentPane().add(cmbChoose, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 116, 292, -1));

        txtPass2.setToolTipText("Si está habilitado, ingrese la contraseña del propietario de la cuenta respectiva");
        txtPass2.setEnabled(false);
        txtPass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPass2ActionPerformed(evt);
            }
        });
        txtPass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPass2KeyReleased(evt);
            }
        });
        getContentPane().add(txtPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 189, 262, -1));

        btnGo.setText("Cambiar");
        btnGo.setToolTipText("Botón para el inicio de sesión, este puede habilitarse o deshabilitarse dependiendo de la persona que se esté seleccionando\n");
        btnGo.setEnabled(false);
        btnGo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGoMouseClicked(evt);
            }
        });
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 227, -1, -1));

        btnValidate.setText("Verificar");
        btnValidate.setEnabled(false);
        btnValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidateActionPerformed(evt);
            }
        });
        getContentPane().add(btnValidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 75, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Cambio de Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 28, -1, -1));

        txtPass1.setToolTipText("Si está habilitado, ingrese la contraseña del propietario de la cuenta respectiva");
        txtPass1.setEnabled(false);
        txtPass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPass1ActionPerformed(evt);
            }
        });
        txtPass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPass1KeyReleased(evt);
            }
        });
        getContentPane().add(txtPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 158, 262, -1));

        jLabel3.setText("Contraseña Anterior");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 161, -1, -1));

        jLabel4.setText("Nueva Contraseña");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 192, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/inventorysystemprj/images/JMGDistribucionesLogo.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 150, 90));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/inventorysystemprj/images/background.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 440, 330));

        jMenu1.setText("Navegación");

        jMenuItem2.setText("Regresar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbChooseActionPerformed
      txtPass1.setText("");
      txtPass2.setText("");
      btnGo.setEnabled(false);
    }//GEN-LAST:event_cmbChooseActionPerformed

    private void txtPass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPass2ActionPerformed
      

    }//GEN-LAST:event_txtPass2ActionPerformed

    private void txtPass2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPass2KeyReleased
        if(txtPass2.getText().equals(""))
        {
            btnGo.setEnabled(false);
        }
        else
        {
            btnGo.setEnabled(true);
        }
    }//GEN-LAST:event_txtPass2KeyReleased

    private void btnGoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGoMouseClicked
        
    }//GEN-LAST:event_btnGoMouseClicked

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
 
        if(cmbChoose.getSelectedItem().toString()=="Bodega")
        {
              if(!txtPass1.getText().equals(this.oldStore))
              {
                  showMessageDialog(null, "Contraseña no coincide con el sistema, inténtelo de nuevo", "ERROR", ERROR_MESSAGE);  
                  txtPass1.setText("");
                  txtPass2.setText("");
                  btnGo.setEnabled(false);
              }
              else
              {
                  showMessageDialog(null, "Contraseña cambiada exitosamente", "Listo", INFORMATION_MESSAGE);  
                  this.setStorePass();
              }
        }
       else if(cmbChoose.getSelectedItem().toString()=="Vendedor")
        {
            
             if(!txtPass1.getText().equals(this.oldSeller))
              {
                  showMessageDialog(null, "Contraseña no coincide con el sistema, inténtelo de nuevo", "ERROR", ERROR_MESSAGE);  
                  txtPass1.setText("");
                  txtPass2.setText("");
                  btnGo.setEnabled(false);
              }
              else
              {
                   showMessageDialog(null, "Contraseña cambiada exitosamente", "Listo", INFORMATION_MESSAGE);  
                  this.setSellerPass();
              }
        }
               
           
    }//GEN-LAST:event_btnGoActionPerformed

    private void txtPass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPass1ActionPerformed
       
    }//GEN-LAST:event_txtPass1ActionPerformed

    private void txtPass1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPass1KeyReleased
         if(txtPass1.getText().equals(""))
        {
            txtPass2.setEnabled(false);
        }
        else
        {
            txtPass2.setEnabled(true); 

        }  
    }//GEN-LAST:event_txtPass1KeyReleased

    private void btnValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidateActionPerformed
        validatePass();
    }//GEN-LAST:event_btnValidateActionPerformed

    private void passCheckKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passCheckKeyReleased
         if(passCheck.getText().equals(""))
        {
            btnValidate.setEnabled(false);
        }
        else
        {
            btnValidate.setEnabled(true); 
        }       
    }//GEN-LAST:event_passCheckKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       this.getStorePass();
       this.getSellerPass();
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        SellMenu seller = new SellMenu();
        this.setVisible(false);
        seller.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(PasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGo;
    private javax.swing.JButton btnValidate;
    private javax.swing.JComboBox<String> cmbChoose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPasswordField passCheck;
    private javax.swing.JPasswordField txtPass1;
    private javax.swing.JPasswordField txtPass2;
    // End of variables declaration//GEN-END:variables
}
