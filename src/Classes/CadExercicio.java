/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class CadExercicio {
    public static ArrayList<CadExercicio> vetCadExercicios = new ArrayList<CadExercicio>();
    
    private String nome;
    private String modalidade;
    private boolean fuma;
    private boolean bebe;
    private boolean recomendacao;
    private String tipoRecomendacao;
    private String observacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    
    
    
   
    
    public void cadastrar(String nome, String modalidade){
        setNome(nome);
        setModalidade(modalidade);
        
    }
}
