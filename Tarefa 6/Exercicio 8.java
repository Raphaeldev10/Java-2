import java.util.Scanner;

public class CalculadoraCombustivelViagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o tempo gasto na viagem (em horas): ");
      float tempoGasto = scanner.nextfloat();

   
        System.out.print("Digite a velocidade média durante a viagem (em km/h): ");
        double velocidadeMedia = scanner.nextfloat();
       
        scanner.close();
       
        float distancia = velocidadeMedia * tempoGasto;
     
        double litrosUsados = distancia / 12; 

        System.out.println("Velocidade média: " + velocidadeMedia + " km/h");
        System.out.println("Tempo gasto na viagem: " + tempoGasto + " horas");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Quantidade de litros de combustível utilizada na viagem: " + litrosUsados + " litros");
    }
}
