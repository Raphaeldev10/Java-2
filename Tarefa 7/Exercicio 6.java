import java.util.Scanner;

public class VerificadorVencedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        System.out.println("Digite o nome do primeiro time:");
        String time1 = scanner.nextLine();
        System.out.println("Digite o número de gols marcados pelo " + time1 + ":");
        int golsTime1 = scanner.nextInt();
        
        System.out.println("Digite o nome do segundo time:");
        scanner.nextLine(); 
        String time2 = scanner.nextLine();
        System.out.println("Digite o número de gols marcados pelo " + time2 + ":");
        int golsTime2 = scanner.nextInt();
        
        
        if (golsTime1 > golsTime2) {
            System.out.println("O vencedor é o time " + time1);
        } else if (golsTime2 > golsTime1) {
            System.out.println("O vencedor é o time " + time2);
        } else {
            System.out.println("EMPATE");
        }
        
        scanner.close();
    }
}
