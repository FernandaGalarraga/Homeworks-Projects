
package ec.edu.espe.inventorysystemprj.gui;

import ec.edu.espe.inventorysystemprj.cmd.InventorySystemPrj;
import ec.edu.espe.inventorysystemprj.utils.FilePrj;
import java.awt.Dialog;
import java.io.IOException;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author TopCoders
 */
public class LoginFrame extends javax.swing.JFrame {

    private final String masterKey="TopCodersX";
    private final String sellerKey="track24";
    private final String storeKey="USChange36";
    public LoginFrame() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new java.awt.Label();
        cmbChoose = new javax.swing.JComboBox<>();
        btnGo = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        lblDescription = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuClient = new javax.swing.JMenuItem();
        menuKey = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();

        setTitle("¡Bienvenido a nuestro sistema!");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitle.setText("Bienvenido a nuestro Sistema | TopCoders © 2018");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));
        lblTitle.getAccessibleContext().setAccessibleName("lblTitle");

        cmbChoose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Bodega", "Vendedor" }));
        cmbChoose.setToolTipText("Usted se identifica como...");
        cmbChoose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbChooseActionPerformed(evt);
            }
        });
        getContentPane().add(cmbChoose, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 99, 192, -1));

        btnGo.setText("Ingresar");
        btnGo.setToolTipText("Botón para el inicio de sesión, este puede habilitarse o deshabilitarse dependiendo de la persona que se esté seleccionando\n");
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
        getContentPane().add(btnGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 181, -1, -1));

        txtPass.setToolTipText("Si está habilitado, ingrese la contraseña del propietario de la cuenta respectiva");
        txtPass.setEnabled(false);
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassKeyReleased(evt);
            }
        });
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 143, 223, -1));

        lblDescription.setText("Elija por favor una opción para autenticidad.");
        lblDescription.setToolTipText("");
        getContentPane().add(lblDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 67, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/inventorysystemprj/images/JMGDistribucionesLogo.png"))); // NOI18N
        lblLogo.setText("jLabel9");
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 160, 80));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/inventorysystemprj/images/Background.jpg"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 340));

        jMenu1.setText("Navegación");

        menuClient.setText("Añadir Cliente");
        menuClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClientActionPerformed(evt);
            }
        });
        jMenu1.add(menuClient);

        menuKey.setText("Administración de Claves");
        menuKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKeyActionPerformed(evt);
            }
        });
        jMenu1.add(menuKey);

        menuExit.setText("Salir");
        menuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuExitMouseClicked(evt);
            }
        });
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void criptPass()
    {
        FilePrj file=new FilePrj();
        if(file.readLine("Login.csv").equals(""))
        {
           file.save("Login.csv", "Maestro;"+InventorySystemPrj.cript(masterKey));
           file.save("Login.csv", "Vendedor;"+InventorySystemPrj.cript(sellerKey));
           file.save("Login.csv", "Bodega;"+InventorySystemPrj.cript(storeKey));
        } 
    }

    
    private void changeCombo()
    {
         if(cmbChoose.getSelectedItem().toString().equals("Cliente"))
       { 
           txtPass.setText("");
           txtPass.setEnabled(false);
           btnGo.setEnabled(true);
           
       }
       else if(cmbChoose.getSelectedItem().toString().equals("Vendedor"))
       { 
          txtPass.setText("");
          txtPass.setEnabled(true);
          btnGo.setEnabled(false);
       }
       else if(cmbChoose.getSelectedItem().toString().equals("Bodega"))
       { 
 
           txtPass.setText("");
           txtPass.setEnabled(true);
           btnGo.setEnabled(false);
       }
    }
    
    private void Login()
    {
        FilePrj file=new FilePrj();
        String masterDecript=null; 
        String sellerDecript=null;
        String storeDecript=null;
   
        try
        {
             masterDecript= InventorySystemPrj.decript(InventorySystemPrj.getMasterPass()); 
             sellerDecript= InventorySystemPrj.decript(file.readLine("Vendedor.txt")); 
             storeDecript= InventorySystemPrj.decript(file.readLine("Bodega.txt")); 
        }
        catch(Exception ex){}
  
        if(cmbChoose.getSelectedItem().toString()=="Vendedor")
        {
          if(txtPass.getText().equals(masterDecript)||txtPass.getText().equals(sellerDecript))
           {
           if(txtPass.getText().equals(masterDecript)||txtPass.getText().equals(storeDecript))
            {
              SellMenu sales;
              sales=new SellMenu();
              sales.setAlwaysOnTop(true);
              sales.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
              sales.setVisible(true);
              dispose();
            }
                
            }
            else
            {
               showMessageDialog(null, "Contraseña Incorrecta para el Vendedor", "ERROR", ERROR_MESSAGE);  
               txtPass.setText("");
                btnGo.setEnabled(false);
            }
        
        }
        else if(cmbChoose.getSelectedItem().toString()=="Bodega")
        {
            if(txtPass.getText().equals(masterDecript)||txtPass.getText().equals(storeDecript))
            {
              StoreMenu store;
                try{
                   store=new StoreMenu();
                   store.setAlwaysOnTop(true);
                   store.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
                   store.setVisible(true);
                   dispose();

                } catch (Exception e){}
            }
            else
            {
               showMessageDialog(null, "Contraseña Incorrecta para el Bodeguero", "ERROR", ERROR_MESSAGE);  
               txtPass.setText("");
               btnGo.setEnabled(false);
            }
            
        }
        else if(cmbChoose.getSelectedItem().toString()=="Cliente")
        {
            try
            {
              ListProduct listProduct = new ListProduct();
              listProduct.setVisible(true);
              dispose();
              
            }catch(Exception x){}
  
        }
    }
    
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       if(cmbChoose.getSelectedItem().toString().equals("Vendedor"))
       { 
           txtPass.setEnabled(false);
       }
    }//GEN-LAST:event_formComponentShown

    private void cmbChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbChooseActionPerformed
           this.changeCombo();
    }//GEN-LAST:event_cmbChooseActionPerformed

    private void txtPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyReleased
        if(txtPass.getText().equals(""))
        {
            btnGo.setEnabled(false);
        }
        else
        {
            btnGo.setEnabled(true); 
        }       
    }//GEN-LAST:event_txtPassKeyReleased

    private void btnGoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGoMouseClicked
        Login();
    }//GEN-LAST:event_btnGoMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        criptPass();
    }//GEN-LAST:event_formWindowOpened

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        if(btnGo.isEnabled())
          Login(); 
    
     
    }//GEN-LAST:event_txtPassActionPerformed

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGoActionPerformed

    private void menuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuExitMouseClicked
          System.exit(0);
    }//GEN-LAST:event_menuExitMouseClicked

    private void menuClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClientActionPerformed
         CustomerFrame customerFrame = new CustomerFrame();
        customerFrame.setVisible(true);
     
    }//GEN-LAST:event_menuClientActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKeyActionPerformed
        PasswordFrame passwordFrame = new PasswordFrame();
        passwordFrame.setVisible(true);
    }//GEN-LAST:event_menuKeyActionPerformed

   
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGo;
    private javax.swing.JComboBox<String> cmbChoose;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblLogo;
    private java.awt.Label lblTitle;
    private javax.swing.JMenuItem menuClient;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuKey;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
