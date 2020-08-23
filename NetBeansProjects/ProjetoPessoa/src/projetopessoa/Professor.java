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
public class Professor extends Pessoa{
    //Atributos
    private String especialidade;
    private float salario;
    
    //Metodos
    public void receberAumento(float aum){
        this.salario += aum;
        //this.salario = salario + aum;
    }
    
    //Metodos Especiais
    public String getEspecialidade(){
        return this.especialidade;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public float getSalario(){
        return this.salario;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }
    
}
