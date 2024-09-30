import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class Banco {
   
    public String nome;
    private List<Conta> contas;

    

    public Banco() {
        
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   
   public void adicionarContaCorrente(ContaCorrente conta){
        contas.add(conta);
   }

   public void adicionarContaPoupanca(ContaPoupanca conta){
    contas.add(conta);
}
    
    public void apagarConta(int id) {

        for(Conta conta:contas){
            if(id==conta.getNumero()){
                contas.remove(conta);
            }
        }

    }

    public void imprimirContasAlfabetica() {

        contas.sort((p1, p2) -> p1.getCliente().getNome().compareToIgnoreCase(p2.getCliente().getNome()));

        for (Conta conta : contas) {
            System.out.println(conta.getCliente().getNome() + " - Conta número: " + conta.getNumero());
        }

    }

   
    
}
