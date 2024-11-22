import java.util.Scanner;

public class MaiorMenorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        
     
        while (true) {
            System.out.println("Digite um valor positivo (ou negativo para encerrar):");
            int valor = scanner.nextInt();
            
        
            if (valor < 0) {
                break;
            }
            
    
            if (valor > maior) {
                maior = valor;
            }
            
           
            if (valor < menor) {
                menor = valor;
            }
        }
        
     
        System.out.println("Maior valor informado: " + maior);
        System.out.println("Menor valor informado: " + menor);
        
        scanner.close();
    }
}
