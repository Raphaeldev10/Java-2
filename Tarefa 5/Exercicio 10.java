import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário fixo do vendedor: ");
        float salarioFixo = scanner.nextfloat();

        System.out.print("Digite o valor das vendas efetuadas pelo vendedor: ");
       float valorVendas = scanner.nextfloat();


        scanner.close();

        float comissao;
        if (valorVendas <= 1500) {
            comissao = valorVendas * 0.03;
        } else {
            comissao = (1500 * 0.03) + ((valorVendas - 1500) * 0.05);
        }

        System.out.println("O salário total do vendedor é: R$" + salarioTotal);
    }
}
