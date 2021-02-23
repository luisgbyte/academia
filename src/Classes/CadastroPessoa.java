
package Classes;
import java.time.Period;
import br.com.caelum.stella.ValidationMessage;
import br.com.caelum.stella.validation.CPFValidator;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class CadastroPessoa{
    private int id;
    private String nome;
    private String dataNasc;
    private String sexo;
    private String telefone;
    private String cpf;
    private String rg;
    private String caminhoFoto;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCaminhoFoto() {
        return caminhoFoto;
    }

    public void setCaminhoFoto(String caminhoFoto) {
        this.caminhoFoto = caminhoFoto;
    }
    
    
    public void cadastrar(int id, String nome, String dataNasc, String sexo, String telefone, String cpf, String rg, String caminhoFoto){
       setId(id);
       setNome(nome);
       setDataNasc(dataNasc);
       setSexo(sexo);
       setTelefone(telefone);
       setCpf(cpf);
       setRg(rg);
        setCaminhoFoto(caminhoFoto);
    }
    
    //metodos de validacao
    //validar campos String
    public boolean validarCampoString(javax.swing.JTextField campo){
        if(!campo.getText().equals("") && campo.getText().matches("[a-zA-Z\\u00C0-\\u00FF ]+")){   
            return true;
        }else{
            campo.requestFocus();
            return false;
        }
    }
    //validar combo box
    public boolean validarComboBox(javax.swing.JComboBox<String> campo){
        if(campo.getSelectedIndex() > 0){
            return true;
        }else{
            campo.requestFocus();
            return false;
        }
    }
    //campos em branco: JtFormated  
    public boolean validarCampoVazio(javax.swing.JFormattedTextField campo){   
        String t1 = campo.getText().replaceAll("[ ..-//()-]","");

        if(!t1.isEmpty()){
            return true;
        }else{
            campo.requestFocus();
            return false;
        } 
    }
    //valida extritamente o campo número da casa
    public boolean validarCampoInt(javax.swing.JTextField campo){
        if(!campo.getText().equals("") && campo.getText().matches("[0-9]+") && campo.getText().length() < 4){
            return true;
        }else{
            campo.requestFocus();
            return false;
        }
    }
    public boolean validarJcomboBox(javax.swing.JComboBox<String> campo){
        if(!campo.getSelectedItem().toString().equals("Selecione")){
            return true;
        }else{
            campo.requestFocus();
            return false;
        }
    }
    //validar cpf
    public boolean validarCpf(javax.swing.JFormattedTextField campo) {
        
        String cpf = campo.getText().replaceAll("/./-","");//retira máscara do campo formatado
        CPFValidator cpfValidator = new CPFValidator();
        
        List<ValidationMessage> erros = cpfValidator.invalidMessagesFor(cpf);
        
        if(erros.size() > 0){//retorna item na lista se existir erro
            campo.requestFocus();
            return false;
        }else{
            return true;
        }
    }
    //Validar data de nascimento
    public boolean validarCampoDataNasc(javax.swing.JFormattedTextField campo) {
        String dataNasc = campo.getText();
        
        if(data(dataNasc) && validandoIdade(dataNasc)){ 
            return true;
        }else{
            campo.requestFocus();
            return false;
        }
    }
    //verificando se a data eh valida
    public boolean data(String data) {
        try { 
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
            sdf.setLenient(false);
            sdf.parse(data);
          
            return true;
            
        } catch (ParseException ex) {
            return false;
        }
    }
    //verificando se idade eh valida
    public boolean validandoIdade(String dataNascimento){
          //data de hoje
          LocalDate dataAtual = LocalDate.now();
          
          //convertendo string para local date
          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
          LocalDate date = LocalDate.parse(dataNascimento,formatter);
          
          //só utilizado para comparar ano de nascimento até ano atual;
          Period periodo = Period.between(date, dataAtual);

          int idade = periodo.getYears();

          //rotiva para verificar se o cliente possue a idade mínima para se cadastrar 
          if(idade >= 10 && idade < 100){
              return true;
          }else{
              return false;
          }
    }
    //Fim

}

