/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.*;
import static Classes.CadastroCliente.vetCadastro;
import Classes.CadastroProfessor;
import static Classes.CadastroProfessor.vetCadProfessor;
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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gustavo
 */
public class InterfaceCadProfessor extends javax.swing.JFrame {
    public boolean alterar;
    public boolean cancelar;
    
    JFileChooser escolherFoto;
    String caminho = "";
    File arquivo = null;
    JFrame abrirFrame;
    JPanel abrirPanel;
    /**
     * Creates new form InterfaceCadProfessor
     */
    public InterfaceCadProfessor() {
        initComponents();
        for (int i = 0; i < CadastroProfessor.vetCadProfessor.size(); i++) {
            //System.out.println(""+CadastroCliente.vetCadastro.get(i).getCaminhoFoto());
            DefaultTableModel dtm = (DefaultTableModel) jTableProfessor.getModel();         
            dtm.addRow(new Object[]{CadastroProfessor.vetCadProfessor.get(i).getId(), CadastroProfessor.vetCadProfessor.get(i).getNome(), CadastroProfessor.vetCadProfessor.get(i).getDataNasc(), CadastroProfessor.vetCadProfessor.get(i).getCpf(), CadastroProfessor.vetCadProfessor.get(i).getRg(), CadastroProfessor.vetCadProfessor.get(i).getTelefone(), CadastroProfessor.vetCadProfessor.get(i).getSexo()});
        }
        
        //botao
        JbNovo.setEnabled(true);
        JbCadastrar.setEnabled(false);
        JbAlterar.setEnabled(false);
        JbExcluir.setEnabled(false);
        
        //JRadioBox
        JrbMasculino.setEnabled(false);
        JrbFeminino.setEnabled(false);
        
        //desativar campos
        statusCampos(false);
        txtId.setEnabled(false);
        alterar = false;
        cancelar = false;
        
    }

