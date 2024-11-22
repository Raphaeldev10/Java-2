public class ConversorCelsiusFahrenheit {
    public static void main(String[] args) {
       
        for (int celsius = 10; celsius <= 100; celsius += 10) {
          
            double fahrenheit = (9 * celsius + 160) / 5.0;
            
            
            System.out.println(celsius + "°C = " + fahrenheit + "°F");
        }
    }
}
