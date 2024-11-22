import java.util.Scanner;

public class CustoCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

   
        scanner.close();

        double porcentagemDistribuidor = 0.28; // 28%
        double porcentagemImpostos = 0.45; // 45%

    
        double custoDistribuidor = custoFabrica * porcentagemDistribuidor;
        double custoImpostos = custoFabrica * porcentagemImpostos;
        double custoFinal = custoFabrica + custoDistribuidor + custoImpostos;

        System.out.println("O custo final ao consumidor é: R$" + custoFinal);
    }
}
