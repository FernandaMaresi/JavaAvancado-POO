/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoemvideo;

import java.util.Calendar;

/**
 *
 * @author ferfe
 */
public class CursoEmVideo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
	Calendar c = Calendar.getInstance();
        
        Calendar c2 = Calendar.getInstance();
           
        CursoEmVideoC cv1 = new CursoEmVideoC();
        cv1.nome = "Java";
        cv1.quantAulas = 30;
        //data inicio
        c.set(2020, Calendar.AUGUST, 14);
        
        //data fim
        c.set(2020, Calendar.SEPTEMBER, 14);
        cv1.status =  "Concluído";
        cv1.status();
        cv1.StatusCurso();
        
        System.out.println(" ");
        CursoEmVideoC cv2 = new CursoEmVideoC();
        cv2.nome = "Curso POO - Java";
        cv2.quantAulas = 15;
         //data inicio
        c.set(2020, Calendar.MARCH, 10);
        
        //data fim
        c.set(2020, Calendar.APRIL, 10);
        cv2.status = "Não Inscrito";
        
        //metodos
        cv2.status();
        cv2.StatusCurso();  
        cv2.Inscrever();
       
    }
    
}
