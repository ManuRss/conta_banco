public class conta {

    private static int total;
    double saldo;
    private int agencia;
    private int numero;
    private String titular;
    double limite; deposito;
    double valor, transferir, sacar; 
    String conta_destino;

    public conta(int agencia, int numero){
        conta.total++;
        System.out.println("O total de contas é " + conta.total);
        this.setAgencia(agencia);
        this.numero = numero;
        this.saldo = 100; 
        System.out.println("Estou criando uma conta" + this.numero);
    }

    //métodos

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

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

    public boolean transferir(double valor, conta conta_destino){
        if(this.saldo >= valor){
            this.transferir(valor, conta_destino);
            conta_destino.deposito(valor);
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return saldo;
    }

    public double setSaldo(double saldo){
        return this.saldo;
    }

    public void Sair(){
        System.out.println("O atendimento séra finalizado!");
    }  
    
}
