import java.util.Scanner;

public class CalculadoraAreaResidencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double areaTotal = 0; 
        
        while (true) {
            System.out.println("Digite o nome do cômodo:");
            String nomeComodo = scanner.nextLine();
            
            System.out.println("Digite a largura do cômodo:");
            double largura = scanner.nextDouble();
            
            System.out.println("Digite o comprimento do cômodo:");
            double comprimento = scanner.nextDouble();
            
            double areaComodo = largura * comprimento; 
          
            areaTotal += areaComodo;
            
          
            System.out.println("A área do cômodo " + nomeComodo + " é: " + areaComodo + " metros quadrados");
            
         
            scanner.nextLine();
            
           
            System.out.println("Deseja adicionar outro cômodo? (SIM/NAO)");
            String continuar = scanner.nextLine();
            
       
            if (continuar.equalsIgnoreCase("NAO")) {
                break; 
            }
        }
        
       
        System.out.println("Área total da residência: " + areaTotal + " metros quadrados");
        
        scanner.close();
    }
}
