import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        
        System.out.println("Digite valores inteiros positivos (digite um valor negativo para encerrar):");
        
        int valor = scanner.nextInt();
        
        while (valor >= 0) {
            if (valor > maior) {
                maior = valor;
            }
            
            if (valor < menor) {
                menor = valor; 
            }
            
            valor = scanner.nextInt(); 
        }
        
        if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
            System.out.println("Nenhum valor foi fornecido.");
        } else {
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        }
        
        scanner.close();
    }
}
