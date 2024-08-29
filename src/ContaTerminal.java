import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados do usuário
        System.out.println("Digite o numero da sua conta:  ");
        long numero = scanner.nextLong();

        System.out.println("Digite a agencia:  ");
        long agencia = scanner.nextLong();

        scanner.nextLine();

        System.out.println("Digite seu nome:  ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite seu saldo:  ");
        double saldo = scanner.nextDouble();

        // Saída de dados
        System.out.println("\n\n-----------------------------------------------------\n");
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco!!!", nomeCliente);
        System.out.printf("Sua agência é %d, conta %d e seu saldo %.2fR$ já está disponível para saque!!!",
                agencia, numero, saldo);
        System.out.println("\n\n-----------------------------------------------------\n\n");

    }
}
