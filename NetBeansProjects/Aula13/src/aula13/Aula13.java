/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

/**
 *
 * @author ferfe
 */
public class Aula13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cachorro c = new Cachorro();
        c.reagir("Olá");         //Abanar e Latir
        c.reagir("Vai Apanhar!");//Rosnar
        c.reagir(11, 45);        // Abanar
        c.reagir(21, 00);        //Ignorar
        c.reagir(true);          //Abanar
        c.reagir(false);         //Rosnar e Latir
        c.reagir(2,12.5f);       //Latir
        c.reagir(17, 4.5f);      //Rosnar
        
        
        //Animal x = new Animal();
       /* Mamifero x = new Mamifero();
        x.emitirSom();
        
        Lobo l = new Lobo();
        l.emitirSom();
        
        Cachorro c = new Cachorro();
        c.emitirSom();*/
        
    }
    
}
