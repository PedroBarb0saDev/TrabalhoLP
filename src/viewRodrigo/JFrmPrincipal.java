/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;



import view.JFrmLogin;
/**
 *
 * @author u07329163139
 */
public class JFrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JRrmPrincipal
     */
    public JFrmPrincipal() {
        initComponents();
        setTitle("Sistema de compra");
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
         JFrmLogin jFrmLogin = new JFrmLogin();
      jFrmLogin.dispose();
      
        
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMnuUsuarios = new javax.swing.JMenuItem();
        jMnuProduto = new javax.swing.JMenuItem();
        jMnuFuncionario = new javax.swing.JMenuItem();
        jMnuFornecedor = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMnuCadastroFuncionario = new javax.swing.JMenuItem();
        jMnuCadastroProduto = new javax.swing.JMenuItem();
        jMnuSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMnuCompras = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setMnemonic('c');
        jMenu1.setText("Cadastros");

        jMnuUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMnuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente_1.png"))); // NOI18N
        jMnuUsuarios.setMnemonic('u');
        jMnuUsuarios.setText("Usuários");
        jMnuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuUsuarios);

        jMnuProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMnuProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/livro-alcorao.png"))); // NOI18N
        jMnuProduto.setMnemonic('l');
        jMnuProduto.setText("Produto");
        jMnuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuProduto);

        jMnuFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMnuFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pessoas-carregam-caixa.png"))); // NOI18N
        jMnuFuncionario.setText("Funcionario");
        jMnuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuFuncionario);

        jMnuFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMnuFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/elevador.png"))); // NOI18N
        jMnuFornecedor.setText("Fornecedor");
        jMnuFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuFornecedorActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuFornecedor);
        jMenu1.add(jSeparator1);

        jMnuCadastroFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMnuCadastroFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pessoas-carregam-caixa.png"))); // NOI18N
        jMnuCadastroFuncionario.setText("Cadastro de Funcionario");
        jMnuCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuCadastroFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuCadastroFuncionario);

        jMnuCadastroProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        jMnuCadastroProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/livro-alcorao.png"))); // NOI18N
        jMnuCadastroProduto.setText("Cadastro de Produto");
        jMnuCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuCadastroProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuCadastroProduto);

        jMnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jMnuSair.setMnemonic('s');
        jMnuSair.setText("Sair");
        jMnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic('m');
        jMenu2.setText("Movimentos");

        jMnuCompras.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMnuCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/etiqueta-de-venda.png"))); // NOI18N
        jMnuCompras.setText("Compras");
        jMnuCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuComprasActionPerformed(evt);
            }
        });
        jMenu2.add(jMnuCompras);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 206, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuUsuariosActionPerformed
        // TODO add your handling code here:
        JDlgUsuario  JDlgUsuario  = new JDlgUsuario(this, true);
        JDlgUsuario.setVisible(true);
           
    }//GEN-LAST:event_jMnuUsuariosActionPerformed

    private void jMnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMnuSairActionPerformed

    private void jMnuComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuComprasActionPerformed
     JDlgCompra  JDlgCompra   = new JDlgCompra (this, true);
        JDlgCompra .setVisible(true);
    }//GEN-LAST:event_jMnuComprasActionPerformed

    private void jMnuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuProdutoActionPerformed
        // TODO add your handling code here:
         JDlgProduto  JDlgProduto  = new JDlgProduto (this, true);
        JDlgProduto.setVisible(true);
    }//GEN-LAST:event_jMnuProdutoActionPerformed

    private void jMnuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuFuncionarioActionPerformed
        // TODO add your handling code here:
           JDlgFuncionario JDlgFuncionario  = new JDlgFuncionario (this, true);
        JDlgFuncionario.setVisible(true);
    }//GEN-LAST:event_jMnuFuncionarioActionPerformed

    private void jMnuFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuFornecedorActionPerformed
        // TODO add your handling code here:
       JDlgFornecedor JDlgFornecedor   = new JDlgFornecedor (this, true);
        JDlgFornecedor.setVisible(true); 
        
    }//GEN-LAST:event_jMnuFornecedorActionPerformed

    private void jMnuCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuCadastroProdutoActionPerformed
        // TODO add your handling code here:
        
        JDlgProdutoNovo JDlgProdutoNovo = new JDlgProdutoNovo (this, true);
        JDlgProdutoNovo.setVisible(true);
    }//GEN-LAST:event_jMnuCadastroProdutoActionPerformed

    private void jMnuCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuCadastroFuncionarioActionPerformed
        // TODO add your handling code here:
         JDlgFuncionarioNovo JDlgFuncionarioNovo = new JDlgFuncionarioNovo (this, true);
        JDlgFuncionarioNovo.setVisible(true);
    }//GEN-LAST:event_jMnuCadastroFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMnuCadastroFuncionario;
    private javax.swing.JMenuItem jMnuCadastroProduto;
    private javax.swing.JMenuItem jMnuCompras;
    private javax.swing.JMenuItem jMnuFornecedor;
    private javax.swing.JMenuItem jMnuFuncionario;
    private javax.swing.JMenuItem jMnuProduto;
    private javax.swing.JMenuItem jMnuSair;
    private javax.swing.JMenuItem jMnuUsuarios;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}