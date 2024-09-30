public class main {
    
    public static void main (String [] args){

        Banco banco = new Banco();

        // Criação de clientes
        Cliente leticia = new Cliente("Leticia",1);
        Cliente bruno = new Cliente("Bruno",2);
        Cliente amanda = new Cliente("Amanda",2);
        Cliente carlos = new Cliente("Carlos",3);
        // Criação de contas correntes
        ContaCorrente conta1 = new ContaCorrente( leticia);
        
        ContaCorrente conta2 = new ContaCorrente( bruno);
        ContaCorrente conta3 = new ContaCorrente( amanda);
        ContaCorrente conta4 = new ContaCorrente( carlos);

        // Adiciona as contas no banco
        banco.adicionarContaCorrente(conta1);
        banco.adicionarContaCorrente(conta2);
        banco.adicionarContaCorrente(conta3);
        banco.adicionarContaCorrente(conta4);

        // Testa a ordenação e imprime as contas em ordem alfabética
        System.out.println("Contas em ordem alfabética:");
        banco.imprimirContasAlfabetica();
       
    }
}
