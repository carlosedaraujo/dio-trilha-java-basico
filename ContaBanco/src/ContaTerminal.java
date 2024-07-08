import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o número da conta:");
            int numero = scanner.nextInt();
            System.out.println("Digite a agência:");
            scanner.nextLine();
            String agencia = scanner.nextLine();
            System.out.println("Digite o nome do cliente:");
            String nomeCliente = scanner.nextLine();
            System.out.println("Digite o saldo:");
            Float saldo = scanner.nextFloat();
            System.out.println("Número: " + numero);
            System.out.println("Agência: " + agencia);
            System.out.println("Nome do cliente: " + nomeCliente);
            System.out.println("Saldo: " + saldo);

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        }
    }
}