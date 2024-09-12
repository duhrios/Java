/** calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5 **/

import java.util.Scanner;

public class Media2 {

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    double primeira_nota = sc.nextDouble();
    
    double segunda_nota = sc.nextDouble();
    
    double teceira_nota = sc.nextDouble();

    double peso1 = 2.0;
    double peso2 = 3.0;
    double peso3 = 5.0;

    double media_ponderada = (primeira_nota * peso1 + segunda_nota * peso2 + teceira_nota * peso3);

    double media = media_ponderada / (peso1 + peso2 + peso3);

    System.out.println("MEDIA = " + String.format("%.1f", media));


    
  }
}