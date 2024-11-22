import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite a temperatura em graus Celsius: ");
       float temperaturaCelsius = scanner.nextfloat();

       
        scanner.close();

      
        float temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;

       
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit + " °F");
    }
}
