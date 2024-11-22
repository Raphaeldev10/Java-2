import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
       float valor1 = scanner.nextfloat();

        System.out.print("Digite o segundo valor: ");
       float valor2 = scanner.nextfloat();
    }
       
        scanner.close();

        double maiorValor;
        if (valor1 > valor2) {
            maiorValor = valor1;
        } else {
            maiorValor = valor2;

        System.out.println("O maior valor é: " + maiorValor);
    }
}
