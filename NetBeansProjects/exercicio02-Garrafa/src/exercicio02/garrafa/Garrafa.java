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
public class Garrafa {
    
    String modelo;
    String cor;
    boolean cordinha;
    boolean tampada;
    boolean rosca;
    
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Cordinha: "+ this.cordinha);
        System.out.println("Tampa: " + this.tampada);
        System.out.println("Rosca: " + this.rosca);
    }
    
    void abrir(){
        if(tampada == true){
        System.out.println("Abrindo a garrafa");
        }else{
            System.out.println("A garrafa já está aberta");
        }
    }
    
    void fechar(){
        System.out.println("Fechando a garrafa");
    }
    
}
