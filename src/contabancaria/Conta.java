
package contabancaria;


public class Conta {

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
private  int  numero;
private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return saldo+limite;
    }
  double  limite ; 
  String nome;
  
  public boolean saca(double valor){
      if ( valor <= saldo){
      saldo = saldo - valor;
          return true;
      }
      else
          return false;// nao consegui realizar saque
  }
  
  public void deposita(double valor){
  saldo = saldo+valor;
  }
  
  public void transfere(Conta destino, double  valor){
      if( valor<= saldo){
      this.saldo=this.saldo - valor;
      destino.deposita(valor);
      }
      else
          System.out.print("Não foi possivel realizar a transferencia!");
  }
  




}
