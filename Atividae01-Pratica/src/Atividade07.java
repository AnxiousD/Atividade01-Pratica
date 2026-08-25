import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Atividade07 {

    public static void main() {

        String nomeMot = "" ;
        double distPerc = 0 ;
        double quantLitros = 0 ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a distancia percorrida em quilometros: ");
        distPerc = sc.nextDouble();

        System.out.println("Informe a quantidade de Litros utilizada");
        quantLitros = sc.nextDouble();

        double consumo = (distPerc / quantLitros);

        System.out.println("Consumo medio de : " + consumo);

    }

}
