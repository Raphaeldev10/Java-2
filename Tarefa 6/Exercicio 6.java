import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        float temperaturaFahrenheit = scanner.nextfloat();

     
        scanner.close();

        float temperaturaCelsius = (temperaturaFahrenheit - 32) * (5.0 / 9.0);

       
        System.out.println("A temperatura em Celsius é: " + temperaturaCelsius + " °C");
    }
}
