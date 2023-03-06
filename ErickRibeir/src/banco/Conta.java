/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author 11067060642
 */
public class Conta {
    
    String cliente;
    double saldo, limite;
        
    public void deposita(double saldo){
           this.saldo = this.saldo + saldo; 
           System.out.println("Depósito efetuado com sucesso!!");
           
        }   
}
