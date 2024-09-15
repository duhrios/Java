import java.util.Scanner; 

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
    Scanner scanner = new Scanner(System.in);

    ContaPadrao conta1 = new ContaPadrao();

    System.out.print("Por favor, digite o Seu nome: ");
    conta1.nome_cliente = scanner.nextLine(); 

    System.out.print("Por favor, digite o número da Agência: ");
    conta1.agencia = scanner.nextLine();

    System.out.print("Por favor, o numero da conta: ");
    conta1.numero_conta = scanner.nextInt();

    System.out.print("Por favor, digite o valor do deposito: ");
    conta1.saldo = scanner.nextDouble(); 

    System.out.println(" Olá " + conta1.nome_cliente + " obrigado por criar uma conta em nosso banco, sua agência é: "+ conta1.agencia + " conta: " + conta1.numero_conta + " e seu saldo: " + conta1.saldo + " está disponível para saque");
        
       
    }
}
