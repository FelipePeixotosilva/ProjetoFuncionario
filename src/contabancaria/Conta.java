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
public class Conta {
  int  numero;
 double saldo;
  double  limite ; 
  String nome;
  
  public boolean saca(){
      return true;
  }
  
  public double deposita(double valor){
  return valor;
  }
  
  public void transfere(Conta destino, double  valor){
  destino.saldo=destino.saldo+valor;
  }
  
          
  
      
    

}
