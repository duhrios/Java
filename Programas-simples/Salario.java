/* Escreva um programa que leia o número de um funcionário, seu     número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.*/

import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero_do_Funcionario = scanner.nextInt();
        int horas_trabalhadas = scanner.nextInt();
        double valor_horas_trabalhadas = scanner.nextDouble();

        double calculo_salario = valor_horas_trabalhadas * horas_trabalhadas;

        System.out.println(" NUMBER = " + numero_do_Funcionario);






        
        
    }
}