    public void statusCampos(boolean status){
        //campos label
        
        txtNome.setEnabled(status);
        txtDataNasc.setEnabled(status);
        txtCpf.setEnabled(status);
        txtRg.setEnabled(status);
        txtTelefone.setEnabled(status);
        jbFoto.setEnabled(status);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDataNasc = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        JrbFeminino = new javax.swing.JRadioButton();
        JrbMasculino = new javax.swing.JRadioButton();
        txtRg = new javax.swing.JFormattedTextField();
        lbFoto = new javax.swing.JLabel();
        jbFoto = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProfessor = new javax.swing.JTable();
        JbExcluir = new javax.swing.JButton();
        JbAlterar = new javax.swing.JButton();
        JbCadastrar = new javax.swing.JButton();
        JbNovo = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Academia");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        jLabel3.setText("Data Nasc");

        try {
            txtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setText("RG");

        jLabel6.setText("Contato");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setText("Sexo:");

        GroupSexo.add(JrbFeminino);
        JrbFeminino.setText("Feminino");
        JrbFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JrbFemininoActionPerformed(evt);
            }
        });

        GroupSexo.add(JrbMasculino);
        JrbMasculino.setText("Masculino");

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

        lbFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbFoto.setText("Selecionar Foto");
        jbFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFotoActionPerformed(evt);
            }
        });

        jLabel8.setText("Foto:");

        jLabel10.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(jLabel4))
                        .addComponent(jLabel2)
                        .addComponent(txtCpf)
                        .addComponent(txtDataNasc)
                        .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JrbFeminino)
                    .addComponent(JrbMasculino)
                    .addComponent(jLabel7))
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(lbFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                .addGap(101, 101, 101))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(JrbFeminino, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(30, 30, 30)
                                        .addComponent(JrbMasculino)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jbFoto))
        );

        jTableProfessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "DATA DE NASC", "CPF", "RG", "CONTATO", "SEXO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProfessorMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableProfessorMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProfessor);

        JbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Excluir.png"))); // NOI18N
        JbExcluir.setText("Excluir");
        JbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbExcluirActionPerformed(evt);
            }
        });

        JbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Editar.png"))); // NOI18N
        JbAlterar.setText("Alterar");
        JbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbAlterarActionPerformed(evt);
            }
        });

        JbCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar.png"))); // NOI18N
        JbCadastrar.setText("Cadastrar");
        JbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbCadastrarActionPerformed(evt);
            }
        });

        JbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Novo.png"))); // NOI18N
        JbNovo.setText("Novo");
        JbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbNovoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Cadastro de Professor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(245, 245, 245))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(JbNovo)
                .addGap(123, 123, 123)
                .addComponent(JbCadastrar)
                .addGap(177, 177, 177)
                .addComponent(JbAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JbExcluir)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel9)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JbNovo)
                        .addComponent(JbCadastrar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JbExcluir)
                        .addComponent(JbAlterar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbCadastrarActionPerformed
        CadastroProfessor prof = new CadastroProfessor();
        if( !prof.validarCampoString(txtNome) || !prof.validarCampoDataNasc(txtDataNasc) || !prof.validarCpf(txtCpf) || !prof.validarCampoVazio(txtRg) || !prof.validarCampoVazio(txtTelefone)){
            JOptionPane.showMessageDialog(null, "Campos não preenchidos ou possui caracteres inválidos!!!");
        }else{
            int id = Integer.parseInt(txtId.getText());
            String nome = txtNome.getText();
            String dataNasc = txtDataNasc.getText();
            String cpf = txtCpf.getText();
            String rg = txtRg.getText();
           
            String contato = txtTelefone.getText();
            String sexo;
            
            if(JrbMasculino.isSelected()){
                sexo = "Masculino";
            }else{
                sexo = "Feminino";
            }
            
             if(alterar == false){
                if(caminho.equals("")){
                    caminho = "src//Imagens//padrao.jpg";
                }
                CadastroProfessor cadProfessor = new CadastroProfessor();
                cadProfessor.cadastrar(id, nome, dataNasc, sexo, contato, cpf, rg, caminho);
                
                CadastroProfessor.vetCadProfessor.add(cadProfessor);

                DefaultTableModel dtm = (DefaultTableModel) jTableProfessor.getModel();
                int ultimaPos = CadastroProfessor.vetCadProfessor.size()-1;
                dtm.addRow(new Object[]{CadastroProfessor.vetCadProfessor.get(ultimaPos).getId(), CadastroProfessor.vetCadProfessor.get(ultimaPos).getNome(), CadastroProfessor.vetCadProfessor.get(ultimaPos).getDataNasc(), CadastroProfessor.vetCadProfessor.get(ultimaPos).getCpf(), CadastroProfessor.vetCadProfessor.get(ultimaPos).getRg(), CadastroProfessor.vetCadProfessor.get(ultimaPos).getTelefone(), CadastroProfessor.vetCadProfessor.get(ultimaPos).getSexo()});
                
                statusCampos(false);
                //botao
                JbNovo.setEnabled(true);
                JbCadastrar.setEnabled(false);
                JbAlterar.setEnabled(false);
                JbExcluir.setEnabled(false);
                
                //JRadioBox
                JrbMasculino.setEnabled(false);
                JrbFeminino.setEnabled(false);
                
                JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
            }else{
                alterar = false;
                CadastroProfessor.vetCadProfessor.get(jTableProfessor.getSelectedRow()).setId(id);
                CadastroProfessor.vetCadProfessor.get(jTableProfessor.getSelectedRow()).setNome(nome);
                CadastroProfessor.vetCadProfessor.get(jTableProfessor.getSelectedRow()).setCpf(cpf);
                CadastroProfessor.vetCadProfessor.get(jTableProfessor.getSelectedRow()).setRg(rg);
                CadastroProfessor.vetCadProfessor.get(jTableProfessor.getSelectedRow()).setDataNasc(dataNasc); 
                CadastroProfessor.vetCadProfessor.get(jTableProfessor.getSelectedRow()).setTelefone(contato);
                CadastroProfessor.vetCadProfessor.get(jTableProfessor.getSelectedRow()).setSexo(sexo);

                jTableProfessor.setValueAt(CadastroProfessor.vetCadProfessor.get(jTableProfessor.getSelectedRow()).getId(), jTableProfessor.getSelectedRow(), 0);
                jTableProfessor.setValueAt(CadastroProfessor.vetCadProfessor.get(jTableProfessor.getSelectedRow()).getNome(), jTableProfessor.getSelectedRow(), 1);
                jTableProfessor.setValueAt(CadastroProfessor.vetCadProfessor.get(jTableProfessor.getSelectedRow()).getDataNasc(), jTableProfessor.getSelectedRow(), 2);
                jTableProfessor.setValueAt(CadastroProfessor.vetCadProfessor.get(jTableProfessor.getSelectedRow()).getCpf(), jTableProfessor.getSelectedRow(), 3);
                jTableProfessor.setValueAt(CadastroProfessor.vetCadProfessor.get(jTableProfessor.getSelectedRow()).getRg(), jTableProfessor.getSelectedRow(), 4);
                jTableProfessor.setValueAt(CadastroProfessor.vetCadProfessor.get(jTableProfessor.getSelectedRow()).getTelefone(), jTableProfessor.getSelectedRow(), 5); 
                if(JrbMasculino.isSelected()){
                    jTableProfessor.setValueAt(CadastroProfessor.vetCadProfessor.get(jTableProfessor.getSelectedRow()).getSexo(), jTableProfessor.getSelectedRow(), 6);
                }else{
                    jTableProfessor.setValueAt(CadastroProfessor.vetCadProfessor.get(jTableProfessor.getSelectedRow()).getSexo(), jTableProfessor.getSelectedRow(), 6);
                }
                
                
                JbNovo.setText("Novo");
                JbNovo.setEnabled(true);
                JbCadastrar.setText("Cadastrar");
                JbCadastrar.setEnabled(false);
                statusCampos(false);
                
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
            }
            txtRg.setText("");
            txtCpf.setText("");
            txtDataNasc.setText("");
            txtTelefone.setText("");
            txtNome.setText("");
            txtId.setText("");////
            lbFoto.setIcon(null);
            JbNovo.setText("Novo");
        }
            
    }//GEN-LAST:event_JbCadastrarActionPerformed

    private void jTableProfessorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProfessorMouseReleased
        if(jTableProfessor.getSelectedRow() != -1){
            txtId.setText(jTableProfessor.getValueAt(jTableProfessor.getSelectedRow(), 0).toString());
            txtNome.setText(jTableProfessor.getValueAt(jTableProfessor.getSelectedRow(), 1).toString());
            txtDataNasc.setText(jTableProfessor.getValueAt(jTableProfessor.getSelectedRow(), 2).toString());
            txtCpf.setText(jTableProfessor.getValueAt(jTableProfessor.getSelectedRow(), 3).toString());
            txtRg.setText(jTableProfessor.getValueAt(jTableProfessor.getSelectedRow(), 4).toString());
            txtTelefone.setText(jTableProfessor.getValueAt(jTableProfessor.getSelectedRow(), 5).toString());
            if(JrbFeminino.isSelected()){
                JrbFeminino.setText(jTableProfessor.getValueAt(jTableProfessor.getSelectedRow(), 6).toString());
                JrbFeminino.isSelected();
            }else{
                JrbMasculino.setText(jTableProfessor.getValueAt(jTableProfessor.getSelectedRow(), 6).toString());
                JrbMasculino.isSelected();
            }
            int posicao = jTableProfessor.getSelectedRow();
            carregarFoto(posicao);
            JbAlterar.setEnabled(true);
            JbExcluir.setEnabled(true);
            JbNovo.setEnabled(true);
            statusCampos(false);
            JbCadastrar.setEnabled(false);
            JbNovo.setText("Cancelar");
            cancelar = true;
            
        }
    }//GEN-LAST:event_jTableProfessorMouseReleased

    private void JbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbExcluirActionPerformed
        
        int opcao = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja excluir?", "Atenção", JOptionPane.YES_OPTION);
        int linhasel = jTableProfessor.getSelectedRow();
        
        if(opcao == JOptionPane.YES_OPTION){
           
           if(vetCadProfessor.size()==1){
               JOptionPane.showMessageDialog(null, "Não eh possível excluir professor!!!");
           }else{
               
               String nome = vetCadProfessor.get(linhasel).getNome();
               CadastroProfessor.vetCadProfessor.remove(linhasel);
               String prof_default = vetCadProfessor.get(0).getNome();
               
                for(int i = 0; i < vetCadastro.size(); i++){             
                    if(vetCadastro.get(i).getNomeProfessor().equals(nome)){    
                        vetCadastro.get(i).setNomeProfessor(prof_default);
                    }
                }
                
                //CadastroProfessor.vetCadProfessor.remove(linhasel);
                DefaultTableModel dtm = (DefaultTableModel) jTableProfessor.getModel();
                dtm.removeRow(linhasel);

                JOptionPane.showMessageDialog(rootPane, "Dados excluidos com sucesso");

                JbNovo.setText("Novo");
                JbCadastrar.setEnabled(false);
                JbExcluir.setEnabled(false);
                JbAlterar.setEnabled(false);
           }
           
        }else{
            
           JbNovo.setText("Novo"); 
           JbCadastrar.setEnabled(false);
           JbExcluir.setEnabled(false);
           JbAlterar.setEnabled(false);
           
        }
       
    }//GEN-LAST:event_JbExcluirActionPerformed

    private void JbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbNovoActionPerformed
        JbAlterar.setEnabled(false);
        JbExcluir.setEnabled(false);

        if(cancelar == true){
            System.out.println("teste");
            JbNovo.setEnabled(true);
            //btnCadastar.setVisible(false);
            txtId.setText("");////
            JbCadastrar.setEnabled(false);
            statusCampos(false);
            txtRg.setText("");
            txtCpf.setText("");
            txtDataNasc.setText("");
            txtTelefone.setText(""); 
            txtNome.setText("");
            JbNovo.setText("Novo");
            JbNovo.setEnabled(true);
            JbCadastrar.setText("Cadastrar");
            cancelar = false;
        
        }else{
            //Configurando campo ID
            txtId.setEnabled(true);
            CadastroProfessor cadProfessor = new CadastroProfessor();
            int ultimaPos = cadProfessor.vetCadProfessor.size() + 1;
            String id = Integer.toString(ultimaPos);
            txtId.setText(id);
            txtId.setEditable(false);
            //Fim
            
            //JbNovo.setText("Novo");
            JbNovo.setEnabled(true);
            JbCadastrar.setEnabled(true);
            
            statusCampos(true);
            
            //JcomboBox
            JrbMasculino.setEnabled(true);
            JrbFeminino.setEnabled(true);
            JbNovo.setText("Cancelar");
            cancelar= true;
            
        }
    }//GEN-LAST:event_JbNovoActionPerformed

    private void JbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbAlterarActionPerformed
         JbNovo.setEnabled(false);
          
        JbAlterar.setEnabled(false);
        JbExcluir.setEnabled(false);
        statusCampos(true);
        JbCadastrar.setText("Salvar");
        JbCadastrar.setEnabled(true);
        jbFoto.setEnabled(true);
        alterar = true;
        cancelar = true;
        JbNovo.setText("Cancelar");


        JbNovo.setEnabled(true);
    }//GEN-LAST:event_JbAlterarActionPerformed

    private void JrbFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JrbFemininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JrbFemininoActionPerformed

    private void txtRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRgActionPerformed

    private void jbFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFotoActionPerformed
        escolherFoto = new JFileChooser();
        escolherFoto.setFileFilter(new FileNameExtensionFilter("Arquivos de imagem", "jpg"));
        int retorno = escolherFoto.showSaveDialog(null);
        if (retorno == JFileChooser.APPROVE_OPTION) {
            caminho = escolherFoto.getSelectedFile().getAbsolutePath();
        }
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
                    lbFoto.setIcon(new ImageIcon(foto));
    
                } catch (IOException ex) {
                    Logger.getLogger(IntefaceCadCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_jbFotoActionPerformed

    private void jTableProfessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProfessorMouseClicked
        //jTableProfessor.setEnabled(false);
    }//GEN-LAST:event_jTableProfessorMouseClicked

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    public void carregarFoto(int posSelVetor){
        caminho = CadastroProfessor.vetCadProfessor.get(posSelVetor).getCaminhoFoto();
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
                    lbFoto.setIcon(new ImageIcon(foto));
    
                } catch (IOException ex) {
                    Logger.getLogger(IntefaceCadCliente.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(InterfaceCadProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCadProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCadProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCadProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new InterfaceCadProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupSexo;
    private javax.swing.JButton JbAlterar;
    private javax.swing.JButton JbCadastrar;
    private javax.swing.JButton JbExcluir;
    private javax.swing.JButton JbNovo;
    private javax.swing.JRadioButton JrbFeminino;
    private javax.swing.JRadioButton JrbMasculino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProfessor;
    private javax.swing.JButton jbFoto;
    private javax.swing.JLabel lbFoto;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtDataNasc;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtRg;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
