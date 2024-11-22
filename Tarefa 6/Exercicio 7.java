import java.util.Scanner;

public class VolumeLataDeOleo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        System.out.print("Digite o raio da lata de óleo (em centímetros): ");
        float raio = scanner.nextfloat();

    
        System.out.print("Digite a altura da lata de óleo (em centímetros): ");
       float altura = scanner.nextfloat();

        scanner.close();

        float volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.println("O volume da lata de óleo é: " + volume + " centímetros cúbicos");
    }
}
