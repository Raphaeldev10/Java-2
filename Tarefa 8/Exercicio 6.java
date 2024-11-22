import java.util.Scanner;

public class CalculadoraPotencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Digite a base:");
        double base = scanner.nextDouble();
        
        System.out.println("Digite o expoente:");
        int expoente = scanner.nextInt();
  
        double resultado = calcularPotencia(base, expoente);
        

        System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);
        
        scanner.close();
    }
    
    public static double calcularPotencia(double base, int expoente) {
  
        double resultado = 1;
        
 
        if (expoente >= 0) {
    
            for (int i = 0; i < expoente; i++) {
                resultado *= base;
            }
        } else { 
            for (int i = 0; i > expoente; i--) {
                resultado /= base;
            }
        }
        
        return resultado;
    }
}
