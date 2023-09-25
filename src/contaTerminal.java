import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroConta;
        String agencia;
        String nomeCliente;
        Double saldo;

        System.out.println("Olá! Para começar, digite seu nome:");
        nomeCliente = scanner.nextLine();

        System.out.println("Agora, digite o número da sua conta bancaria:");
        numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número da sua agência com o dígito:");
        agencia = scanner.nextLine();

        System.out.println("Digite seu saldo atual:");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso" +
                " banco. Sua agência é " + agencia +
                "conta " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque");

    }
}