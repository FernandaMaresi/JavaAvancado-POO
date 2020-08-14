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
public class Aluno {
    
    String nome;
    int idade;
    long cpf;
    String curso;
    String materia;
    float notas;
    String status;
   char opcao;
    
    void aluno(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Idade: "+ this.idade + " anos");
        System.out.println("CPF: "+ this.cpf);
        System.out.println("Curso: " + this.curso);
        System.out.println("Matéria: " + this.materia);
        System.out.println("Notas: "+ this.notas);
       
    }
    void cadastrar(){
        System.out.println("Cadastrado");
    }
    void cancelarCurso(){
        System.out.println("Curso Cancelado");
        if(status == "Cursando"){
            StatusCurso();
        }else {
            System.out.println("Precisa estar cadastro");
            System.out.println("Deseja se cadastrar? [S/N]"+ opcao);
            if(opcao == 'S'){
                cadastrar();
            }else if(opcao == 'N'){
                System.out.println("Cadastro cancelado");
            }else{
                System.out.println("Opção inválida");
            }
        }
    }
    void StatusCurso(){
        if(status == "Cursando"){
            System.out.println("Cursando!");
        }else if(status == "Concluído"){
            System.out.println("Curso Concluído!");
        }else{
            System.out.println("Curso Cancelado!");
        }
    }
    
    
}
