import java.util.Scanner;

public class CalculadoraIdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();
        System.out.print("Digite a idade em meses: ");
        int meses = scanner.nextInt();
        System.out.print("Digite a idade em dias: ");
        int dias = scanner.nextInt();

    
        scanner.close();

      
        int idadeEmDias = calcularIdadeEmDias(anos, meses, dias);

  
        System.out.println("A idade total em dias é: " + idadeEmDias);
    }


    public static int calcularIdadeEmDias(int anos, int meses, int dias) {
       
        return anos * 365 + meses * 30 + dias;
    }
}
