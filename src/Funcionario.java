/*Super classe funcionario*/
/*pode ser considerada classe abstrata*/
    abstract class Funcionario {
        
    public abstract double getBonificacao();
    private double salario;
    public static void main(String[] args){
        Funcionario jose = new Diretor();
        jose.verificarTipoFuncionario(jose);
        jose=new Professor();
        jose.verificarTipoFuncionario(jose);
        ((Diretor)jose).departamento="RH";//Conceito de casting
    }  
    
    void verificarTipoFuncionario(Funcionario objeto){
    
        if(objeto instanceof Diretor){
            System.out.print("Diretor");
        }
        else if (objeto instanceof Professor){
            System.out.print("Professor");
        }
        else{
            System.out.print("Administrativo");
        }
        
    }
 interface Cidadao {
 public void getRg(String numero);
 double Vota(int idade);
}
}
