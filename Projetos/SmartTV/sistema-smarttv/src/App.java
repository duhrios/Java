
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv.ligada);
        System.out.println("Canal Atual:" + smartTv.canal);
        System.out.println(smartTv.volume);

        smartTv.ligar();
        
        System.out.println("Novo Status -> Tv Ligada ? " + smartTv.ligada);

        
        smartTv.canalMaior();
        System.out.println("Proximo canal: " + smartTv.canal);


        smartTv.volumeMaior();
        System.out.println("Novo Status do valume -> " + smartTv.volume);

        

        
        
    
    }
}
