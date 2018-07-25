
package contabancaria;


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
