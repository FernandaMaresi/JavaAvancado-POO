/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03.alunos;

/**
 *
 * @author fernanda.maresi
 */
public class Exercicio03Alunos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=======================================");
        Aluno a1 = new Aluno();
        a1.nome = "Fernanda Maresi";
        a1.idade = 31;
        a1.cpf = Long.parseLong("11111111111");
        a1.curso = "Engenharia de Software";
        a1.materia = "Java";
        a1.status = "Cursando";
        a1.notas = 8.5f;
        
        a1.aluno();
        a1.cadastrar();
        a1.StatusCurso();
        a1.cancelarCurso();
        System.out.println("=======================================");
    }
    
}
