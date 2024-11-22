import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        System.out.println("Digite o valor do salário mensal: ");
        double salarioMensal = scanner.nextDouble();
        
        System.out.println("Digite o percentual de reajuste (%): ");
        double percentualReajuste = scanner.nextDouble();
        
 
        double valorReajuste = salarioMensal * (percentualReajuste / 100);
        
    
        double novoSalario = salarioMensal + valorReajuste;

        System.out.println("O novo salário é: " + novoSalario);
        
        scanner.close();
    }
}
