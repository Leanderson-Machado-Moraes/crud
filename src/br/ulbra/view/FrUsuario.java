/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import br.ulbra.dao.UsuarioDao;
import br.ulbra.entity.Usuario;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author s.lucas
 */
public class FrUsuario extends javax.swing.JFrame {

    /**
     * Creates new form FrUsuario
     */
    public FrUsuario() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        controlarBtn(1);
        edCod.setEnabled(false);
        readJTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbUsuario = new javax.swing.JTable();
        edPesquisar = new javax.swing.JTextField();
        pnCad = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        edCep = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edCod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        edEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rbMasc = new javax.swing.JRadioButton();
        rbFem = new javax.swing.JRadioButton();
        rbOut = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        edSenha2 = new javax.swing.JPasswordField();
        edFone = new javax.swing.JFormattedTextField();
        btCep = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        edSenha1 = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        edLogr = new javax.swing.JTextField();
        edBairro = new javax.swing.JTextField();
        edCity = new javax.swing.JTextField();
        edEstado = new javax.swing.JTextField();
        edNumberHouse = new javax.swing.JTextField();
        edNome = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnPesquisa = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnFiltro = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de usuarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        tbUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "C??digo", "Nome", "Email", "Senha", "Telefone", "Sexo", "CEP", "Logradouro", "Bairro", "Cidade", "Estado", "N??mero"
            }
        ));
        tbUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUsuarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbUsuario);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 600, 90));

        edPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(edPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 289, -1));

        pnCad.setBackground(new java.awt.Color(0, 102, 102));
        pnCad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 2));
        pnCad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnCadMouseClicked(evt);
            }
        });
        pnCad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Nome:");
        pnCad.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        edCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edCepActionPerformed(evt);
            }
        });
        pnCad.add(edCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 150, 30));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel2.setText("C??digo:");
        pnCad.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 30));

        edCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edCodActionPerformed(evt);
            }
        });
        pnCad.add(edCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 150, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel4.setText("E-mail:");
        pnCad.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, 30));
        pnCad.add(edEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 150, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Telefone:");
        pnCad.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, 30));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Sexo:");
        pnCad.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        rbMasc.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(rbMasc);
        rbMasc.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        rbMasc.setSelected(true);
        rbMasc.setText("Masculino");
        rbMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMascActionPerformed(evt);
            }
        });
        pnCad.add(rbMasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));

        rbFem.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(rbFem);
        rbFem.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        rbFem.setText("Feminino");
        rbFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemActionPerformed(evt);
            }
        });
        pnCad.add(rbFem, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 80, -1));

        rbOut.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(rbOut);
        rbOut.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        rbOut.setText("Outros");
        rbOut.setBorder(null);
        pnCad.add(rbOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 80, 20));

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel9.setText("senha:");
        pnCad.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel10.setText("conf. senha:");
        pnCad.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 90, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel7.setText("Op????es:");
        pnCad.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, -1, -1));

        btnAlterar.setBackground(new java.awt.Color(255, 51, 255));
        btnAlterar.setForeground(new java.awt.Color(51, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        pnCad.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, -1, -1));

        btnSalvar.setBackground(new java.awt.Color(255, 51, 255));
        btnSalvar.setForeground(new java.awt.Color(51, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        pnCad.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, -1, -1));

        btnExcluir.setBackground(new java.awt.Color(255, 51, 255));
        btnExcluir.setForeground(new java.awt.Color(51, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        pnCad.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, -1, -1));
        pnCad.add(edSenha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 150, 30));

        try {
            edFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)# ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edFone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edFoneActionPerformed(evt);
            }
        });
        pnCad.add(edFone, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 150, 30));

        btCep.setText("...");
        btCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCepActionPerformed(evt);
            }
        });
        btCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btCepKeyReleased(evt);
            }
        });
        pnCad.add(btCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 30, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("CEP:");
        pnCad.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 30, 20));

        edSenha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edSenha1ActionPerformed(evt);
            }
        });
        pnCad.add(edSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 150, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("LOGRA.:");
        pnCad.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("BAIRRO:");
        pnCad.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("ESTADO:");
        pnCad.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("N??MERO CASA:");
        pnCad.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("CIDADE:");
        pnCad.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        edLogr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edLogrActionPerformed(evt);
            }
        });
        pnCad.add(edLogr, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 150, 30));

        edBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edBairroActionPerformed(evt);
            }
        });
        pnCad.add(edBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 150, 30));

        edCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edCityActionPerformed(evt);
            }
        });
        pnCad.add(edCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 150, 30));

        edEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edEstadoActionPerformed(evt);
            }
        });
        pnCad.add(edEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 150, 30));

        edNumberHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edNumberHouseActionPerformed(evt);
            }
        });
        pnCad.add(edNumberHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 150, 30));

        edNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edNomeActionPerformed(evt);
            }
        });
        pnCad.add(edNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 150, 30));

        jPanel1.add(pnCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 680, 270));

        btnNovo.setBackground(new java.awt.Color(255, 51, 255));
        btnNovo.setForeground(new java.awt.Color(102, 255, 255));
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, 30));

        btnPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/103857_glass_search_magnifying_find_icon.png"))); // NOI18N
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Pesquisar:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        btnFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordem Crescente", "Ordem Descrescente", "Cidade", "Estado", "Telefone" }));
        btnFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltroActionPerformed(evt);
            }
        });
        jPanel1.add(btnFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edCepActionPerformed

    private void edPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edPesquisarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        Usuario u = new Usuario();
        try {
            UsuarioDao ud = new UsuarioDao();
            u.setNomeUsu(edNome.getText());
            u.setEmailUsu(edEmail.getText());
            u.setSenhaUsu(edSenha1.getText());
            u.setFoneUsu(edFone.getText());
            u.setCep(edCep.getText());
            u.setLogradouro(edLogr.getText());
            u.setBairro(edBairro.getText());
            u.setCidade(edCity.getText());
            u.setEstado(edEstado.getText());
            u.setNumero(edNumberHouse.getText());

            if (rbMasc.isSelected()) {
                u.setSexoUsu(1);
            } else if (rbFem.isSelected()) {
                u.setSexoUsu(2);
            } else {
                u.setSexoUsu(3);
            }

            if (edSenha1.getText().equals(edSenha2.getText())) {
                u.setIdUsu(Integer.parseInt(edCod.getText()));
                ud.update(u);
                readJTable();
                controlarBtn(1);
            } else {
                JOptionPane.showMessageDialog(null,
                        " Voc?? inseriu senhas diferentes!"
                );
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: "
                    + e.getMessage());

        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void edCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edCodActionPerformed

    private void rbFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFemActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        Usuario u = new Usuario();
        try {
            UsuarioDao ud = new UsuarioDao();
            u.setNomeUsu(edNome.getText());
            u.setEmailUsu(edEmail.getText());
            u.setSenhaUsu(edSenha1.getText());
            u.setFoneUsu(edFone.getText());
            u.setCep(edCep.getText());
            u.setLogradouro(edLogr.getText());
            u.setBairro(edBairro.getText());
            u.setCidade(edCity.getText());
            u.setEstado(edEstado.getText());
            u.setNumero(edNumberHouse.getText());

            if (rbMasc.isSelected()) {
                u.setSexoUsu(1);
            } else if (rbFem.isSelected()) {
                u.setSexoUsu(2);
            } else {
                u.setSexoUsu(3);
            }
            if (edSenha1.getText().equals(edSenha2.getText())) {
                ud.create(u);
                readJTable();
            } else {
                JOptionPane.showMessageDialog(null, "As senhas n??o coincidem!");

            }

        } catch (SQLException ex) {
            Logger.getLogger(FrUsuario.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Usuario u = new Usuario();
        try {
            UsuarioDao ud = new UsuarioDao();
            if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir esse registro?",
                    "Excluir registro", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                u.setIdUsu(Integer.parseInt(edCod.getText()));
                ud.delete(u);
                readJTable();
                controlarBtn(1);
            } else {
                JOptionPane.showMessageDialog(null, "Exclus??o cancelada com sucesso!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());

        }

    }//GEN-LAST:event_btnExcluirActionPerformed
    public void controlarBtn(int op) {
        switch (op) {
            case 1:
                pnCad.setVisible(false);
                btnSalvar.setEnabled(true);
                break;
            case 2:
                pnCad.setVisible(true);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
                break;
            case 3:
                pnCad.setVisible(true);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
                btnSalvar.setEnabled(false
                );
                break;
        }
        this.pack();
    }

    public void readJTable() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) tbUsuario.getModel();
        modelo.setNumRows(0);
        UsuarioDao udao = new UsuarioDao();
        for (Usuario p : udao.read()) {
            modelo.addRow(new Object[]{
                p.getIdUsu(),
                p.getNomeUsu(),
                p.getEmailUsu(),
                p.getSenhaUsu(),
                p.getFoneUsu(),
                p.getSexoUsu(),
                p.getCep(),
                p.getLogradouro(),
                p.getBairro(),
                p.getCidade(),
                p.getEstado(),
                p.getNumero()
            });
        }
    }

    public void readJTableForDesc(String nome, int tipo) throws SQLException {
        DefaultTableModel modelo
                = (DefaultTableModel) tbUsuario.getModel();
        modelo.setNumRows(0);
        UsuarioDao pdao = new UsuarioDao();
        for (Usuario p : pdao.readForDesc(nome, tipo)) {
            modelo.addRow(new Object[]{
                p.getIdUsu(),
                p.getNomeUsu(),
                p.getEmailUsu(),
                p.getSenhaUsu(),
                p.getFoneUsu(),
                p.getSexoUsu(),
                p.getCep(),
                p.getLogradouro(),
                p.getBairro(),
                p.getCidade(),
                p.getEstado(),
                p.getNumero()
            });
        }
    }

    public void buscarCep(String cep) {
        String json;

        try {
            URL url = new URL("http://viacep.com.br/ws/" + cep + "/json");
            URLConnection urlConnection = url.openConnection();
            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            StringBuilder jsonSb = new StringBuilder();

            br.lines().forEach(I -> jsonSb.append(I.trim()));
            json = jsonSb.toString();

            json = json.replaceAll("[{},:]", "");
            json = json.replaceAll("\"", "\n");
            String array[] = new String[30];
            array = json.split("\n");
            String logradouro = array[7];
            String bairro = array[15];
            String cidade = array[19];
            String estado = array[23];
            edLogr.setText(logradouro);
            edBairro.setText(bairro);
            edCity.setText(cidade);
            edEstado.setText(estado);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e.getMessage());

        }
    }
    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed

        try {
            int tipo = 0;
            switch (btnFiltro.getSelectedIndex()) {
                case 0:
                    tipo = 0;
                    break;
                case 1:
                    tipo = 1;
                    break;
                case 2:
                    tipo = 2;
                    break;
                case 3:
                    tipo = 3;
                    break;
                case 4:
                    tipo = 4;

            }
            if (tipo == 0 || tipo == 1) {
                ordem(edPesquisar.getText(), tipo);

            } else if (tipo == 2) {
                FCidade(edPesquisar.getText(), tipo);

            } else if (tipo == 3) {
                FEstado(edPesquisar.getText(), tipo);

            } else if (tipo == 4) {
                FTelefone(edPesquisar.getText(), tipo);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
        }
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        controlarBtn(2);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void pnCadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnCadMouseClicked

    }//GEN-LAST:event_pnCadMouseClicked

    private void rbMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMascActionPerformed

    private void tbUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuarioMouseClicked
        Usuario u = new Usuario();
        controlarBtn(3);
        if (tbUsuario.getSelectedRow() != -1) {
            edCod.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 0).toString());
            edNome.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 1).toString());
            edEmail.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 2).toString());
            edSenha1.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 3).toString());
            edSenha2.setText(edSenha1.getText());
            edFone.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 4).toString());
            int s = (int) tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 5);
            edCep.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 6).toString());
            edLogr.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 7).toString());
            edBairro.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 8).toString());
            edCity.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 9).toString());
            edEstado.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 10).toString());
            edNumberHouse.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 11).toString());

            if (s == 1) {
                rbMasc.setSelected(true);
            } else if (s == 2) {
                rbFem.setSelected(true);
            } else {
                rbOut.setSelected(true);

            }
            //
        }
    }//GEN-LAST:event_tbUsuarioMouseClicked

    private void edFoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edFoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edFoneActionPerformed

    private void edSenha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edSenha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edSenha1ActionPerformed

    private void edLogrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edLogrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edLogrActionPerformed

    private void edBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edBairroActionPerformed

    private void edCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edCityActionPerformed

    private void edEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edEstadoActionPerformed

    private void edNumberHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edNumberHouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edNumberHouseActionPerformed

    private void edNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edNomeActionPerformed

    private void btCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCepActionPerformed
        buscarCep(edCep.getText());
    }//GEN-LAST:event_btCepActionPerformed

    private void btCepKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btCepKeyReleased
        edLogr.setText("Aguarde...");
        if (edCep.getText().length() == 8) {
            buscarCep(edCep.getText());
        }

    }//GEN-LAST:event_btCepKeyReleased

    private void btnFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroActionPerformed

    }//GEN-LAST:event_btnFiltroActionPerformed
    public void ordem(String nome, int tipo) throws SQLException {
        DefaultTableModel modelo
                = (DefaultTableModel) tbUsuario.getModel();
        modelo.setNumRows(0);
        UsuarioDao pdao = new UsuarioDao();
        for (Usuario p : pdao.ordemDandC(nome, tipo)) {
            modelo.addRow(new Object[]{
                p.getIdUsu(),
                p.getNomeUsu(),
                p.getEmailUsu(),
                p.getSenhaUsu(),
                p.getFoneUsu(),
                p.getSexoUsu(),
                p.getCep(),
                p.getLogradouro(),
                p.getBairro(),
                p.getCidade(),
                p.getEstado(),
                p.getNumero()
            });
        }
    }

    public void FCidade(String nome, int tipo) throws SQLException {
        DefaultTableModel modelo
                = (DefaultTableModel) tbUsuario.getModel();
        modelo.setNumRows(0);
        UsuarioDao pdao = new UsuarioDao();
        for (Usuario p : pdao.filtroCidade(nome, tipo)) {
            modelo.addRow(new Object[]{
                p.getIdUsu(),
                p.getNomeUsu(),
                p.getEmailUsu(),
                p.getSenhaUsu(),
                p.getFoneUsu(),
                p.getSexoUsu(),
                p.getCep(),
                p.getLogradouro(),
                p.getBairro(),
                p.getCidade(),
                p.getEstado(),
                p.getNumero()
            });
        }
    }

    public void FEstado(String nome, int tipo) throws SQLException {
        DefaultTableModel modelo
                = (DefaultTableModel) tbUsuario.getModel();
        modelo.setNumRows(0);
        UsuarioDao pdao = new UsuarioDao();
        for (Usuario p : pdao.filtroEstado(nome, tipo)) {
            modelo.addRow(new Object[]{
                p.getIdUsu(),
                p.getNomeUsu(),
                p.getEmailUsu(),
                p.getSenhaUsu(),
                p.getFoneUsu(),
                p.getSexoUsu(),
                p.getCep(),
                p.getLogradouro(),
                p.getBairro(),
                p.getCidade(),
                p.getEstado(),
                p.getNumero()
            });
        }
    }

    public void FTelefone(String nome, int tipo) throws SQLException {
        DefaultTableModel modelo
                = (DefaultTableModel) tbUsuario.getModel();
        modelo.setNumRows(0);
        UsuarioDao pdao = new UsuarioDao();
        for (Usuario p : pdao.filtroTelefone(nome, tipo)) {
            modelo.addRow(new Object[]{
                p.getIdUsu(),
                p.getNomeUsu(),
                p.getEmailUsu(),
                p.getSenhaUsu(),
                p.getFoneUsu(),
                p.getSexoUsu(),
                p.getCep(),
                p.getLogradouro(),
                p.getBairro(),
                p.getCidade(),
                p.getEstado(),
                p.getNumero()
            });
        }
    }

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
            java.util.logging.Logger.getLogger(FrUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrUsuario().setVisible(true);

                } catch (SQLException ex) {
                    Logger.getLogger(FrUsuario.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCep;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<String> btnFiltro;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField edBairro;
    private javax.swing.JTextField edCep;
    private javax.swing.JTextField edCity;
    private javax.swing.JTextField edCod;
    private javax.swing.JTextField edEmail;
    private javax.swing.JTextField edEstado;
    private javax.swing.JFormattedTextField edFone;
    private javax.swing.JTextField edLogr;
    private javax.swing.JTextField edNome;
    private javax.swing.JTextField edNumberHouse;
    private javax.swing.JTextField edPesquisar;
    private javax.swing.JPasswordField edSenha1;
    private javax.swing.JPasswordField edSenha2;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnCad;
    private javax.swing.JRadioButton rbFem;
    private javax.swing.JRadioButton rbMasc;
    private javax.swing.JRadioButton rbOut;
    private javax.swing.JTable tbUsuario;
    // End of variables declaration//GEN-END:variables
}
