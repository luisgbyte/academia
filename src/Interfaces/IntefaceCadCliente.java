/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

import Classes.*;
import static java.lang.System.console;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Gustavo
 */
public class IntefaceCadCliente extends javax.swing.JFrame {
    JFileChooser escolherFoto;
    String caminho = "";
    File arquivo = null;
    JFrame abrirFrame;
    JPanel abrirPanel;
    
    public boolean alterar;
    public boolean cancelar;
    /**
     * Creates new form interfaceCadastroCriente
     */
    public IntefaceCadCliente() {
        initComponents();
        statusCampos(false);
        
        //Mostrando lista na tabela --- tela de cliente
        for (int i = 0; i < CadastroCliente.vetCadastro.size(); i++) {
            //System.out.println(""+CadastroCliente.vetCadastro.get(i).getCaminhoFoto());
            DefaultTableModel dtm = (DefaultTableModel) JtDados.getModel();
            dtm.addRow(new Object[]{CadastroCliente.vetCadastro.get(i).getId(), CadastroCliente.vetCadastro.get(i).getNome(), CadastroCliente.vetCadastro.get(i).getDataNasc(), CadastroCliente.vetCadastro.get(i).getCpf(), CadastroCliente.vetCadastro.get(i).getRg(), CadastroCliente.vetCadastro.get(i).getTelefone(),CadastroCliente.vetCadastro.get(i).getSexo()});
        }
        
        //botão
        JbSelecinaFoto.setEnabled(false);
        JbCadastrar.setEnabled(false);
        JbAlterar.setEnabled(false);
        JbExcluir.setEnabled(false);
        alterar = false;
        cancelar = false;
        
        setResizable(false);
        //professor
        CadastroProfessor prof = new CadastroProfessor();
        for(int x = 0; x < CadastroProfessor.vetCadProfessor.size(); x++){
            JcbProfessor.addItem(CadastroProfessor.vetCadProfessor.get(x).getNome());
        }
    }
    //ativa e desativa os campos 
    public void statusCampos(boolean status){
        //campos label
        txtId.setEnabled(status);
        txtNome.setEnabled(status);
        txtDataNasc.setEnabled(status);
        txtCpf.setEnabled(status);
        txtRg.setEnabled(status);
        txtTelefone.setEnabled(status);
        //radio button
        JrbMasculino.setEnabled(status);
        JrbFeminino.setEnabled(status);
        //Jcombo Box
        JcbProfessor.setEnabled(status);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        GroupSexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JtDados = new javax.swing.JTable();
        JbCadastrar = new javax.swing.JButton();
        JbAlterar = new javax.swing.JButton();
        JbExcluir = new javax.swing.JButton();
        JbNovo = new javax.swing.JButton();
        Lid = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRg = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDataNasc = new javax.swing.JFormattedTextField();
        IbFoto = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JbSelecinaFoto = new javax.swing.JButton();
        JrbMasculino = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        JrbFeminino = new javax.swing.JRadioButton();
        JcbProfessor = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Academia");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de Aluno");

        JtDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "DATA/NASC", "CPF", "RG", "TELEFONE", "SEXO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JtDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtDadosMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JtDadosMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(JtDados);

        JbCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar.png"))); // NOI18N
        JbCadastrar.setText("Cadastrar");
        JbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbCadastrarActionPerformed(evt);
            }
        });

        JbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Editar.png"))); // NOI18N
        JbAlterar.setText("Alterar");
        JbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbAlterarActionPerformed(evt);
            }
        });

        JbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Excluir.png"))); // NOI18N
        JbExcluir.setText("Excluir");
        JbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbExcluirActionPerformed(evt);
            }
        });

        JbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Novo.png"))); // NOI18N
        JbNovo.setText("Novo");
        JbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbNovoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados cadastrais"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 65, 30, -1));

        jLabel13.setText("Id:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 45, -1, -1));

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 158, -1));

        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 106, -1, -1));

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 65, 109, -1));

        jLabel3.setText("CPF:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 45, -1, -1));

        try {
            txtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRgActionPerformed(evt);
            }
        });
        jPanel1.add(txtRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 120, 109, -1));

        jLabel6.setText("RG:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 106, -1, -1));

        jLabel9.setText("Telefone:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 150, -1, -1));

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 170, 109, -1));

        jLabel4.setText("Data Nasc.:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        try {
            txtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 76, -1));

        IbFoto.setBackground(new java.awt.Color(0, 153, 255));
        IbFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(IbFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 37, 130, 150));

        jLabel8.setText("Foto:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        JbSelecinaFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/foto.png"))); // NOI18N
        JbSelecinaFoto.setText("Selecionar Foto");
        JbSelecinaFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbSelecinaFotoActionPerformed(evt);
            }
        });
        jPanel1.add(JbSelecinaFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 198, 130, -1));

        GroupSexo.add(JrbMasculino);
        JrbMasculino.setText("Masculino");
        JrbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JrbMasculinoActionPerformed(evt);
            }
        });
        jPanel1.add(JrbMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 95, -1, -1));

        jLabel5.setText("Sexo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 48, -1, -1));

        GroupSexo.add(JrbFeminino);
        JrbFeminino.setText("Feminino");
        JrbFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JrbFemininoActionPerformed(evt);
            }
        });
        jPanel1.add(JrbFeminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 72, -1, -1));

        JcbProfessor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jPanel1.add(JcbProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 100, -1));

        jLabel7.setText("Escolha o professor:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 34, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(797, 797, 797)
                                .addComponent(Lid, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(JbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addComponent(JbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(JbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(338, 338, 338))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lid, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbExcluirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja excluir", "Atenção", JOptionPane.YES_OPTION);
        int linhasel = JtDados.getSelectedRow();
       if(opcao == JOptionPane.YES_OPTION){
           CadastroCliente.vetCadastro.remove(linhasel);
           DefaultTableModel dtm = (DefaultTableModel) JtDados.getModel();
           dtm.removeRow(linhasel);
           
            txtId.setText("");
            txtNome.setText("");
            txtDataNasc.setValue(null);
            txtCpf.setValue(null);
            txtRg.setValue(null);
            txtTelefone.setValue(null);
            JcbProfessor.setSelectedItem(null);
            IbFoto.setIcon(null);
            
           JOptionPane.showMessageDialog(rootPane, "Dados excluidos com sucesso");
           JbNovo.setText("Salvar");
           JbAlterar.setEnabled(false);
           JbExcluir.setEnabled(false);
           cancelar = false;
        }
    }//GEN-LAST:event_JbExcluirActionPerformed

    private void JbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbNovoActionPerformed
        
        if(cancelar == true){
            JbNovo.setEnabled(true);
          //  btnCadastar.setVisible(false);
            JbCadastrar.setEnabled(false);
            JbExcluir.setEnabled(false);
            JbAlterar.setEnabled(false);
            statusCampos(false);
            IbFoto.setIcon(null);
            txtId.setText("");
            txtNome.setText("");
            txtDataNasc.setValue(null);
            txtCpf.setValue(null);
            txtRg.setValue(null);
            txtTelefone.setValue(null);
            JbNovo.setText("Novo");
            JbNovo.setEnabled(true);
            JbSelecinaFoto.setEnabled(false);
            cancelar = false;
        
        }else{
        
        
            //Configurando campo ID
            txtId.setEnabled(true);
            CadastroCliente cliente = new CadastroCliente();
            int ultimaPos = cliente.vetCadastro.size() + 1;
            String id = Integer.toString(ultimaPos);
            txtId.setText(id);
            txtId.setEditable(false);
            //Fim

            //funcao para ativar os campos
            statusCampos(true);
            JbCadastrar.setText("Cadastrar");
            //botão
            JbSelecinaFoto.setEnabled(true);
            JbNovo.setEnabled(true);
            JbCadastrar.setEnabled(true);
            JbAlterar.setEnabled(false);
            JbExcluir.setEnabled(false);
            JbNovo.setText("Cancelar");
            cancelar = true;
        }
    }//GEN-LAST:event_JbNovoActionPerformed

    private void JbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbAlterarActionPerformed
        JbNovo.setEnabled(false);
          
        JbAlterar.setEnabled(false);
        JbExcluir.setEnabled(false);
        statusCampos(true);
        JbCadastrar.setText("Salvar");
        JbCadastrar.setEnabled(true);
        alterar = true;
        cancelar = true;
        JbNovo.setText("Cancelar");
        JbSelecinaFoto.setEnabled(true);

        JbNovo.setEnabled(true);
    }//GEN-LAST:event_JbAlterarActionPerformed
 
    private void JbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbCadastrarActionPerformed
        CadastroCliente cliente = new CadastroCliente();
        if( !cliente.validarCampoString(txtNome) || !cliente.validarCampoDataNasc(txtDataNasc) || !cliente.validarCpf(txtCpf) || !cliente.validarCampoVazio(txtRg) || !cliente.validarCampoVazio(txtTelefone) || !cliente.validarJcomboBox(JcbProfessor)){
            JOptionPane.showMessageDialog(null, "Campos não preenchidos ou possui caracteres inválidos!!!");
        }else{
            
            //data de cadastro do usuário
            LocalDate dataDoCadastro = LocalDate.now();
           
            //pegando radio button selecionado
            String sexo;
            if(JrbMasculino.isSelected()){
                sexo = "Masculino";
            }else{
                sexo = "Feminino";
            }
           
            //convertendo campo id para int
            int id = Integer.parseInt(txtId.getText());
           
            //status default de novo aluno: pois exige pagamento prévio
            String status = "Em dia";
            
            String nome = txtNome.getText();
            String dataNasc = txtDataNasc.getText();
            String contato = txtTelefone.getText();
            String cpf = txtCpf.getText();
            String rg = txtRg.getText();
            String nomeProfessor = JcbProfessor.getSelectedItem().toString();
            
            if(alterar  == false){
                if(caminho.equals("")){
                    caminho = "src//Imagens//padrao.jpg";
                }
                cliente.cadastrar(id, nome, dataNasc, sexo, contato, cpf, rg, dataDoCadastro, status, nomeProfessor, caminho);
                CadastroCliente.vetCadastro.add(cliente);

                DefaultTableModel dtm = (DefaultTableModel) JtDados.getModel();
                int ultimaPos = cliente.vetCadastro.size() - 1;

                // /// ///
                dtm.addRow(new Object[]{cliente.vetCadastro.get(ultimaPos).getId(), cliente.vetCadastro.get(ultimaPos).getNome(), cliente.vetCadastro.get(ultimaPos).getDataNasc(), cliente.vetCadastro.get(ultimaPos).getCpf(), cliente.vetCadastro.get(ultimaPos).getRg(), cliente.vetCadastro.get(ultimaPos).getTelefone(),cliente.vetCadastro.get(ultimaPos).getSexo()});
                JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
            }else{
                alterar = false;
                CadastroCliente.vetCadastro.get(JtDados.getSelectedRow()).setNome(nome);
                CadastroCliente.vetCadastro.get(JtDados.getSelectedRow()).setDataNasc(dataNasc);
                CadastroCliente.vetCadastro.get(JtDados.getSelectedRow()).setCpf(cpf);
                CadastroCliente.vetCadastro.get(JtDados.getSelectedRow()).setRg(rg);
                CadastroCliente.vetCadastro.get(JtDados.getSelectedRow()).setTelefone(contato);
                CadastroCliente.vetCadastro.get(JtDados.getSelectedRow()).setSexo(sexo);
                
                JtDados.setValueAt(CadastroCliente.vetCadastro.get(JtDados.getSelectedRow()).getId(), JtDados.getSelectedRow(), 0);
                JtDados.setValueAt(CadastroCliente.vetCadastro.get(JtDados.getSelectedRow()).getNome(), JtDados.getSelectedRow(), 1);
                JtDados.setValueAt(CadastroCliente.vetCadastro.get(JtDados.getSelectedRow()).getDataNasc(), JtDados.getSelectedRow(), 2);
                JtDados.setValueAt(CadastroCliente.vetCadastro.get(JtDados.getSelectedRow()).getCpf(), JtDados.getSelectedRow(), 3);
                JtDados.setValueAt(CadastroCliente.vetCadastro.get(JtDados.getSelectedRow()).getRg(), JtDados.getSelectedRow(), 4);
                JtDados.setValueAt(CadastroCliente.vetCadastro.get(JtDados.getSelectedRow()).getTelefone(), JtDados.getSelectedRow(), 5);
                JtDados.setValueAt(CadastroCliente.vetCadastro.get(JtDados.getSelectedRow()).getSexo(), JtDados.getSelectedRow(), 6);
                
                
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
                
                JbNovo.setText("Novo");
                JbNovo.setEnabled(true);
                JbCadastrar.setText("Cadastrar");
                JbCadastrar.setEnabled(false);
                statusCampos(false);
            }
            
            //Limpar todos os campos
            txtId.setText("");
            txtNome.setText("");
            txtDataNasc.setValue(null);
            txtCpf.setValue(null);
            txtRg.setValue(null);
            txtTelefone.setValue(null);
            IbFoto.setIcon(null);
            JcbProfessor.setSelectedIndex(0);

            //desativa todos os campos
            statusCampos(false);
            
            //desativar botões
            JbSelecinaFoto.setEnabled(false);
            JbNovo.setEnabled(true);
            JbNovo.setText("Novo");
            JbCadastrar.setEnabled(false);
            JbAlterar.setEnabled(false);
            JbExcluir.setEnabled(false);
           
        }
       
    }//GEN-LAST:event_JbCadastrarActionPerformed

    private void JtDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtDadosMouseClicked
        //JtDados.setEnabled(false);
    }//GEN-LAST:event_JtDadosMouseClicked

    private void JrbFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JrbFemininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JrbFemininoActionPerformed

    private void JbSelecinaFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbSelecinaFotoActionPerformed
        // TODO add your handling code here:
        escolherFoto = new JFileChooser();
        escolherFoto.setFileFilter(new FileNameExtensionFilter("Arquivos de imagem", "jpg"));
        int retorno = escolherFoto.showSaveDialog(null);
        if (retorno == JFileChooser.APPROVE_OPTION) {
            caminho = escolherFoto.getSelectedFile().getAbsolutePath();
        }
        
        System.out.println("Caminho: "+caminho);
        if (!caminho.equals("")) {
            arquivo = new File(caminho.toString().replace("\\", "/"));
            } else {
                try {
                    throw new FileNotFoundException();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(IntefaceCadCliente.class
                        .getName()).log(Level.SEVERE, null, ex);
                }
            }
            try {
                BufferedImage fotoBuff = ImageIO.read(new File(arquivo.getAbsolutePath().replace("\\", "/")));
                    Image foto = fotoBuff.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                    IbFoto.setIcon(new ImageIcon(foto));
    
                } catch (IOException ex) {
                    Logger.getLogger(IntefaceCadCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_JbSelecinaFotoActionPerformed

    public void carregarFoto(int posSelVetor){
        
        
            caminho = CadastroCliente.vetCadastro.get(posSelVetor).getCaminhoFoto();
//carregar foto
           // caminho = "C:\\Users\\Aluno\\Desktop\\Bolsonaro17.jpg";
         System.out.println("Caminho: "+caminho);
        if (!caminho.equals("")) {
            arquivo = new File(caminho.toString().replace("\\", "/"));
            } else {
                try {
                    throw new FileNotFoundException();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(IntefaceCadCliente.class
                        .getName()).log(Level.SEVERE, null, ex);
                }
            }
            try {
                BufferedImage fotoBuff = ImageIO.read(new File(arquivo.getAbsolutePath().replace("\\", "/")));
                    Image foto = fotoBuff.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                    IbFoto.setIcon(new ImageIcon(foto));
    
                } catch (IOException ex) {
                    Logger.getLogger(IntefaceCadCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
        
    }
    
    private void txtRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRgActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed
    
  
    private void JtDadosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtDadosMouseReleased
        if(JtDados.getSelectedRow() != -1){
            txtId.setText(JtDados.getValueAt(JtDados.getSelectedRow(), 0).toString());
            txtNome.setText(JtDados.getValueAt(JtDados.getSelectedRow(), 1).toString());
            txtDataNasc.setText(JtDados.getValueAt(JtDados.getSelectedRow(), 2).toString());
            txtCpf.setText(JtDados.getValueAt(JtDados.getSelectedRow(), 3).toString());
            txtRg.setText(JtDados.getValueAt(JtDados.getSelectedRow(), 4).toString());
            txtTelefone.setText(JtDados.getValueAt(JtDados.getSelectedRow(), 5).toString());
            if(JrbFeminino.isSelected()){
                JrbFeminino.setText(JtDados.getValueAt(JtDados.getSelectedRow(), 6).toString());
            }else{
                JrbMasculino.setText(JtDados.getValueAt(JtDados.getSelectedRow(), 6).toString());
            }
            int posicao = Integer.parseInt(txtId.getText()) -1;
            System.out.println("pisicao: "+posicao);
            carregarFoto(posicao);
           
            JbAlterar.setEnabled(true);
            JbExcluir.setEnabled(true);
            statusCampos(false);
            JbCadastrar.setEnabled(false);
            JbNovo.setEnabled(true);
            JbNovo.setText("Cancelar");
            cancelar = true;
            
      
        }
    }//GEN-LAST:event_JtDadosMouseReleased

    private void JrbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JrbMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JrbMasculinoActionPerformed

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
            java.util.logging.Logger.getLogger(IntefaceCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntefaceCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntefaceCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntefaceCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntefaceCadCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupSexo;
    private javax.swing.JLabel IbFoto;
    private javax.swing.JButton JbAlterar;
    private javax.swing.JButton JbCadastrar;
    private javax.swing.JButton JbExcluir;
    private javax.swing.JButton JbNovo;
    private javax.swing.JButton JbSelecinaFoto;
    private javax.swing.JComboBox<String> JcbProfessor;
    private javax.swing.JRadioButton JrbFeminino;
    private javax.swing.JRadioButton JrbMasculino;
    private javax.swing.JTable JtDados;
    private javax.swing.JLabel Lid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtDataNasc;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtRg;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
