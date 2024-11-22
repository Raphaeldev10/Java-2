import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite o salário mensal atual do funcionário: ");
        float salarioAtual = scanner.nextfloat();
        System.out.print("Digite o percentual de reajuste (em %): ");
        float percentualReajuste = scanner.nextfloat();

        scanner.close();


       float valorReajuste = salarioAtual * (percentualReajuste / 100);

   
       float novoSalario = salarioAtual + valorReajuste;

  
        System.out.println("O novo salário do funcionário é: R$" + novoSalario);
    }
}
