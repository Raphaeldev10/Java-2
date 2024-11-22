import java.util.Scanner;

public class ConversaoRealDolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Digite a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();
        
      
        System.out.println("Digite a quantidade de reais disponível: ");
        double quantidadeReais = scanner.nextDouble();
        
       
        double valorEmDolares = quantidadeReais / cotacaoDolar;
   
        System.out.println("O valor correspondente em dólares é: $" + valorEmDolares);
        
        scanner.close();
    }
}
