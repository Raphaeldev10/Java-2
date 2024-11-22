import java.util.Scanner;

public class MaiorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();
        
        System.out.println("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();
        
        double maior = valor1;
        
        if (valor2 > maior) {
            maior = valor2;
        }
        
        if (valor3 > maior) {
            maior = valor3;
        }
        
        System.out.println("O maior valor é: " + maior);
        
        scanner.close();
    }
}
