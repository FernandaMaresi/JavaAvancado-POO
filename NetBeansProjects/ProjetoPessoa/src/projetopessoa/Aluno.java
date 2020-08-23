/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopessoa;

/**
 *
 * @author ferfe
 */
public class Aluno extends Pessoa{
    //Atributos 
    private int matr;
    private String curso;
    
    //Metodos 
    public void cancelarMar(){
        System.out.println("Matricula será cancelada");
    }
    //Metodos Especiais

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
