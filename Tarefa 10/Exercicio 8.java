import java.util.Scanner;

public class ProdutoSoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.println("Digite o valor de A: ");
        int A = scanner.nextInt();
        
        System.out.println("Digite o valor de B: ");
        int B = scanner.nextInt();
        
        System.out.println("Digite o valor de C: ");
        int C = scanner.nextInt();
        
        System.out.println("Digite o valor de D: ");
        int D = scanner.nextInt();
        
      
        int produto = A * C;
        
      
        int soma = B + D;
        
     
        System.out.println("O produto de A e C é: " + produto);
        System.out.println("A soma de B e D é: " + soma);
        
        scanner.close();
    }
}
