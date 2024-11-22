import java.util.Scanner;

public class TrocaValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite o valor para A: ");
        String A = scanner.nextLine();

        System.out.print("Digite o valor para B: ");
        String B = scanner.nextLine();

   
        System.out.println("Valores antes da troca:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);

        String temp = A;
        A = B;
        B = temp;

        System.out.println("\nValores depois da troca:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);

        scanner.close();
    }
}
