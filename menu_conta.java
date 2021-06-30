import java.util.Scanner;
public class menu_conta {

    public static void menu(){

        System.out.println(" -------- Conta Bancária --------");
		System.out.println("       1 - Saldo em conta        ");
		System.out.println("       2 - Limite da conta       ");
		System.out.println("       3 - Realizar saque        ");
		System.out.println("       4 - Realizar depósito     ");
		System.out.println("       5 - Realizar transferência");
		System.out.println("       6 - Sair                  ");
		System.out.println("       Digite uma dessas opções: ");
    }


public static void main(String[] args) {
    int opcao = 0;

    Scanner ler = new Scanner(System.in);
    menu();
    opcao = ler.nextInt();

    switch (opcao) {
        case 1:
            saldo();
            break;
        case 2:
            limite();
            break;
        case 3:
            sacar();
            break;
        case 4:
            deposito();
            break;
        case 5:
            transferir();
            break;
        case 6:
            sacar();
            break;
    
        default:
            System.out.println("Opção inválida, tente novamente");
            break;
    }
    ler.close();
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
