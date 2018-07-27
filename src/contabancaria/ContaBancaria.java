
package contabancaria;


public class ContaBancaria {

    public static void main(String[] args) {
      Conta conta1 = new Conta();
      Conta conta2 = new Conta();

     conta2.deposita(0);
      
      conta1.setNumero(0);
     
      
      System.out.print("Olá digite vou transferir seu dinheiro:\n");
      //System.out.print(conta2.saldo);
      System.out.print("\n Transferindo...");
      conta1.transfere(conta2, 2000);
    //  System.out.print("Saldo atual:"+conta2.saldo );

    }
    
}
