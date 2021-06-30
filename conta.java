public class conta {

    private double saldo;
    int agencia;
    int numero;
    String titular;
    double limite;
    double valor, transferir, sacar;
    String conta_destino;

    //métodos

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
