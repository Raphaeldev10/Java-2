import java.util.Scanner;

public class CalculadoraAreaResidencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double areaTotal = 0;
        String resposta;
        
        do {
            System.out.println("Digite o nome do cômodo:");
            String nomeComodo = scanner.nextLine();
            
            System.out.println("Digite a largura do cômodo em metros:");
            double largura = scanner.nextDouble();
            
            System.out.println("Digite o comprimento do cômodo em metros:");
            double comprimento = scanner.nextDouble();
            
            double areaComodo = largura * comprimento;
            areaTotal += areaComodo;
            
            System.out.println("A área do cômodo '" + nomeComodo + "' é: " + areaComodo + " metros quadrados.");
            scanner.nextLine(); 
            
            System.out.println("Deseja calcular a área de outro cômodo? (SIM/NAO)");
            resposta = scanner.nextLine();
        } while (resposta.equalsIgnoreCase("SIM"));
        
        System.out.println("A área total da residência é: " + areaTotal + " metros quadrados.");
        
        scanner.close();
    }
}
