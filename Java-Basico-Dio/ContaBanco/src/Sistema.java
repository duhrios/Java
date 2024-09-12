import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String agencia;
    String nomeCliente;
    float Saldo;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        ContaTerminal conta1 = new ContaTerminal();

        System.out.println("Digite Seu nome: ");
        conta1.nomeCliente = scanner.nextLine();

        System.out.println("Digite a agência:");
        conta1.agencia = scanner.nextLine();

        System.out.println("Digite o numero da conta:");
        conta1.numero = scanner.nextInt();

        System.out.println("Digite o valor do deposito:");
        conta1.Saldo = scanner.nextFloat();

        System.out.printf("Olá %s, sua agência e conta são %s, %d. E seu saldo atual é: %.2f R$\n",conta1.nomeCliente, conta1.agencia, conta1.numero, conta1.Saldo);
    }
}