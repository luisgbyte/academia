package Classes;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class CadastroProfessor  extends CadastroPessoa{
    public static ArrayList<CadastroProfessor> vetCadProfessor = new ArrayList<CadastroProfessor>();
    private String graduacao;

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }
    
    public void cadastrar(int id, String nome, String dataNasc, String telefone, String cpf, String rg, String graduacao, String sexo, String caminhoFoto){
        setId(id);
        setNome(nome);
        setCpf(cpf);
        setRg(rg);
        setDataNasc(dataNasc);
        setTelefone(telefone);
        setGraduacao(graduacao);
        setSexo(sexo);
        setCaminhoFoto(caminhoFoto);
        
    }
    
    
    
}
