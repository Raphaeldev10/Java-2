import java.util.Scanner;

public class ConversaoDolarReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Digite a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();
        
       
        System.out.println("Digite a quantidade de dólares disponível: ");
        double quantidadeDolares = scanner.nextDouble();
        
        
        double valorEmReais = cotacaoDolar * quantidadeDolares;
        
    
        System.out.println("O valor correspondente em reais é: R$" + valorEmReais);
        
        scanner.close();
    }
}
