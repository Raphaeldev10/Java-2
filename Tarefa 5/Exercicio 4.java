import java.util.Scanner;

public class VerificaAprovacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da 1ª avaliação: ");
        float nota1 = scanner.nextfloat();

        System.out.print("Digite a nota da 2ª avaliação: ");
        float nota2 = scanner.nextfloat();

        float media = (nota1 + nota2) / 2;

        String mensagem;
        if (media >= 6) {
            mensagem = "O aluno foi aprovado!";
        } else {
            mensagem = "O aluno foi reprovado.";
        }

        System.out.println("Média: " + media);
        System.out.println(mensagem);

        scanner.close();
    }
}
