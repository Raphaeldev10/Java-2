import java.util.Scanner;

public class QuadradoDiferenca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Digite o valor de A: ");
        int A = scanner.nextInt();
        
        System.out.println("Digite o valor de B: ");
        int B = scanner.nextInt();
        
       
        int diferenca = A - B;
        int quadradoDiferenca = diferenca * diferenca;
    
        System.out.println("O quadrado da diferença entre A e B é: " + quadradoDiferenca);
        
        scanner.close();
    }
}
