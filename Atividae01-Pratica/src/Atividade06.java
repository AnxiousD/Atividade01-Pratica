import java.util.Scanner;

public class Atividade06 {

    public static void main() {

        String nomePr = "";
        double comprTerreno = 0;
        double largTerreno = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o comprimento do terreno em Metros: ");
        comprTerreno = sc.nextDouble();

        System.out.println("Informe a Largura do terreno em metros: ");
        largTerreno = sc.nextDouble();

        double area = (comprTerreno * largTerreno);

        System.out.println("A area total do seu terreno em metros quadrados é: " + area);

    }

}
