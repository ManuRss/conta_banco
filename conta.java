public class conta {

    private double saldo;
    private int agencia;
    private int numero_conta; 
    private cliente_dados titular;
    double limite;
   
    private static int contatotal;

    //MÉTODOS

    public conta(int agencia, int numero_conta){
        this.agencia = agencia;
        this.numero_conta = numero_conta;
        contatotal++;
        System.out.println("A conta " + this.numero_conta + "foi criada com êxito!");
        
    }

    //métodos operações na conta

    public void deposito(double valor){
        this.saldo+=valor;
    }

    public boolean sacar(double valor){
        if (this.saldo >= valor){
            this.saldo-=valor;
            return true;
        }
        return false;
    }

// usa-se this.sacar pois a transferencia é entendida como um saque na conta

    public boolean transferir(double valor, conta conta_destino){
        if(this.saldo >= valor){
            this.sacar(valor);
            conta_destino.deposito(valor);
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return saldo;
    }

    public double getLimite(){
        return limite;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public cliente_dados getTitular() {
        return titular;
    }

    public void setTitular(cliente_dados titular) {
        this.titular = titular;
    }

  
    public static int getContatotal() {
        return contatotal;
    }

    public void Sair(){
        System.out.println("O atendimento séra finalizado!");
    }

    public String saldo(int i) {
        return null;
    }  
    
}
