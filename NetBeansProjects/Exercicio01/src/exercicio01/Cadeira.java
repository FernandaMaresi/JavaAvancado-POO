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
public class Cadeira {
    
    String cor;
    boolean rodas;
    boolean bracos;
    boolean almofadas;
    boolean ocupada;
    float altura;
    
    void status(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Tamanho dos rodas: " + this.rodas);
        System.out.println("Tem Braços? " + this.bracos);
        System.out.println("Tem almofadas? " + this.almofadas );
        System.out.println("Está ocupada? " + this.ocupada);
        System.out.println("Altura: " + this.altura + "centímetros");
    }
    
    void sentar(){
        if (this.ocupada == true){
            System.out.println("Cadeira em uso");
        }else{
            System.out.println("Pode sentar");
        }
    }
    void levantar(){
        if(this.ocupada == true){
            System.out.println("Pode levantar");
        }else{
            sentar();
        }
    }
    
    void ocupar(){
        this.ocupada = true;   
    }
    
    void desocupar(){
        this.ocupada = false;     
    }
    
    
}
