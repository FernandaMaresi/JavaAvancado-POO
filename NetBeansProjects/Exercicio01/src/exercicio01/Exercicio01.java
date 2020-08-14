/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

/**
 *
 * @author fernanda.maresi
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cadeira  c1 = new Cadeira();
        c1.cor = "Preta";
        c1.almofadas = true;
        c1.bracos = true;
        c1.ocupada = true;
        c1.rodas = true;
        c1.altura = 54f;
        
        c1.status();
        c1.sentar();
        c1.levantar();
        
        System.out.println(" ");
        
        Cadeira c2 = new Cadeira();
        c2.cor = "Prata";
        c2.almofadas = false;
        c2.bracos = false;
        c2.ocupada = false;
        c2.rodas = false;
        c2.altura = 60f;
        
        c2.status();
        
        
        
    }
    
}
