import java.util.Scanner;

public class Atividade02 {

    public static void main(String[] args) {

        int primeirovalor = 0;
        int segundovalor = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro valor");
        primeirovalor = sc.nextInt();

        System.out.println("Informe o segundo valor");
        segundovalor = sc.nextInt();

        int soma = primeirovalor + segundovalor;
        double divisao = primeirovalor / segundovalor;
        int multiplicacao = primeirovalor * segundovalor;
        int subtrcao = primeirovalor - segundovalor;

        System.out.println("Soma : " + soma);
        System.out.println("Divisao : " + divisao);
        System.out.println("Multplicação : " + multiplicacao);
        System.out.println("Subtração : " + subtrcao);

    }

}
