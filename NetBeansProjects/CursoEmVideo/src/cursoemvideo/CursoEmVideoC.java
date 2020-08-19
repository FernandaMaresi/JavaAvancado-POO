/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoemvideo;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ferfe
 */
public class CursoEmVideoC {
    
        int quantAulas;
        String nome;
        String dateInicio;
        String dateFim;
        String status;
        char opcao;
        
        void status(){
            System.out.println("Nome do curso: " + this.nome);
            System.out.println("Quantidade de Aulas: " + this.quantAulas);
            
            System.out.println("Status: " + this.status);
        }
        
         void Inscrever(){
            System.out.println("Inscrito");
         }
        
        void StatusCurso(){
            if(status == "Cursando"){
                System.out.println("Curso em Andamento");
            }else if (status == "Concluído"){
                System.out.println("Curso Concluído");
            }else {
                System.out.println("Precisa estar Inscrito para acessar os cursos");
                System.out.println("Deseja se inscrever? [S/N]"+ opcao);
                }if(opcao == 'S'){
                    Inscrever();
                }else if(opcao == 'N'){
                    System.out.println("Inscrito");
                }else{
                    System.out.println("Opção inválida");
                }
        }
        void Datas(){
             //Formata a Data Inicio
            Calendar c = Calendar.getInstance();
	    c.set(2020, Calendar.AUGUST, 14);
            Date data = c.getTime();
	    DateFormat formataData = DateFormat.getDateInstance();
	    System.out.println("Data de Inicio: "+ formataData.format(data));
            
            //Formata a Data Fim
            Calendar c1 = Calendar.getInstance();
            c1.set(2020, Calendar.SEPTEMBER, 14);
            Date data2 = c1.getTime();
            System.out.println("Data de término: "+formataData.format(data2));
        }
}
