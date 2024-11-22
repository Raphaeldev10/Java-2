public class Main {
    public static void main(String[] args) {
        int inicio = 1;
        int fim = 10;
        
        System.out.println("Fatoriais de números ímpares de " + inicio + " a " + fim + ":");
        
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 != 0) { 
                long fatorial = calcularFatorial(i);
                System.out.println("Fatorial de " + i + ": " + fatorial);
            }
        }
    }
    
    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long fatorial = 1;
        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
