package projetolivro;

import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ferfe
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    public Pessoa( String nome, int idade,String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
       
    }
    public void fazerAniversario(){
        this.idade++;
        
    }
    
    //Metodos Especiais
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
