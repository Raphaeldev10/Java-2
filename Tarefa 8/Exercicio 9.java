import java.util.Scanner;

public class SomatorioEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     
        double[] valores = new double[10];
        
    
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o valor " + (i + 1) + ":");
            valores[i] = scanner.nextDouble();
        }
        
    
        double somatorio = 0;
        for (double valor : valores) {
            somatorio += valor;
        }
        
  
        double media = somatorio / 10;
        
       
        System.out.println("Total do somatório: " + somatorio);
        System.out.println("Média aritmética: " + media);
        
        scanner.close();
    }
}
