import java.util.Scanner;

public class DuracaoJogoXadrez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a hora de início do jogo (inteiro de 0 a 23): ");
        int horaInicio = scanner.nextInt();

        System.out.print("Digite a hora de fim do jogo (inteiro de 0 a 23): ");
        int horaFim = scanner.nextInt();


        scanner.close();

        int duracao;
        if (horaInicio <= horaFim) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = (24 - horaInicio) + horaFim;
        }

        System.out.println("A duração do jogo é de " + duracao + " horas.");
    }
}
