import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o dividendo:");
        int dividendo = scanner.nextInt();
        
        System.out.println("Digite o divisor:");
        int divisor = scanner.nextInt();
        
        int quociente = 0;
    }
        
       
        while (dividendo >= divisor) {
            dividendo -= divisor;
            quociente++; 
        
        System.out.println("O resultado inteiro da divisão é: " + quociente);
        
        scanner.close();
    }
}
