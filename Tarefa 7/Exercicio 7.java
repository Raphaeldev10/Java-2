import java.util.Scanner;

public class ComparadorDeValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
  
        System.out.println("Digite o primeiro valor:");
        double valor1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo valor:");
        double valor2 = scanner.nextDouble();
        
   
        if (valor1 == valor2) {
            System.out.println("Números iguais");
        } else if (valor1 > valor2) {
            System.out.println("Primeiro é maior");
        } else {
            System.out.println("Segundo é maior");
        }
        
        scanner.close();
    }
}
