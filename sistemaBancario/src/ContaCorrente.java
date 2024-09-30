public class ContaCorrente extends Conta{
    
        //CONSTANTE DENTRO DO JAVA, ESTATICA E ela deve ser uma info em relação a essa
        //classe
      

 
    public ContaCorrente(Cliente cliente) {
        super(cliente);
      
    }

    @Override
    public void imprimirExtrato(){

        System.out.println("=== Extrato Conta corrente ===");
        super.imprimirInfosConta();
    }
}
