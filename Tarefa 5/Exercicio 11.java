import java.util.Scanner;

public class SaldoContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Digite o número da conta do cliente: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o saldo da conta: ");
        float saldo = scanner.nextfloat();

        System.out.print("Digite o débito: ");
        float debito = scanner.nextfloat();

        System.out.print("Digite o crédito: ");
        float credito = scanner.nextfloat();


        scanner.close();

       float saldoAtual = saldo - debito + credito;


        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }

        System.out.println("O saldo atual da conta é: R$" + saldoAtual);
    }
}
