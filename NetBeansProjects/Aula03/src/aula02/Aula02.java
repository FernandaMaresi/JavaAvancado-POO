/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author fernanda.maresi
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        //referencia a atributo
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        /*Nessa aula de POO, vamos aprender como funcionam os Métodos 
                Acessores (Getters),
        Métodos Modificadores (Setters) e 
                Métodos Construtores (Construct) 
                        para a Programação Orientada a Objetos.*/
        
    }
    
}
