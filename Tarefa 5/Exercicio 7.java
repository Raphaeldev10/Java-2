import java.util.Scanner;

public class ValoresEmOrdemCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Digite o primeiro valor: ");
      float valor1 = scanner.nextfloat();

        System.out.print("Digite o segundo valor: ");
       float valor2 = scanner.nextfloat();

   
        scanner.close();

       float menorValor, maiorValor;
        if (valor1 < valor2) {
            menorValor = valor1;
            maiorValor = valor2;
        } else {
            menorValor = valor2;
            maiorValor = valor1;
        }

        System.out.println("Valores em ordem crescente: " + menorValor + ", " + maiorValor);
    }
}
