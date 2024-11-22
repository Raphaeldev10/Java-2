import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int total = 0;
        int quantidadeValores = 0;
        
        System.out.println("Digite valores numéricos (digite um valor negativo para encerrar):");
        
        while (true) {
            System.out.print("Digite um valor: ");
            int valor = scanner.nextInt();
            
            if (valor < 0) {
                break; 
            }
            
            total += valor; 
            quantidadeValores++; 
        }
        
        if (quantidadeValores > 0) {
            double media = (double) total / quantidadeValores; 
            
            System.out.println("Total do somatório: " + total);
            System.out.println("Média aritmética: " + media);
            System.out.println("Total de valores lidos: " + quantidadeValores);
        } else {
            System.out.println("Nenhum valor foi fornecido.");
        }
        
        scanner.close();
    }
}
