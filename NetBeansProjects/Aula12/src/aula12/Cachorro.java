/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author ferfe
 */
public class Cachorro extends Mamifero{
    @Override
    public void locomover(){
        System.out.println("Andando");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }
    
}
