/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.*;
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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gustavo
 */
public class Exercicios extends javax.swing.JFrame {

    JFileChooser escolherFoto;
    String caminho = "";
    File arquivo = null;
    JFrame abrirFrame;
    JPanel abrirPanel;
    String sexo= "";
    String nome= "";
    /**
     * Creates new form Devedores
     */
    public Exercicios() {
        initComponents();
        
        for (int i = 0; i < CadastroProfessor.vetCadProfessor.size(); i++) {
            jcbProfessor.addItem(CadastroProfessor.vetCadProfessor.get(i).getNome());
        }
        
        btnAvancar01.setEnabled(false);
        btnAvancar2.setEnabled(false);
        btnAvanca03.setEnabled(false);
        jTabbedPaneExercicios.setEnabledAt(1, false);
        jTabbedPaneExercicios.setEnabledAt(2, false);
        jTabbedPaneExercicios.setEnabledAt(3, false);
        jTabbedPaneExercicios.setEnabledAt(3, false);
        
        
        txaObservacoes.setVisible(false);
        txtTipoRecomendacao.setVisible(false);
        JLRecomendaMedica.setVisible(false);
        jlObservacao.setVisible(false);
        
        setResizable(false);
        

    }
    
    public void treinoFisico(String sexo){
        String exercicio;
        int serie;
        String repeticao;
        DefaultTableModel dtmA = (DefaultTableModel) jTableTreinoA.getModel();
        DefaultTableModel dtmB = (DefaultTableModel) jTableTreinoB.getModel();
        DefaultTableModel dtmC = (DefaultTableModel) jTableTreinoC.getModel();
        if(sexo.equals("Masculino")){
            //tabela A
            exercicio = "Supino reto";
            serie = 3;
            repeticao = "12 - 12 Falha";
            dtmA.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Rosca Alternada";
            serie = 4;
            repeticao = "10 - 10 Falha";
            dtmA.addRow(new Object[]{exercicio, serie,repeticao});
          
            exercicio = "desevolvimento Nunca";
            serie = 3;
            repeticao = "8 - 10 Falha";
            dtmA.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Levantamento Terra";
            serie = 4;
            repeticao = "8 - 8 Falha";
            dtmA.addRow(new Object[]{exercicio, serie,repeticao});
            
            //tabela B
            
            exercicio = "Elevacao Lateral";
            serie = 3;
            repeticao = "10 - 12 Falha";
            dtmB.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Martelo Em Pe";
            serie = 3;
            repeticao = "10 - 12 Falha";
            dtmB.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Remada Baixa";
            serie = 3;
            repeticao = "10 - 11 Falha";
            dtmB.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Pulley Frontal";
            serie = 3;
            repeticao = "9 - 11 Falha";
            dtmB.addRow(new Object[]{exercicio, serie,repeticao});
            
            //tabela C
            
            exercicio = "Barra Cross";
            serie = 3;
            repeticao = "9 - 11 Falha";
            dtmC.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Frances Deitado Halteres";
            serie = 3;
            repeticao = "9 - 11 Falha";
            dtmC.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Tricps Testa";
            serie = 3;
            repeticao = "9 - 9 Falha";
            dtmC.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Adutora";
            serie = 3;
            repeticao = "9 - 9 Falha";
            dtmC.addRow(new Object[]{exercicio, serie,repeticao});
            
            
            
        }else{
            exercicio = "Supino reto";
            serie = 3;
            repeticao = "8 - 12 Falha";
            dtmA.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Rosca Alternada";
            serie = 4;
            repeticao = "6 - 10 Falha";
            dtmA.addRow(new Object[]{exercicio, serie,repeticao});
          
            exercicio = "desevolvimento Nunca";
            serie = 3;
            repeticao = "6 - 10 Falha";
            dtmA.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Levantamento Terra";
            serie = 4;
            repeticao = "4 - 8 Falha";
            dtmA.addRow(new Object[]{exercicio, serie,repeticao});
            
            //tabela B
            
            exercicio = "Elevacao Lateral";
            serie = 5;
            repeticao = "8 - 12 Falha";
            dtmB.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Martelo Em Pe";
            serie = 6;
            repeticao = "8 - 12 Falha";
            dtmB.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Remada Baixa";
            serie = 3;
            repeticao = "8 - 11 Falha";
            dtmB.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Pulley Frontal";
            serie = 3;
            repeticao = "9 - 11 Falha";
            dtmB.addRow(new Object[]{exercicio, serie,repeticao});
            
            //tabela C
            
            exercicio = "Barra Cross";
            serie = 3;
            repeticao = "6 - 11 Falha";
            dtmC.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Frances Deitado Halteres";
            serie = 4;
            repeticao = "7 - 11 Falha";
            dtmC.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Tricps Testa";
            serie = 5;
            repeticao = "5 - 9 Falha";
            dtmC.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Adutora";
            serie = 4;
            repeticao = "6 - 9 Falha";
            dtmC.addRow(new Object[]{exercicio, serie,repeticao});
            
        }
    }
    public void treinoFuncional(String sexo){
        String exercicio;
        int serie;
        String repeticao;
        DefaultTableModel dtmA = (DefaultTableModel) jTableTreinoA.getModel();
        DefaultTableModel dtmB = (DefaultTableModel) jTableTreinoB.getModel();
        DefaultTableModel dtmC = (DefaultTableModel) jTableTreinoC.getModel();
        if(sexo.equals("Masculino")){
            //tabela A
            exercicio = "Flexão de Braçoss";
            serie = 4;
            repeticao = "15 - 20 Falha";
            dtmA.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Agachamento";
            serie = 2;
            repeticao = "10 - 15 Falha";
            dtmA.addRow(new Object[]{exercicio, serie,repeticao});
          
            exercicio = "prancha";
            serie = 5;
            repeticao = "8 - 10 Falha";
            dtmA.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Abdominal";
            serie = 4;
            repeticao = "15 - 20 Falha";
            dtmA.addRow(new Object[]{exercicio, serie,repeticao});
            
            //tabela B
            
            exercicio = "Pular corda";
            serie = 5;
            repeticao = "20 - 25 Falha";
            dtmB.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Esteira";
            serie = 3;
            repeticao = "10 - 12 Falha";
            dtmB.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Levantamento terra";
            serie = 3;
            repeticao = "10 - 13 Falha";
            dtmB.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Agachamento unilateral";
            serie = 3;
            repeticao = "13 - 17 Falha";
            dtmB.addRow(new Object[]{exercicio, serie,repeticao});
            
            //tabela C
            
            exercicio = "Desenvolvimento de Ombros";
            serie = 4;
            repeticao = "13 - 18 Falha";
            dtmC.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Elevação lateral ombros";
            serie = 3;
            repeticao = "9 - 11 Falha";
            dtmC.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Supino Reto";
            serie = 3;
            repeticao = "9 - 10 Falha";
            dtmC.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Adutora";
            serie = 3;
            repeticao = "9 - 9 Falha";
            dtmC.addRow(new Object[]{exercicio, serie,repeticao});
            
            
            
        }else{

          //tabela A
            exercicio = "Flexão de Braçoss";
            serie = 4;
            repeticao = "15 - 20 Falha";
            dtmA.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Agachamento";
            serie = 2;
            repeticao = "10 - 15 Falha";
            dtmA.addRow(new Object[]{exercicio, serie,repeticao});
          
            exercicio = "prancha";
            serie = 5;
            repeticao = "8 - 10 Falha";
            dtmA.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Abdominal";
            serie = 4;
            repeticao = "15 - 20 Falha";
            dtmA.addRow(new Object[]{exercicio, serie,repeticao});
            
            //tabela B
            
            exercicio = "Pular corda";
            serie = 5;
            repeticao = "20 - 25 Falha";
            dtmB.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Esteira";
            serie = 3;
            repeticao = "10 - 12 Falha";
            dtmB.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Levantamento terra";
            serie = 3;
            repeticao = "10 - 13 Falha";
            dtmB.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Agachamento unilateral";
            serie = 3;
            repeticao = "13 - 17 Falha";
            dtmB.addRow(new Object[]{exercicio, serie,repeticao});
            
            //tabela C
            
            exercicio = "Desenvolvimento de Ombros";
            serie = 4;
            repeticao = "13 - 18 Falha";
            dtmC.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Elevação lateral ombros";
            serie = 3;
            repeticao = "9 - 11 Falha";
            dtmC.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Supino Reto";
            serie = 3;
            repeticao = "9 - 10 Falha";
            dtmC.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Adutora";
            serie = 3;
            repeticao = "9 - 9 Falha";
            dtmC.addRow(new Object[]{exercicio, serie,repeticao});

    }
    
    
    }
    public void treinoAltaIntencidade(String sexo){
        String exercicio;
        int serie;
        String repeticao;
        DefaultTableModel dtmA = (DefaultTableModel) jTableTreinoA.getModel();
        DefaultTableModel dtmB = (DefaultTableModel) jTableTreinoB.getModel();
        DefaultTableModel dtmC = (DefaultTableModel) jTableTreinoC.getModel();
        if(sexo.equals("Masculino")){
            //tabela A
            exercicio = "Supino inclinado";
            serie = 4;
            repeticao = "15 - 20 Falha";
            dtmA.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Supino reto";
            serie = 2;
            repeticao = "10 - 15 Falha";
            dtmA.addRow(new Object[]{exercicio, serie,repeticao});
          
            exercicio = "Crucifixo";
            serie = 5;
            repeticao = "8 - 10 Falha";
            dtmA.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Abdominal";
            serie = 4;
            repeticao = "15 - 20 Falha";
            dtmA.addRow(new Object[]{exercicio, serie,repeticao});
            
            //tabela B
            
            exercicio = "Agachamentos";
            serie = 3;
            repeticao = "20 - 25 Falha";
            dtmB.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Alteres";
            serie = 3;
            repeticao = "10 - 12 Falha";
            dtmB.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Levantamento terra";
            serie = 3;
            repeticao = "10 - 13 Falha";
            dtmB.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Agachamento unilateral";
            serie = 3;
            repeticao = "13 - 17 Falha";
            dtmB.addRow(new Object[]{exercicio, serie,repeticao});
            
            //tabela C
            
            exercicio = "Elevação frontal";
            serie = 4;
            repeticao = "13 - 18 Falha";
            dtmC.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Biceps concentrado";
            serie = 3;
            repeticao = "9 - 11 Falha";
            dtmC.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Supino Reto";
            serie = 3;
            repeticao = "9 - 10 Falha";
            dtmC.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Mesa horizontal";
            serie = 3;
            repeticao = "6 - 9 Falha";
            dtmC.addRow(new Object[]{exercicio, serie,repeticao});
            
        }
    }
    public void treinoEmagrecer(String sexo){
        String exercicio;
        int serie;
        String repeticao;
        DefaultTableModel dtmA = (DefaultTableModel) jTableTreinoA.getModel();
        DefaultTableModel dtmB = (DefaultTableModel) jTableTreinoB.getModel();
        DefaultTableModel dtmC = (DefaultTableModel) jTableTreinoC.getModel();
        if(sexo.equals("Masculino")){
            //tabela A
            exercicio = "Agachamento e afundo na esteira";
            serie = 4;
            repeticao = "15 - 20 Falha";
            dtmA.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Agachamento nas bolhas";
            serie = 2;
            repeticao = "10 - 15 Falha";
            dtmA.addRow(new Object[]{exercicio, serie,repeticao});
          
            exercicio = "Tríceps no equalizer";
            serie = 5;
            repeticao = "8 - 10 Falha";
            dtmA.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Abdômen na bola com movimentação";
            serie = 4;
            repeticao = "15 - 20 Falha";
            dtmA.addRow(new Object[]{exercicio, serie,repeticao});
            
            //tabela B
            
            exercicio = "Elevação pélvica";
            serie = 5;
            repeticao = "20 - 25 Falha";
            dtmB.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "agachamento no bosu";
            serie = 3;
            repeticao = "10 - 12 Falha";
            dtmB.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Remada no equalizer";
            serie = 3;
            repeticao = "10 - 13 Falha";
            dtmB.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Polichinelo";
            serie = 3;
            repeticao = "13 - 17 Falha";
            dtmB.addRow(new Object[]{exercicio, serie,repeticao});
            
            //tabela C
            
            exercicio = "Polisapato";
            serie = 4;
            repeticao = "13 - 18 Falha";
            dtmC.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Elevação de joelho com salto";
            serie = 3;
            repeticao = "9 - 11 Falha";
            dtmC.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Prancha em três apoios";
            serie = 3;
            repeticao = "9 - 10 Falha";
            dtmC.addRow(new Object[]{exercicio, serie,repeticao});
            
            exercicio = "Elevação lateral com elástico";
            serie = 3;
            repeticao = "9 - 9 Falha";
            dtmC.addRow(new Object[]{exercicio, serie,repeticao});
            
        }
    }
    public void adcionarVetor(){
        
        String nome = jcbAluno.getSelectedItem().toString();
        String modalidade = "";
        if(JCEmagrecer.isSelected()){
            modalidade = "Emagrecer";
        }else if(JCFisico.isSelected()){
            modalidade = "Fisico";
        }else if(JCFuncional.isSelected()){
            modalidade = "Funcional";
        }else if(JCTreinamento.isSelected()){
            modalidade = "Intencivo";
        }
        
        CadExercicio exercicico = new CadExercicio();
        exercicico.cadastrar(nome, modalidade);
        CadExercicio.vetCadExercicios.add(exercicico);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fuma = new javax.swing.ButtonGroup();
        bebe = new javax.swing.ButtonGroup();
        medic = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPaneExercicios = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jcbProfessor = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jcbAluno = new javax.swing.JComboBox<>();
        btnAvancar01 = new javax.swing.JButton();
        lbFoto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JCFuncional = new javax.swing.JCheckBox();
        JCFisico = new javax.swing.JCheckBox();
        JCTreinamento = new javax.swing.JCheckBox();
        JCEmagrecer = new javax.swing.JCheckBox();
        btnAvancar2 = new javax.swing.JButton();
        btnVoltar01 = new javax.swing.JButton();
        bebida = new javax.swing.JPanel();
        jrbFumaSim = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jrbFumaNao = new javax.swing.JRadioButton();
        jrbBabidaSim = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jrbBebidaNao = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jrbRecomeSim = new javax.swing.JRadioButton();
        jrbRecomeNao = new javax.swing.JRadioButton();
        JLRecomendaMedica = new javax.swing.JLabel();
        txtTipoRecomendacao = new javax.swing.JTextField();
        btnVoltar2 = new javax.swing.JButton();
        btnAvanca03 = new javax.swing.JButton();
        jlObservacao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaObservacoes = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabelTreinoA = new javax.swing.JLabel();
        jLabelTreinoB = new javax.swing.JLabel();
        jLabelTreinoC = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTreinoA = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableTreinoB = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableTreinoC = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de exercicos");

        jLabel4.setText("Professor");

        jcbProfessor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jcbProfessor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbProfessorItemStateChanged(evt);
            }
        });

        jLabel2.setText("Aluno");

        jcbAluno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jcbAluno.setToolTipText("");
        jcbAluno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbAlunoItemStateChanged(evt);
            }
        });

        btnAvancar01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/avancar.png"))); // NOI18N
        btnAvancar01.setText("Avancar");
        btnAvancar01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancar01ActionPerformed(evt);
            }
        });

        lbFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbProfessor, 0, 162, Short.MAX_VALUE)
                    .addComponent(jcbAluno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAvancar01)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btnAvancar01)
                .addGap(29, 29, 29))
        );

        jTabbedPaneExercicios.addTab("Aluno", jPanel1);

        JCFuncional.setText("Treinamento Funcional");
        JCFuncional.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCFuncionalItemStateChanged(evt);
            }
        });
        JCFuncional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JCFuncionalMouseReleased(evt);
            }
        });
        JCFuncional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCFuncionalActionPerformed(evt);
            }
        });

        JCFisico.setText("Fisico");
        JCFisico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCFisicoItemStateChanged(evt);
            }
        });
        JCFisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCFisicoActionPerformed(evt);
            }
        });

        JCTreinamento.setText("Treinamento intervalado de alta intensidade");
        JCTreinamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCTreinamentoItemStateChanged(evt);
            }
        });

        JCEmagrecer.setText("Emagrecer");
        JCEmagrecer.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCEmagrecerItemStateChanged(evt);
            }
        });
        JCEmagrecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCEmagrecerActionPerformed(evt);
            }
        });

        btnAvancar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/avancar.png"))); // NOI18N
        btnAvancar2.setText("Avancar");
        btnAvancar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancar2ActionPerformed(evt);
            }
        });

        btnVoltar01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        btnVoltar01.setText("Voltar");
        btnVoltar01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar01ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnVoltar01)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAvancar2)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JCEmagrecer)
                            .addComponent(JCTreinamento)
                            .addComponent(JCFisico)
                            .addComponent(JCFuncional, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(386, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(JCFuncional)
                .addGap(27, 27, 27)
                .addComponent(JCFisico)
                .addGap(30, 30, 30)
                .addComponent(JCTreinamento)
                .addGap(18, 18, 18)
                .addComponent(JCEmagrecer)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar01)
                    .addComponent(btnAvancar2))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPaneExercicios.addTab("Modalidade", jPanel2);

        fuma.add(jrbFumaSim);
        jrbFumaSim.setText("Sim");
        jrbFumaSim.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrbFumaSimItemStateChanged(evt);
            }
        });

        jLabel3.setText("Fuma:");

        fuma.add(jrbFumaNao);
        jrbFumaNao.setText("Nao");
        jrbFumaNao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrbFumaNaoItemStateChanged(evt);
            }
        });
        jrbFumaNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFumaNaoActionPerformed(evt);
            }
        });

        bebe.add(jrbBabidaSim);
        jrbBabidaSim.setText("Sim");
        jrbBabidaSim.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrbBabidaSimItemStateChanged(evt);
            }
        });

        jLabel5.setText("Comsome Bebida Alcoolica:");

        bebe.add(jrbBebidaNao);
        jrbBebidaNao.setText("Não");
        jrbBebidaNao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrbBebidaNaoItemStateChanged(evt);
            }
        });

        jLabel6.setText("Alguma recomendação Medica:");

        medic.add(jrbRecomeSim);
        jrbRecomeSim.setText("Sim");
        jrbRecomeSim.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrbRecomeSimItemStateChanged(evt);
            }
        });

        medic.add(jrbRecomeNao);
        jrbRecomeNao.setText("Não");
        jrbRecomeNao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrbRecomeNaoItemStateChanged(evt);
            }
        });

        JLRecomendaMedica.setText("Se sim.Qual ?");

        txtTipoRecomendacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoRecomendacaoActionPerformed(evt);
            }
        });

        btnVoltar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        btnVoltar2.setText("Voltar");
        btnVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar2ActionPerformed(evt);
            }
        });

        btnAvanca03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/avancar.png"))); // NOI18N
        btnAvanca03.setText("Avançar");
        btnAvanca03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvanca03ActionPerformed(evt);
            }
        });

        jlObservacao.setText("Observações");

        txaObservacoes.setColumns(20);
        txaObservacoes.setRows(5);
        txaObservacoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(txaObservacoes);

        javax.swing.GroupLayout bebidaLayout = new javax.swing.GroupLayout(bebida);
        bebida.setLayout(bebidaLayout);
        bebidaLayout.setHorizontalGroup(
            bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bebidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAvanca03)
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bebidaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bebidaLayout.createSequentialGroup()
                        .addComponent(jrbFumaSim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbFumaNao))
                    .addGroup(bebidaLayout.createSequentialGroup()
                        .addComponent(jrbBabidaSim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbBebidaNao))
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(JLRecomendaMedica)
                    .addComponent(jLabel3)
                    .addComponent(txtTipoRecomendacao, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bebidaLayout.createSequentialGroup()
                        .addComponent(jrbRecomeSim)
                        .addGap(10, 10, 10)
                        .addComponent(jrbRecomeNao)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bebidaLayout.createSequentialGroup()
                        .addComponent(jlObservacao)
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bebidaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        bebidaLayout.setVerticalGroup(
            bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bebidaLayout.createSequentialGroup()
                .addGroup(bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bebidaLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jlObservacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bebidaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbFumaSim)
                            .addComponent(jrbFumaNao))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbBabidaSim)
                            .addComponent(jrbBebidaNao))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbRecomeSim)
                            .addComponent(jrbRecomeNao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLRecomendaMedica)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(txtTipoRecomendacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar2)
                    .addComponent(btnAvanca03))
                .addGap(31, 31, 31))
        );

        jTabbedPaneExercicios.addTab("Restricoes", bebida);

        jLabelTreinoA.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTreinoA.setText(" A");
        jLabelTreinoA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelTreinoB.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTreinoB.setText(" B");
        jLabelTreinoB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelTreinoC.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTreinoC.setText(" C");
        jLabelTreinoC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTableTreinoA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Execicios", "Serie", "Repeticao"
            }
        ));
        jTableTreinoA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTreinoAMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableTreinoA);

        jTableTreinoB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exercicios", "Serie", "Repetições"
            }
        ));
        jTableTreinoB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTreinoBMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableTreinoB);

        jTableTreinoC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exercicios", "Serie", "Repetições"
            }
        ));
        jTableTreinoC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTreinoCMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableTreinoC);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelTreinoA, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jLabelTreinoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTreinoC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelTreinoA, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelTreinoB, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelTreinoC, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPaneExercicios.addTab("treino Recomendado", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabel1)
                .addContainerGap(237, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPaneExercicios, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPaneExercicios)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvanca03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvanca03ActionPerformed
        if(validaRestricao()){

            jTabbedPaneExercicios.setSelectedIndex(3);
            if(JCFisico.isSelected()){
                JOptionPane.showMessageDialog(null, "Treino gerado com sucesso!");
                if(sexo.equals("Masculino")){
                    treinoFisico(sexo);
                }else{
                    treinoFisico(sexo);
                }
            }else if(JCEmagrecer.isSelected()){
                JOptionPane.showMessageDialog(null, "Treino gerado com sucesso!");
                if(sexo.equals("Masculino")){
                    treinoEmagrecer(sexo);
                }else{
                    treinoEmagrecer(sexo);
                }
            }else if(JCFuncional.isSelected()){
                JOptionPane.showMessageDialog(null, "Treino gerado com sucesso!");
                if(sexo.equals("Masculino")){
                    treinoFuncional(sexo);
                }else{
                    treinoFuncional(sexo);
                }
            }else if(JCTreinamento.isSelected()){
                JOptionPane.showMessageDialog(null, "Treino gerado com sucesso!");
                if(sexo.equals("Masculino")){
                    treinoAltaIntencidade(sexo);
                }else{
                    
                    treinoAltaIntencidade(sexo);
                }
            }
            jTabbedPaneExercicios.setEnabledAt(2, false);
            jTabbedPaneExercicios.setEnabledAt(3, true);
        }else{
            btnAvanca03.setEnabled(false);
        }
        
    }//GEN-LAST:event_btnAvanca03ActionPerformed

    private void btnVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar2ActionPerformed
        jTabbedPaneExercicios.setEnabledAt(2, false);
        jTabbedPaneExercicios.setEnabledAt(1, true);

        jTabbedPaneExercicios.setSelectedIndex(1);
    }//GEN-LAST:event_btnVoltar2ActionPerformed

    private void txtTipoRecomendacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoRecomendacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoRecomendacaoActionPerformed

    private void jrbRecomeNaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrbRecomeNaoItemStateChanged
        if(validaRestricao()){
            btnAvanca03.setEnabled(true);
        }else{
            btnAvanca03.setEnabled(false);
        }
    }//GEN-LAST:event_jrbRecomeNaoItemStateChanged

    private void jrbRecomeSimItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrbRecomeSimItemStateChanged
        if(jrbRecomeSim.isSelected()){
            txaObservacoes.setVisible(true);
            txtTipoRecomendacao.setVisible(true);
            JLRecomendaMedica.setVisible(true);
            jlObservacao.setVisible(true);
            txtTipoRecomendacao.setEnabled(true);
            txaObservacoes.setEditable(true);
            if(validaRestricao()){
                btnAvanca03.setEnabled(true);
            }else{
                btnAvanca03.setEnabled(false);
            }
        }else{
            txtTipoRecomendacao.setEnabled(false);
            txaObservacoes.setEditable(false);
            txaObservacoes.setVisible(false);
            txtTipoRecomendacao.setVisible(false);
            JLRecomendaMedica.setVisible(false);
            jlObservacao.setVisible(false);
            if(validaRestricao()){
                btnAvanca03.setEnabled(true);
            }else{
                btnAvanca03.setEnabled(false);
            }
        }
        
    }//GEN-LAST:event_jrbRecomeSimItemStateChanged

    private void jrbBebidaNaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrbBebidaNaoItemStateChanged
        if(validaRestricao()){
            btnAvanca03.setEnabled(true);
        }else{
            btnAvanca03.setEnabled(false);
        }
    }//GEN-LAST:event_jrbBebidaNaoItemStateChanged

    private void jrbBabidaSimItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrbBabidaSimItemStateChanged
        if(validaRestricao()){
            btnAvanca03.setEnabled(true);
        }else{
            btnAvanca03.setEnabled(false);
        }
    }//GEN-LAST:event_jrbBabidaSimItemStateChanged

    private void jrbFumaNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFumaNaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbFumaNaoActionPerformed

    private void jrbFumaNaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrbFumaNaoItemStateChanged
        if(validaRestricao()){
            btnAvanca03.setEnabled(true);
        }else{
            btnAvanca03.setEnabled(false);
        }
    }//GEN-LAST:event_jrbFumaNaoItemStateChanged

    private void jrbFumaSimItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrbFumaSimItemStateChanged
        if(jrbFumaNao.isSelected() || jrbFumaSim.isSelected()){
            if(validaRestricao()){
                btnAvanca03.setEnabled(true);
            }else{
                btnAvanca03.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jrbFumaSimItemStateChanged

    private void btnVoltar01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar01ActionPerformed
        jTabbedPaneExercicios.setEnabledAt(0, true);
        jTabbedPaneExercicios.setEnabledAt(1, false);
        jTabbedPaneExercicios.setSelectedIndex(0);
    }//GEN-LAST:event_btnVoltar01ActionPerformed

    private void btnAvancar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancar2ActionPerformed
        jTabbedPaneExercicios.setEnabledAt(2, true);
        jTabbedPaneExercicios.setEnabledAt(1, false);
        jTabbedPaneExercicios.setSelectedIndex(2);
        adcionarVetor();

    }//GEN-LAST:event_btnAvancar2ActionPerformed

    private void JCEmagrecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCEmagrecerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCEmagrecerActionPerformed

    private void JCEmagrecerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCEmagrecerItemStateChanged
        if(JCEmagrecer.isSelected()){
            JCTreinamento.setEnabled(false);
            JCFisico.setEnabled(false);
            JCFuncional.setEnabled(false);
            btnAvancar2.setEnabled(true);
            if(validaRestricao()){
                btnAvanca03.setEnabled(true);
            }else{
                btnAvanca03.setEnabled(false);
            }
        }else{
            JCTreinamento.setEnabled(true);
            JCFisico.setEnabled(true);
            JCFuncional.setEnabled(true);
            btnAvancar2.setEnabled(false);

        }

    }//GEN-LAST:event_JCEmagrecerItemStateChanged

    private void JCTreinamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCTreinamentoItemStateChanged
        if(JCTreinamento.isSelected()){
            JCFisico.setEnabled(false);
            JCEmagrecer.setEnabled(false);
            JCFuncional.setEnabled(false);
            btnAvancar2.setEnabled(true);
        }else{
            JCFisico.setEnabled(true);
            JCEmagrecer.setEnabled(true);
            JCFuncional.setEnabled(true);
            btnAvancar2.setEnabled(false);
        }
    }//GEN-LAST:event_JCTreinamentoItemStateChanged

    private void JCFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCFisicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCFisicoActionPerformed

    private void JCFisicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCFisicoItemStateChanged
        if(JCFisico.isSelected()){
            JCTreinamento.setEnabled(false);
            JCEmagrecer.setEnabled(false);
            JCFuncional.setEnabled(false);
            btnAvancar2.setEnabled(true);
        }else{
            JCTreinamento.setEnabled(true);
            JCEmagrecer.setEnabled(true);
            JCFuncional.setEnabled(true);
            btnAvancar2.setEnabled(false);
        }
    }//GEN-LAST:event_JCFisicoItemStateChanged

    private void JCFuncionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCFuncionalActionPerformed
        // TODO add your handling code here:

        //validadupicidade();
    }//GEN-LAST:event_JCFuncionalActionPerformed

    private void JCFuncionalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JCFuncionalMouseReleased

        btnAvancar01.setEnabled(true);
        if(JCFuncional.isSelected() == false){
            btnAvancar01.setEnabled(true);

        }
        // validadupicidade();
    }//GEN-LAST:event_JCFuncionalMouseReleased

    private void JCFuncionalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCFuncionalItemStateChanged
        if(JCFuncional.isSelected()){
            JCTreinamento.setEnabled(false);
            JCEmagrecer.setEnabled(false);
            JCFisico.setEnabled(false);
            btnAvancar2.setEnabled(true);

        }else{
            JCTreinamento.setEnabled(true);
            JCEmagrecer.setEnabled(true);
            JCFisico.setEnabled(true);
            btnAvancar2.setEnabled(false);
        }

    }//GEN-LAST:event_JCFuncionalItemStateChanged

    private void btnAvancar01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancar01ActionPerformed

        jTabbedPaneExercicios.setEnabledAt(1, true);
        jTabbedPaneExercicios.setEnabledAt(0, false);
        jTabbedPaneExercicios.setSelectedIndex(1);
    }//GEN-LAST:event_btnAvancar01ActionPerformed

    public int posicaoVetor(){
        int posicao=0;
        for (int i = 0; i < CadastroCliente.vetCadastro.size(); i++) {
            if(CadastroCliente.vetCadastro.get(i).getNome().equals(nome)){
                posicao = i;
            }
            
        }
        return posicao;
    }

    private void jcbAlunoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbAlunoItemStateChanged
        //        int pos = jcbAluno.getSelectedIndex()+1;
        //        carregarFoto(pos);
        if(jcbAluno.getSelectedIndex()!=0){

            for (int x = 0; x < CadastroCliente.vetCadastro.size(); x++) {

                if(CadastroCliente.vetCadastro.get(x).getId()== (jcbAluno.getSelectedIndex())){
                    nome = jcbAluno.getSelectedItem().toString();
                    int pos = posicaoVetor();
                    carregarFoto(pos);
                    btnAvancar01.setEnabled(true);
                    sexo= CadastroCliente.vetCadastro.get(x).getSexo();

                }
            }
        }else{
            lbFoto.setIcon(null);
            btnAvancar01.setEnabled(false);
        }

    }//GEN-LAST:event_jcbAlunoItemStateChanged

    private void jcbProfessorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbProfessorItemStateChanged

        jcbAluno.removeAllItems();
        jcbAluno.addItem("Selecione");
        for (int x = 0; x < CadastroCliente.vetCadastro.size(); x++) {
            int teste = 0;
            String nomeSel = jcbProfessor.getSelectedItem().toString();

            if(CadastroCliente.vetCadastro.get(x).getNomeProfessor().equals(jcbProfessor.getSelectedItem().toString())){

                jcbAluno.addItem(CadastroCliente.vetCadastro.get(x).getNome());

            }
        }

    }//GEN-LAST:event_jcbProfessorItemStateChanged

    private void jTableTreinoAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTreinoAMouseClicked
        jTableTreinoA.setEnabled(false);
    }//GEN-LAST:event_jTableTreinoAMouseClicked

    private void jTableTreinoBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTreinoBMouseClicked
        jTableTreinoB.setEnabled(false);
    }//GEN-LAST:event_jTableTreinoBMouseClicked

    private void jTableTreinoCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTreinoCMouseClicked
        jTableTreinoC.setEnabled(false);
    }//GEN-LAST:event_jTableTreinoCMouseClicked
    public void carregarFoto(int posSelVetor){
            caminho = CadastroCliente.vetCadastro.get(posSelVetor).getCaminhoFoto();
            System.out.println("posicao: "+posSelVetor);
          
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
    
    public boolean validaCampoBranco(){
        if(JCEmagrecer.isSelected() || JCFisico.isSelected() || JCFuncional.isSelected() || JCTreinamento.isSelected()){
            btnAvancar01.setEnabled(true);
            return true;
        }else{
            btnAvancar01.setEnabled(false);
            return false;
        }
    } 
    
       
    public boolean validaRestricao(){
        if((jrbBabidaSim.isSelected() || jrbBebidaNao.isSelected()) && (jrbFumaNao.isSelected() || jrbFumaSim.isSelected()) && (jrbRecomeNao.isSelected() || jrbRecomeSim.isSelected())){
            return true;
        }else{
            return false;
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
            java.util.logging.Logger.getLogger(Exercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Exercicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox JCEmagrecer;
    private javax.swing.JCheckBox JCFisico;
    private javax.swing.JCheckBox JCFuncional;
    private javax.swing.JCheckBox JCTreinamento;
    private javax.swing.JLabel JLRecomendaMedica;
    private javax.swing.ButtonGroup bebe;
    private javax.swing.JPanel bebida;
    private javax.swing.JButton btnAvanca03;
    private javax.swing.JButton btnAvancar01;
    private javax.swing.JButton btnAvancar2;
    private javax.swing.JButton btnVoltar01;
    private javax.swing.JButton btnVoltar2;
    private javax.swing.ButtonGroup fuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelTreinoA;
    private javax.swing.JLabel jLabelTreinoB;
    private javax.swing.JLabel jLabelTreinoC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPaneExercicios;
    private javax.swing.JTable jTableTreinoA;
    private javax.swing.JTable jTableTreinoB;
    private javax.swing.JTable jTableTreinoC;
    private javax.swing.JComboBox<String> jcbAluno;
    private javax.swing.JComboBox<String> jcbProfessor;
    private javax.swing.JLabel jlObservacao;
    private javax.swing.JRadioButton jrbBabidaSim;
    private javax.swing.JRadioButton jrbBebidaNao;
    private javax.swing.JRadioButton jrbFumaNao;
    private javax.swing.JRadioButton jrbFumaSim;
    private javax.swing.JRadioButton jrbRecomeNao;
    private javax.swing.JRadioButton jrbRecomeSim;
    private javax.swing.JLabel lbFoto;
    private javax.swing.ButtonGroup medic;
    private javax.swing.JTextArea txaObservacoes;
    private javax.swing.JTextField txtTipoRecomendacao;
    // End of variables declaration//GEN-END:variables
}
