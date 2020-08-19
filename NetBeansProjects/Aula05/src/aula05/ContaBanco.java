/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author ferfe
 */
public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    public void estadoAtual(){
        System.out.println("==============================");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    
    //Médotos Personalizados
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada, pois ainda tem débito");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
        
    }
    public void depositar(float v){
        if(this.isStatus()){
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta " + this.getDono());
        } else{
           System.out.println("Impossível depositar em uma conta fechada!");
        }
        
    }
    public void sacar(float v){
       if(this.isStatus()){
           if (this.getSaldo() >= v){
               this.setSaldo(this.getSaldo() - v);
               System.out.println("Saque realizado na conta de: "+ this.getDono());
           }else{
               System.out.println("Saldo insuficiênte para saque");
           }
       }else{
           System.out.println("Impossível sacar de uma conta fechada!");
       }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        }else{
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }
    
    //Metodos Especiais
    public void ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta(){
        return this.numConta;
    }
    public String getDono(){
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
    
   
}
