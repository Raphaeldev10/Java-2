import java.util.Scanner;

public class VerificaVotacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();


        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

    
        scanner.close();

        int idade = anoAtual - anoNascimento;

     
        if (idade >= 16) {
            System.out.println("Você pode votar este ano!");
        } else {
            System.out.println("Você não pode votar este ano.");
        }
    }
}
