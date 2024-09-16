/* Faça um programa que leia o nome de um vendedor, o seu   * salário fixo e o total de vendas efetuadas por ele no    * mês *(em dinheiro). Sabendo que este vendedor ganha 15%  * de  comissão sobre suas vendas efetuadas, informar o     * total a  receber no final do mês, com duas casas         * decimais.*/

import java.util.Scanner;

public class formula15 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String nome_vendedor = scanner.nextLine();
    double salario_fixo = scanner.nextDouble();
    double total_vendas = scanner.nextDouble();
    double comissao = total_vendas * 0.15;

    System.out.printf("TOTAL = R$ %.2f", comissao);

      
  }

  
}
