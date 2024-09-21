import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
    try{
      Scanner scanner = new Scanner(System.in);
        int numero_do_Funcionario = scanner.nextInt();
        int horas_trabalhadas = scanner.nextInt();
        double valor_horas_trabalhadas = scanner.nextDouble();

        double calculo_salario = valor_horas_trabalhadas * horas_trabalhadas;

        System.out.println(" NUMBER = " + numero_do_Funcionario);
        System.out.printf("SALARY = U$ %.2f%n", calculo_salario);
    }    catch( InputMismatchException e){        System.out.println("Por Favor! \nDigite apenas numeros e se for necessario colocar (,) coloque (.). \n\nObrigado!");
   }    
   scanner.close();
  
  }
}