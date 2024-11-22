import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o número de horas trabalhadas em um mês: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o salário por hora: ");
        float salarioPorHora = scanner.nextfloat();


        scanner.close();

      
        float salarioTotal;
        if (horasTrabalhadas <= 40) {
            salarioTotal = horasTrabalhadas * salarioPorHora;
        } else {
            int horasExtras = horasTrabalhadas - 40;
            double salarioHorasExtras = salarioPorHora * 1.5;
            salarioTotal = (40 * salarioPorHora) + (horasExtras * salarioHorasExtras);
        }

        salarioTotal *= 4;

        System.out.println("O salário total do funcionário é: R$" + salarioTotal);
    }
}
