import java.util.Scanner;

public class CalculadoraPercentualVotos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();
        System.out.print("Digite o número de votos brancos: ");
        int votosBrancos = scanner.nextInt();
        System.out.print("Digite o número de votos nulos: ");
        int votosNulos = scanner.nextInt();
        System.out.print("Digite o número de votos válidos: ");
        int votosValidos = scanner.nextInt();

        scanner.close();

   
        double percentualBrancos = (double) votosBrancos / totalEleitores * 100;
        double percentualNulos = (double) votosNulos / totalEleitores * 100;
        double percentualValidos = (double) votosValidos / totalEleitores * 100;

     
        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");
    }
}
