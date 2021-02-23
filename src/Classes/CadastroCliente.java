package Classes;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JTextField;

public class CadastroCliente extends CadastroPessoa implements Comparable<CadastroCliente>{
    
    
    //private String foto;

    public static ArrayList<CadastroCliente> vetCadastro = new ArrayList<CadastroCliente>();
    private LocalDate dataDoCadastro;
    private String status;
    private String NomeProfessor;
    
    public LocalDate getDataDoCadastro() {
        return dataDoCadastro;
    }
    public void setDataDoCadastro(LocalDate dataDoCadastro) {
        this.dataDoCadastro = dataDoCadastro;
    }
    
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getNomeProfessor() {
        return NomeProfessor;
    }

    public void setNomeProfessor(String NomeProfessor) {
        this.NomeProfessor = NomeProfessor;
    }
    
    
    
    public void cadastrar(int id, String nome, String dataNasc, String sexo, String telefone, String cpf, String rg, LocalDate dataDoCadastro, String status, String nomeProfessor, String caminhoFoto){
       super.cadastrar(id, nome, dataNasc, sexo, telefone, cpf, rg, caminhoFoto);
       setDataDoCadastro(dataDoCadastro);
       setStatus(status);
       setNomeProfessor(nomeProfessor);
       
    }
    ///comparando datas de ultimo pagamento --- tela relatórios
    @Override
    public int compareTo(CadastroCliente outroCliente) {
        if(this.dataDoCadastro.isAfter(outroCliente.getDataDoCadastro())){
           return -1;
       }
       else if(this.dataDoCadastro.isBefore(outroCliente.getDataDoCadastro())){
           return 1;
       }
       return 0;
    }
    
}
