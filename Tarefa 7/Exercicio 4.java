import java.util.Scanner;

public class OrdenacaoCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
        System.out.println("Digite o primeiro valor:");
        double valor1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo valor:");
        double valor2 = scanner.nextDouble();
        
        System.out.println("Digite o terceiro valor:");
        double valor3 = scanner.nextDouble();
        
    
        ordenarEExibirEmOrdemCrescente(valor1, valor2, valor3);
        
        scanner.close();
    }
    
    public static void ordenarEExibirEmOrdemCrescente(double a, double b, double c) {
        double menor, meio, maior;
   
        if (a < b && a < c) {
            menor = a;
            if (b < c) {
                meio = b;
                maior = c;
            } else {
                meio = c;
                maior = b;
            }
        } else if (b < a && b < c) {
            menor = b;
            if (a < c) {
                meio = a;
                maior = c;
            } else {
                meio = c;
                maior = a;
            }
        } else {
            menor = c;
            if (a < b) {
                meio = a;
                maior = b;
            } else {
                meio = b;
                maior = a;
            }
        }
        
        System.out.println("Valores em ordem crescente: " + menor + ", " + meio + ", " + maior);
    }
}

    }
}
