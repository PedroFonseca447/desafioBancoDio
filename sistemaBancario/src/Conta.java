public abstract class Conta implements Iconta{
    
    protected static final int AGENCIA_PADRAO = 1;

    protected int numero;
    protected int agenciaId;
    protected double saldo;
    protected String nomeCliente;
    private Cliente cliente;


    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente){
        this.agenciaId = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL ++;
        this.cliente = cliente;

    }
   



    public int getNumero() {
        return numero;
    }



    public Cliente getCliente() {
        return cliente;
    }




    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }




    public int getAgenciaId() {
        return agenciaId;
    }



    public double getSaldo() {
        return saldo;
    }



    @Override
    public void sacar(double valor) {

        if(valor > saldo){
            throw new ILLEGAL_ARGUMENT_EXCEPTION("VALOR SACADO INVALIDO");
        }

        saldo -= valor;
        
    }



    @Override
    public void depositar(double valor) {

        if(valor  < 0){
            throw new ILLEGAL_ARGUMENT_EXCEPTION("valor depositado é invalido");
        }

        saldo += valor;
        
    }



    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);//retira do saque
        contaDestino.depositar(valor);//manda ao destino
      
    }

    protected void imprimirInfosConta(){
        System.out.println(String.format("Titular: %s", cliente.getNome()));
        System.out.println(String.format("Id: %d", cliente.getId()));
        System.out.println(String.format("Agencia: %d", this.agenciaId));
        System.out.println(String.format("numero: %d", this.numero));
        System.out.println(String.format("saldo: %2f", this.saldo));
        
    }
}
