import java.util.Scanner;
public class IfSimples {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        double saldo = 5000;

        System.out.println("Digite o valor que será sacado:");
        double saque = scanner.nextDouble();

        if (saque <= saldo){
            saldo = saldo - saque;
        }
        else{
            System.out.println("Operação invalida \nSaque maior que saldo atual!");
        }
        System.out.println(saldo);    

    
}
}
