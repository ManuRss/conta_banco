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
            conta suaConta = new conta(5555, 888888);
            break;
        case 2:
            System.out.println("Seu Saldo é de: " + suaConta.getSaldo());
            break;
        case 3:
            double limite = 5000;
            System.out.println("Seu limite é "+ suaConta.getLimite());
            break;
        case 4:
            Scanner sacar = new Scanner(System.in);
            break;
        case 5:
            Scanner contadeposito = new Scanner(System.in);
            break;
        case 6:
            Scanner contatransferir =  new Scanner(System.in);
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

private static void sair() {
}


}
