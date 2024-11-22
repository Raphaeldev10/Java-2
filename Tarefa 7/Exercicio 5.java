import java.util.Scanner;

public class VerificadorTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor do lado A:");
        float ladoA = scanner.nextfloat();
        
        System.out.println("Digite o valor do lado B:");
        float ladoB = scanner.nextfloat();
        
        System.out.println("Digite o valor do lado C:");
        float ladoC = scanner.nextfloat();
        
     
        if (verificarTriangulo(ladoA, ladoB, ladoC)) {
            System.out.println("Os valores formam um triângulo.");
        } else {
            System.out.println("Os valores NÃO formam um triângulo.");
        }
        
        scanner.close();
    }
    
    public static boolean verificarTriangulo(float a, float b, float c) {
    
        return (a < b + c) && (b < a + c) && (c < a + b);
    }
}
