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
public class Conta {
    protected int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    private float taxa;
   
    public Conta(boolean st, double s){
        this.status = st;
        this.saldo = s; 
        System.out.println(" ");
    }
    public void Status(){
        System.out.println("Tipo de Conta: " + getTipo());
        System.out.println("Nome do dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: "+ isStatus());
        taxaMensal();
        System.out.println("Taxa Mensal: " + getTaxa() );
        
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    public void abrirConta(){
        status = true;
        tipo = getTipo();
        if(tipo == "CC" ){
            saldo = saldo + 50;
        }else{
            saldo = saldo + 150;
        }
        
    }
    public void fecharConta(){
        if(saldo == 0){
            System.out.println("Conta fechada");
        }else{
            System.out.println("Essa conta não pode ser fechada");
        }
    }
    public double depositar(double  deposito){
        status = true;
        this.saldo += deposito;
        System.out.println("Saldo atual: "+ saldo);
        return saldo;
       
    }
    
    public double sacar(double valorSaque){
        status = true;
        
        if(valorSaque <= saldo){
            saldo -= valorSaque;
        }
        System.out.println("Saldo: "+ saldo);
        return saldo;
    }

    public double taxaMensal(){
        status = true;
        if(tipo == "CC"){
            taxa = 12;
        }else{
            taxa = 20;
        }
        return saldo;
    }
   
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
