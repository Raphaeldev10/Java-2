import java.util.Scanner;

public class ApuracaoEleicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Digite a quantidade de votos válidos para o candidato A: ");
        int votosCandidatoA = scanner.nextInt();
        
        System.out.println("Digite a quantidade de votos válidos para o candidato B: ");
        int votosCandidatoB = scanner.nextInt();
        
        System.out.println("Digite a quantidade de votos válidos para o candidato C: ");
        int votosCandidatoC = scanner.nextInt();
        
 
        System.out.println("Digite a quantidade de votos nulos: ");
        int votosNulos = scanner.nextInt();
        
        System.out.println("Digite a quantidade de votos em branco: ");
        int votosEmBranco = scanner.nextInt();
        
      
        int totalEleitores = votosCandidatoA + votosCandidatoB + votosCandidatoC + votosNulos + votosEmBranco;
        
     
        double percentualVotosValidos = ((double) (votosCandidatoA + votosCandidatoB + votosCandidatoC) / totalEleitores) * 100;
        double percentualVotosCandidatoA = ((double) votosCandidatoA / totalEleitores) * 100;
        double percentualVotosCandidatoB = ((double) votosCandidatoB / totalEleitores) * 100;
        double percentualVotosCandidatoC = ((double) votosCandidatoC / totalEleitores) * 100;
        double percentualVotosNulos = ((double) votosNulos / totalEleitores) * 100;
        double percentualVotosEmBranco = ((double) votosEmBranco / totalEleitores) * 100;
        
    
        System.out.println("\nResultado da Eleição:");
        System.out.println("Total de eleitores: " + totalEleitores);
        System.out.println("Percentual de votos válidos: " + percentualVotosValidos + "%");
        System.out.println("Percentual de votos válidos do candidato A: " + percentualVotosCandidatoA + "%");
        System.out.println("Percentual de votos válidos do candidato B: " + percentualVotosCandidatoB + "%");
        System.out.println("Percentual de votos válidos do candidato C: " + percentualVotosCandidatoC + "%");
        System.out.println("Percentual de votos nulos: " + percentualVotosNulos + "%");
        System.out.println("Percentual de votos em branco: " + percentualVotosEmBranco + "%");
        
        scanner.close();
    }
}
