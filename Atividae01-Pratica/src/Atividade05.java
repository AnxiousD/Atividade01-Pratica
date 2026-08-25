import java.util.Scanner;

public class Atividade05 {

    public static void main() {

        String nomeFunc = "";
        int quantHorasTr = 0;
        double valorHr = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        nomeFunc = sc.nextLine();

        System.out.println("Informe a Quantidade de horas Trabalhadas: ");
        quantHorasTr = sc.nextInt();

        System.out.println("Informe o valor ganho por Hora trabahada: ");
        valorHr = sc.nextDouble();

        double valorSalario = (quantHorasTr * valorHr);

        System.out.println("Seu Nome é" + nomeFunc + "Seu salario é" + valorSalario);




    }
}
