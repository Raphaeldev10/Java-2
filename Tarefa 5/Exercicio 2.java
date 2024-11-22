import java.util.Scanner;

public class VerificaPositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();


        scanner.close();

   
        if (valor >= 0) {
            System.out.println("O valor é positivo.");
        } else {
            System.out.println("O valor é negativo.");
        }
    }
}
