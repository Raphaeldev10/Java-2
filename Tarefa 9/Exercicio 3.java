public class Main {
    public static void main(String[] args) {
        int contador = 1; 
        
        System.out.println("Números divisíveis por 4 menores que 200:");
        
        while (contador < 200) { 
            if (contador % 4 == 0) { 
                System.out.println(contador); 
            }
            contador++; 
        }
    }
}
