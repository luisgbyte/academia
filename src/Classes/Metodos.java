package Classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author my eggs
 */
public class Metodos{
    //dia de pagamento
    public static LocalDate diaPagamento(int x){
        
        LocalDate ultimoPag = CadastroCliente.vetCadastro.get(x).getDataDoCadastro();

        int ano = ultimoPag.getYear();
        int mes = ultimoPag.getMonthValue();
        int dia = ultimoPag.getDayOfMonth();
        
            //verificando se está em Dezembro e trocando o ano do dia de pagamento
            if(mes == 12){
                ano = ultimoPag.getYear()+1;
                mes = 1;
            }else{
                mes = mes+1;
            }
            
        return LocalDate.of(ano, mes, dia);
    }
    //formatar datas
    public static String formatarDatas(LocalDate data){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(formatador); //16/10/2018
    }
    //inicialisar situação
    public static void Situacao(){
        for(int x = 0; x < CadastroCliente.vetCadastro.size(); x++){
        
        LocalDate ultimoPag = CadastroCliente.vetCadastro.get(x).getDataDoCadastro(); 
        
        LocalDate dataAtual = LocalDate.now();
        
        LocalDate dia_pag = Metodos.diaPagamento(x);
        
        long comparacao = ultimoPag.until(dataAtual.minusDays(1), ChronoUnit.DAYS);
        
          //String status = "Em dia";
          double mensalidade = 60.0;

              if(comparacao > 25 && comparacao <= 30){
                  CadastroCliente.vetCadastro.get(x).setStatus("Pendente");  
              }else if(comparacao > 30){
                  CadastroCliente.vetCadastro.get(x).setStatus("Inativo");  
              }
        }
    }
    
}
