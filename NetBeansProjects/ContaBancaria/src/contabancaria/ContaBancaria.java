/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancaria;

/**
 *
 * @author ferfe
 */
public class ContaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta conta = new Conta(true, 1000.00);
        conta.setTipo("CC");
        conta.setDono("Fernanda MAresi");
       
        conta.Status();
        conta.abrirConta();
        conta.sacar(500);
        conta.depositar(200);
        
        Conta conta2 = new Conta(true, 700);
        conta2.setTipo("CP");
        conta2.setDono("Cristiano");
        
        conta2.Status();
        conta2.abrirConta();
        conta2.depositar(500);
        conta2.sacar(1350.00);
        
        
    }
    
}
