public class teste_banco{
    public void main(String[] args){
        //CRIAR CONTA NO BANCO
        conta suaConta = new conta(0152, 896541);
        conta segConta = new conta(0152, 987412);

        conta.setTitular(new Client());
        conta.getTitular().setNome("Laila");
        conta.getTitular().setCpf("0101552036");
        conta.getTitular().setJob("Astronauta");

        suaConta.deposito(500);
        suaConta.sacar(50);
        suaConta.transferir(250, segConta);
        segConta.sacar(100);
        segConta.deposito(20);

        try {
            segConta.sacar(1);
        } catch (RuntimeException e) {
            System.out.println("Saldo não disponível. Limite insuficiente");
        }








    }
}