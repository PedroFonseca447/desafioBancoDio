import java.rmi.RemoteException;

public interface Iconta {


    //essa interface é uma classe abstrata com todos os metodos abstratos
    //obriga  quem a extender, a implementar tudo que ela tem

    void sacar(double valor) throws RemoteException;
       
    void depositar(double valor) throws RemoteException;  
    
    void transferir(double valor, Conta contaDestino) throws RemoteException;

    void imprimirExtrato();
}
