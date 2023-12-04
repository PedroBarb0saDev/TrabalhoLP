/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.text.MaskFormatter;
import bean.ClientePhsb;
import dao.Cliente_DAO;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import tools.Util;

/**
 *
 * @author U09219761190
 */
public class JDlgCliente extends javax.swing.JDialog {

    private boolean incluindo;

    private Cliente_DAO cliente_DAO;
    ClientePhsb clientePhsb;
    MaskFormatter Data_nascimento;
    MaskFormatter Data_emissao_RG;

    MaskFormatter Data_cadastro;
    MaskFormatter cpf;

    /**
     * Creates new form JDlgClienteNovoIA
     */
    public JDlgCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        setTitle("Cadastro de cliente");
        setLocationRelativeTo(null);
        clientePhsb = new ClientePhsb();
//        setVisible(true);;
        Util.habilitar(false, jTxtCodigoId, jTxtRg, jFrmtData_cadastro, jFrmtData_nascimento,
                jTxtEndereco, jTxtUltima_compra, jTxtCidade, jTxtSexo, jTxtEmail, jBtnCancelar, jBtnConfirmar, jTxtApelido, jTxtNome, jFrmtCpf, jTxtTelefone, jTxtCep, jFrmtData_emissao_RG, jTxtEstado);
        Util.habilitar(true, jBtnIncluir,
                jBtnExcluir, jBtnPesquisar);

