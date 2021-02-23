/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class AlimentarLista {
    public static //String imagemPadrao = "E:\\Users\\gustavo\\Documents\\NetBeansProjects\\AdecamiaNova\\Academia10\\padrao.jpg";
    String imagemPadrao = "src//Imagens//padrao.jpg";
    public static void main(String[] args){
        
    }
    public static void chamar(){
      //add cliente
      LocalDate data = LocalDate.of(2018, 9, 30); 
      LocalDate data2 = LocalDate.of(2018, 11, 4); 
      LocalDate data3 = LocalDate.of(2018, 8, 4); 
      LocalDate data4 = LocalDate.of(2018, 11, 20);
      
      LocalDate data5 = LocalDate.of(2018, 10, 19); 
      LocalDate data6 = LocalDate.of(2018, 11, 19); 
      LocalDate data7 = LocalDate.of(2018, 11, 18); 
      LocalDate data8 = LocalDate.of(2018, 11, 18);
      
      LocalDate data9 = LocalDate.of(2018, 11, 17); 
      LocalDate data10 = LocalDate.of(2018, 11, 17); 
      LocalDate data11 = LocalDate.of(2018, 11, 16); 
      LocalDate data12 = LocalDate.of(2018, 10, 01);

      CadastroCliente cliente1 = new CadastroCliente();
      CadastroCliente cliente2 = new CadastroCliente();
      CadastroCliente cliente3 = new CadastroCliente();
      CadastroCliente cliente4 = new CadastroCliente();
      
      CadastroCliente cliente5 = new CadastroCliente();
      CadastroCliente cliente6 = new CadastroCliente();
      CadastroCliente cliente7 = new CadastroCliente();
      CadastroCliente cliente8 = new CadastroCliente();
      
      CadastroCliente cliente9 = new CadastroCliente();
      CadastroCliente cliente10 = new CadastroCliente();
      CadastroCliente cliente11 = new CadastroCliente();
      CadastroCliente cliente12 = new CadastroCliente();
      
      cliente1.cadastrar(1, "Bill Gates", "28/09/1955", "Masculino", "(38)56345-6645", "160.465.531-30", "24.977.269", data, "Em dia", "Leo Stronda", "src//Imagens//bill.jpg");
      cliente2.cadastrar(2, "Steve Jobs", "24/02/1955", "Masculino", "(38)56346-7745", "432.737.536-50", "14.122.534", data2, "Em dia", "Titico", "src//Imagens//steve.jpg");
      cliente3.cadastrar(3, "Mark Zuckerberg", "14/05/1984", "Masculino", "(38)56545-8845", "894.316.806-37", "54.342.564", data3, "Em dia", "Leo Stronda", "src//Imagens//mark.jpg" );
      cliente4.cadastrar(4, "Jeff Bezos", "12/01/1964", "Masculino", "(38)12345-9945", "754.531.242-29", "64.545.120", data4, "Em dia", "Leo Stronda", "src//Imagens//jeff.jpg");
      
      cliente5.cadastrar(5, "Ramiro Barber", "07/07/2004", "Masculino", "(38)06640-7298", "051.671.774-05", "41.875.789", data5, "Em dia", "Titico", imagemPadrao);
      cliente6.cadastrar(6, "John Hopkins", "07/07/2004", "Masculino", "(38)35101-0255", "683.236.266-85", "42.943.412", data6, "Em dia", "Leo Stronda", imagemPadrao);
      cliente7.cadastrar(7, "Rafaela Alves", "07/07/2004", "Feminino", "(38)89743-7267", "560.269.159-66", "23.977.269", data7, "Em dia", "Titico", imagemPadrao);
      cliente8.cadastrar(8, "Donald Logsdon", "07/07/2004", "Feminino", "(38)70691-8033", "682.118.050-49", "41.875.789", data8, "Em dia", "Leo Stronda", imagemPadrao);
      
      cliente9.cadastrar(9, "Ágatha Pereira", "07/07/2004", "Feminino", "(38)86446-7013", "415.464.481-52", "22.977.269", data9, "Em dia", "Titico", imagemPadrao);
      cliente10.cadastrar(10, "Tiffany Davis", "07/07/2004", "Feminino", "(38)21995-3789", "514.656.772-75", "43.032.894", data10, "Em dia", "Titico", imagemPadrao);
      cliente11.cadastrar(11, "Alice Cardoso", "07/07/2004", "Feminino", "(38)96556-7461", "481.468.366-90", "41.875.789", data11, "Em dia", "Leo Stronda", imagemPadrao);
      cliente12.cadastrar(12, "Sarah Sousa", "07/07/2004", "Feminino", "(38)19363-0341", "404.818.233-10", "42.943.412", data12, "Em dia", "Leo Stronda", imagemPadrao);
      //CadastroCliente.vetCadastro.add(cliente1);
      
      CadastroCliente.vetCadastro.addAll(Arrays.asList(cliente1, cliente2, cliente3, cliente4, cliente5, cliente6,
                                                    cliente7, cliente8, cliente9, cliente10, cliente11, cliente12
                                                       ));
      
      //add instrutor
      CadastroProfessor professor = new CadastroProfessor();
      CadastroProfessor professor1 = new CadastroProfessor();
      professor.cadastrar(1, "Leo Stronda", "12/12/1999", "Masculino", "(38)99877-7689", "133.565.396-12", "43.545.709", imagemPadrao);
      professor1.cadastrar(2, "Titico", "11/06/1989", "Masculino", "(38)99877-453", "133.565.396-12", "46.565.789", imagemPadrao);
      CadastroProfessor.vetCadProfessor.addAll(Arrays.asList(professor, professor1));
    }
}
