import java.util.Scanner;

public class SomaQuadrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Digite o valor de A: ");
        double A = scanner.nextDouble();
        
        System.out.println("Digite o valor de B: ");
        double B = scanner.nextDouble();
        
        System.out.println("Digite o valor de C: ");
        double C = scanner.nextDouble();
        
        
        double somaQuadrados = (A * A) + (B * B) + (C * C);
        
      
        System.out.println("A soma dos quadrados dos valores A, B e C é: " + somaQuadrados);
        
        scanner.close();
    }
}
