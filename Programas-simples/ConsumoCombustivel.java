/* Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).*/

import java.util.Scanner;

public class ConsumoCombustivel {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int distenciaPercorrida = scanner.nextInt();
    double combustivel = scanner.nextDouble();
    double medio = distenciaPercorrida / combustivel;

    System.out.printf ("%.2f km/l%n", medio);

    scanner.close();
    
  }
}
