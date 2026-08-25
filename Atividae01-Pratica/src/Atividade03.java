import java.util.Scanner;

public class Atividade03 {
     public static void main() {

         String nome = "";
         double nota1 = 0;
         double nota2 = 0;
         double nota3 = 0;

         Scanner sc = new Scanner(System.in);

         System.out.println("Informe a primeira nota: ");
         nota1 = sc.nextDouble();

         System.out.println("Infrome a segunda nota: ");
         nota2 = sc.nextDouble();

         System.out.println("Informe a terceira nota: ");
         nota3 = sc.nextDouble();

         double media = (nota1 + nota2 + nota3) / 3;

         System.out.println("media: " + media );

    }
}