        try {

            Data_nascimento = new MaskFormatter("##/##/####");
            Data_emissao_RG = new MaskFormatter("##/##/####");
            Data_cadastro = new MaskFormatter("##/##/####");
            cpf = new MaskFormatter("###.###.###-##");

        } catch (ParseException ex) {
            Logger.getLogger(JDlgUsuario.class.getName()).log(Level.SEVERE, null, ex);

        }
        jFrmtData_nascimento.setFormatterFactory(new DefaultFormatterFactory(Data_nascimento));
        jFrmtData_emissao_RG.setFormatterFactory(new DefaultFormatterFactory(Data_emissao_RG));
        jFrmtData_cadastro.setFormatterFactory(new DefaultFormatterFactory(Data_cadastro));
        jFrmtCpf.setFormatterFactory(new DefaultFormatterFactory(cpf));
    }

    public ClientePhsb viewBean() {
        ClientePhsb clientePhsb = new ClientePhsb();
        int id = Integer.valueOf(jTxtCodigoId.getText());
        clientePhsb.setIdclientePhsb(id);
        clientePhsb.setApelidoPhsb(jTxtApelido.getText());
        clientePhsb.setCepPhsb(jTxtCep.getText());
        clientePhsb.setCidadePhsb(jTxtCidade.getText());
        clientePhsb.setCpfPhsb(jFrmtCpf.getText());
        clientePhsb.setDataCadastroPhsb(Util.strDate(jFrmtData_cadastro.getText()));
        clientePhsb.setDataNascimentoPhsb(Util.strDate(jFrmtData_nascimento.getText()));
        clientePhsb.setDataEmissaorgPhsb(Util.strDate(jFrmtData_emissao_RG.getText()));
        clientePhsb.setEmailPhsb(jTxtEmail.getText());
        clientePhsb.setEndereco(jTxtEndereco.getText());
        clientePhsb.setEstadoPhsb(jTxtEstado.getText());
        clientePhsb.setNomePhsb(jTxtNome.getText());
        clientePhsb.setRgPhsb(jTxtRg.getText());
        clientePhsb.setSexoPhsb(jTxtSexo.getText());
        clientePhsb.setTelefonePhsb(jTxtTelefone.getText());
        clientePhsb.setUltimaCompraPhsb(jTxtUltima_compra.getText());

        return clientePhsb;
    }

    public void beanView(ClientePhsb clientePhsb) {
        String cad = String.valueOf(clientePhsb.getIdclientePhsb());
        jTxtCodigoId.setText(cad);

        jTxtApelido.setText(clientePhsb.getApelidoPhsb());
        jTxtCep.setText(clientePhsb.getCepPhsb());
        jTxtCidade.setText(clientePhsb.getCidadePhsb());
        jFrmtCpf.setText(clientePhsb.getCpfPhsb());
        jFrmtData_cadastro.setText(Util.dateStr(clientePhsb.getDataCadastroPhsb()));

        jFrmtData_nascimento.setText(Util.dateStr(clientePhsb.getDataNascimentoPhsb()));

        jFrmtData_emissao_RG.setText(Util.dateStr(clientePhsb.getDataEmissaorgPhsb()));

        jTxtEmail.setText(clientePhsb.getEmailPhsb());
        jTxtEndereco.setText(clientePhsb.getEndereco());
        jTxtEstado.setText(clientePhsb.getEstadoPhsb());

        jTxtNome.setText(clientePhsb.getNomePhsb());
        jTxtRg.setText(clientePhsb.getRgPhsb());
        jTxtSexo.setText(clientePhsb.getSexoPhsb());
        jTxtTelefone.setText(clientePhsb.getTelefonePhsb());
        jTxtUltima_compra.setText(clientePhsb.getUltimaCompraPhsb());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jFrmtCpf = new javax.swing.JFormattedTextField();
        jTxtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtApelido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jFrmtData_nascimento = new javax.swing.JFormattedTextField();
        jTxtSexo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtTelefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtRg = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTxtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTxtCidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTxtEstado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTxtCep = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jFrmtData_cadastro = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jTxtUltima_compra = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jFrmtData_emissao_RG = new javax.swing.JFormattedTextField();
        jTxtEndereco = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jBtnCancelar = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jTxtCodigoId = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("cpf");

        jLabel2.setText("apelido");

        jFrmtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFrmtCpfActionPerformed(evt);
            }
        });

        jLabel3.setText("nome");

        jLabel4.setText("data_nascimento");

        jFrmtData_nascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFrmtData_nascimentoActionPerformed(evt);
            }
        });

        jLabel5.setText("sexo");

        jLabel6.setText("telefone");

        jLabel7.setText("rg");

        jLabel8.setText("email");

        jLabel9.setText("cidade");

        jLabel10.setText("estado");

        jLabel11.setText("cep");

        jFrmtData_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFrmtData_cadastroActionPerformed(evt);
            }
        });

        jLabel12.setText("data_cadastro");

        jLabel13.setText("ultima_compra");

        jLabel14.setText("data_emissão_RG");

        jFrmtData_emissao_RG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFrmtData_emissao_RGActionPerformed(evt);
            }
        });

        jLabel15.setText("endereço");

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ok.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/alterar_1.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Excluir_1.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jLabel16.setText("Código");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTxtSexo, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFrmtCpf, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtApelido, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(146, 146, 146)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtUltima_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel14))
                                    .addComponent(jFrmtData_emissao_RG, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTxtRg, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jFrmtData_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(jTxtCodigoId, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTxtCep, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(jLabel11))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(121, 121, 121)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTxtTelefone))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(252, 252, 252))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jFrmtData_nascimento, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTxtEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(jLabel10))
                        .addGap(89, 89, 89)
                        .addComponent(jLabel15)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jFrmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTxtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jFrmtData_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(jLabel12)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jTxtCodigoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtUltima_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jFrmtData_emissao_RG, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jFrmtData_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBtnConfirmar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFrmtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFrmtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrmtCpfActionPerformed

    private void jFrmtData_nascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFrmtData_nascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrmtData_nascimentoActionPerformed

    private void jFrmtData_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFrmtData_cadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrmtData_cadastroActionPerformed

    private void jFrmtData_emissao_RGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFrmtData_emissao_RGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrmtData_emissao_RGActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(false, jTxtCodigoId, jFrmtData_cadastro, jTxtSexo, jTxtRg, jTxtNome,
                jTxtEndereco, jTxtEstado, jTxtCidade, jTxtCidade, jTxtEmail, jBtnCancelar, jBtnConfirmar);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);

        Util.limparCampos(jTxtCodigoId, jTxtCidade, jFrmtData_cadastro, jFrmtData_emissao_RG, jTxtRg, jTxtCodigoId, jFrmtData_cadastro, jTxtSexo, jTxtRg, jTxtNome,
                jTxtEndereco, jTxtEstado, jTxtCidade, jTxtCidade, jTxtEmail, jTxtEmail);

        Util.mensagem("Operação cancelada");
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
  

        if (incluindo == true) {
            Cliente_DAO cliente_DAO = new Cliente_DAO();
            clientePhsb = viewBean();
            cliente_DAO.insert(clientePhsb);

            Util.habilitar(true, jTxtCodigoId, jFrmtData_cadastro, jTxtSexo, jTxtRg, jTxtNome, jTxtEndereco, jTxtEstado, jTxtCidade, jTxtCidade, jTxtEmail, jBtnCancelar, jBtnConfirmar);
        } else {
            cliente_DAO.update(clientePhsb);
        }

        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);

        Util.limparCampos(jTxtCodigoId, jTxtCodigoId, jFrmtData_cadastro, jTxtSexo, jTxtRg, jTxtNome,
                jTxtEndereco, jTxtEstado, jTxtCidade, jTxtCidade, jTxtEmail, jTxtEmail);

        Util.habilitar(false, jTxtCodigoId, jTxtCodigoId, jFrmtData_cadastro, jTxtSexo, jTxtRg, jTxtNome,
                jTxtEndereco, jTxtEstado, jTxtCidade, jTxtCidade, jTxtEmail, jTxtEmail, jBtnCancelar, jBtnConfirmar);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed

        JDlgClientePesquisa jDlgClientePesquisa = new JDlgClientePesquisa(null, true);
        jDlgClientePesquisa.setTelaAnterior(this);
        jDlgClientePesquisa.setVisible(true);

        Util.habilitar(true, jTxtCodigoId, jTxtCodigoId, jFrmtData_cadastro, jTxtSexo, jTxtRg, jTxtNome,
                jTxtEndereco, jTxtEstado, jTxtCidade, jTxtCidade, jTxtEmail, jTxtEmail, jBtnConfirmar, jBtnIncluir);
        Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnPesquisar, jBtnCancelar);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, jTxtCodigoId, jTxtCodigoId, jFrmtData_cadastro, jTxtSexo, jTxtRg, jTxtNome,
                jTxtEndereco, jTxtEstado, jTxtCidade, jTxtCidade, jTxtEmail, jTxtEmail, jBtnCancelar, jBtnConfirmar, jTxtCep, jTxtApelido, jTxtTelefone, jFrmtData_nascimento, jFrmtData_emissao_RG, jTxtUltima_compra, jFrmtCpf);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);

        Util.limparCampos(jTxtCodigoId, jTxtCodigoId, jTxtCodigoId, jFrmtData_cadastro, jTxtSexo, jTxtRg, jTxtNome,
                jTxtEndereco, jTxtEstado, jTxtCidade, jTxtCidade, jTxtEmail, jTxtEmail);

        incluindo = true;
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, jTxtCodigoId, jTxtCodigoId, jTxtCodigoId, jFrmtData_cadastro, jTxtSexo, jTxtRg, jTxtNome,
                jTxtEndereco, jTxtEstado, jTxtCidade, jTxtCidade, jTxtEmail, jTxtEmail, jBtnCancelar, jBtnConfirmar);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        incluindo = false;
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed

        if (Util.pergunta("Deseja execluir o registro") == true) {
            clientePhsb = viewBean();
            cliente_DAO.delete(clientePhsb);
            Util.mensagem("Registro Excluido");
        } else {
            Util.mensagem("Exclusão cancelada");
        }
        Util.limparCampos(jTxtCodigoId, jTxtCodigoId, jFrmtData_cadastro, jTxtSexo, jTxtRg, jTxtNome, jTxtEndereco, jTxtEstado, jTxtCidade, jTxtCidade, jTxtEmail, jTxtEmail, jTxtEmail);
        Util.habilitar(false, jTxtCodigoId, jTxtCodigoId, jTxtCodigoId, jFrmtData_cadastro, jTxtSexo, jTxtRg, jTxtNome,
                jTxtEndereco, jTxtEstado, jTxtCidade, jTxtCidade, jTxtEmail, jTxtEmail, jBtnCancelar, jBtnConfirmar);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
    }//GEN-LAST:event_jBtnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgCliente dialog = new JDlgCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JFormattedTextField jFrmtCpf;
    private javax.swing.JFormattedTextField jFrmtData_cadastro;
    private javax.swing.JFormattedTextField jFrmtData_emissao_RG;
    private javax.swing.JFormattedTextField jFrmtData_nascimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTxtApelido;
    private javax.swing.JTextField jTxtCep;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtCodigoId;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtEndereco;
    private javax.swing.JTextField jTxtEstado;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtRg;
    private javax.swing.JTextField jTxtSexo;
    private javax.swing.JTextField jTxtTelefone;
    private javax.swing.JTextField jTxtUltima_compra;
    // End of variables declaration//GEN-END:variables
}
