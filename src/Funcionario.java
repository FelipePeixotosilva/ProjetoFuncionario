/*Super classe funcionario*/
public class Funcionario {
    
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
}
