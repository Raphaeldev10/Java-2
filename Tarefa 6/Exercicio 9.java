import java.util.Scanner;

public class CalculadoraPrestacaoAtraso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da prestação: ");
        float valor = scanner.nextfloat();

        System.out.print("Digite a taxa de juros (em %): ");
        float taxa = scanner.nextfloat();

       
        System.out.print("Digite o tempo de atraso (em meses): ");
        float tempo = scanner.nextfloat();

        
        scanner.close();

       
       float prestacao = valor + (valor * taxa / 100 * tempo);

 
        System.out.println("O valor da prestação em atraso é: R$" + prestacao);
    }
}
