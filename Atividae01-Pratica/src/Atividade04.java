import java.time.LocalDate;
import java.util.Scanner;

public class Atividade04 {
    public static void main() {

        String nome = "";
        int anoNascimento = 0;
        int anoAtual = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu ano de nascimento: ");
        anoNascimento = sc.nextInt();

        System.out.println("Informe o ano atual");
        anoAtual = sc.nextInt();

        int calcIdade = (anoNascimento - anoAtual);

        System.out.println("Sua Idade é aproximadamente : " + calcIdade);

    }

}
