import java.util.Scanner;

public class SomaDosDoisMaiores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        doublevalor1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo valor: ");
      double valor2 = scanner.nextDouble();
        
        System.out.println("Digite o terceiro valor: ");
       double  valor3 = scanner.nextDouble();
        
       double somaDosDoisMaiores = calcularSomaDosDoisMaiores(valor1, valor2, valor3);
        
        System.out.println("A soma dos dois maiores valores é: " + somaDosDoisMaiores);
        
        scanner.close();
    }
    
        public static double calcularSomaDosDoisMaiores(double a, double b, double c) {
        double maior, segundoMaior;
        
       
        if (a >= b && a >= c) {
            maior = a;
            segundoMaior = (b >= c) ? b : c;
        } else if (b >= a && b >= c) {
            maior = b;
            segundoMaior = (a >= c) ? a : c;
        } else {
            maior = c;
            segundoMaior = (a >= b) ? a : b;
        }
        
        return maior + segundoMaior;
    }
}
