/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancaria;

/**
 *
 * @author FELIP
 */
public class ContaBancaria {


    public static void main(String[] args) {
      Conta conta1 = new Conta();
      Conta conta2 = new Conta();
     conta2.saldo=223;
      conta1.numero=123;
      conta1.saldo=2000;
     
      
      System.out.print("Olá digite vou transferir seu dinheiro:\n");
      System.out.print(conta2.saldo);
      System.out.print("\n Transferindo...");
      conta1.transfere(conta2, 2000);
      System.out.print("Saldo atual:"+conta2.saldo );
    }
    
}
