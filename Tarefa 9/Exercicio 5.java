import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalFatorial = 0;
        
        System.out.println("Digite 15 valores inteiros:");
        
        for (int i = 0; i < 15; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            int valor = scanner.nextInt();
            totalFatorial += calcularFatorial(valor);
        }
        
        System.out.println("O somatório da fatorial dos 15 valores é: " + totalFatorial);
        
        scanner.close();
    }
    
  
    public static int calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fatorial = 1;
        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
