import java.util.Scanner;


public class menu_conta {

    public static void menu(){

        System.out.println(" -------- Conta Bancária --------");
        System.out.println("       1 - Criar conta           ");
		System.out.println("       2 - Saldo em conta        ");
		System.out.println("       3 - Limite da conta       ");
		System.out.println("       4 - Realizar saque        ");
		System.out.println("       5 - Realizar depósito     ");
		System.out.println("       6 - Realizar transferência");
		System.out.println("       7 - Sair                  ");
		System.out.println("       Digite uma dessas opções: ");
    }

public static void main(String[] args) {
    int opcao = 0;

    Scanner ler = new Scanner(System.in);
    menu();
    opcao = ler.nextInt();

    switch (opcao) {
        case 1:
            criar_conta();
            break;
        case 2:
            saldo();
            break;
        case 3:
            limite();
            break;
        case 4:
            sacar();
            break;
        case 5:
            conta.deposito(double);
            break;
        case 6:
            transferir();
            break;
        case 7:
            sair();
            System.out.println("Encerrando atendimento!");
            break;
    
        default:
            System.out.println("Opção inválida, tente novamente");
            break;
    }
    ler.close();
}


private static void criar_conta() {
}

private static void sair() {
}

private static void transferir() {
}


private static void deposito() {
}


private static void sacar() {
}


private static void limite() {
}


private static void saldo() {
}
}
