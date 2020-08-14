/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02.garrafa;

/**
 *
 * @author fernanda.maresi
 */
public class Exercicio02Garrafa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==============================");
        System.out.println("Primeira Garrafa");
        Garrafa g1 = new Garrafa();
        g1.modelo = "Tapuware";
        g1.cor = "Rosa com azul";
        g1.cordinha = true;
        g1.tampada = true;
        g1.rosca = true;
        
        g1.status();
        g1.abrir();
        g1.fechar();
        System.out.println("==============================");
        System.out.println(" ");
        System.out.println("Segunda Garrafa");
        Garrafa g2 = new Garrafa();
        g2.modelo = "Avon";
        g2.cor = "Transparente";
        g2.cordinha = false;
        g2.tampada = false;
        g2.rosca = false;
        
        g2.status();
        g2.abrir();
        g2.fechar();
        
        System.out.println("==============================");
       
       
    }
    
}
