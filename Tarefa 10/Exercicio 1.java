import java.util.Scanner;

public class DistributiveProperty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        int A = scanner.nextInt();
        System.out.println("Digite o valor de B: ");
        int B = scanner.nextInt();
        System.out.println("Digite o valor de C: ");
        int C = scanner.nextInt();
        System.out.println("Digite o valor de D: ");
        int D = scanner.nextInt();

        int resultadoAdicao, resultadoMultiplicacao;

     
        resultadoAdicao = A + B;
        resultadoMultiplicacao = A * B;
        System.out.println("A + B = " + resultadoAdicao);
        System.out.println("A * B = " + resultadoMultiplicacao);

        resultadoAdicao = A + C;
        resultadoMultiplicacao = A * C;
        System.out.println("A + C = " + resultadoAdicao);
        System.out.println("A * C = " + resultadoMultiplicacao);

        resultadoAdicao = A + D;
        resultadoMultiplicacao = A * D;
        System.out.println("A + D = " + resultadoAdicao);
        System.out.println("A * D = " + resultadoMultiplicacao);

       
        resultadoAdicao = B + C;
        resultadoMultiplicacao = B * C;
        System.out.println("B + C = " + resultadoAdicao);
        System.out.println("B * C = " + resultadoMultiplicacao);

        resultadoAdicao = B + D;
        resultadoMultiplicacao = B * D;
        System.out.println("B + D = " + resultadoAdicao);
        System.out.println("B * D = " + resultadoMultiplicacao);

   
        resultadoAdicao = C + D;
        resultadoMultiplicacao = C * D;
        System.out.println("C + D = " + resultadoAdicao);
        System.out.println("C * D = " + resultadoMultiplicacao);

        scanner.close();
    }
}
