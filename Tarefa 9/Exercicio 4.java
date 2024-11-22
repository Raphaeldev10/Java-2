public class Main {
    public static void main(String[] args) {
        double totalGraos = 0; 
        
        for (int i = 1; i <= 64; i++) { 
            double graosNesteQuadrado = Math.pow(2, i - 1); 
            totalGraos += graosNesteQuadrado;
        }
        
        System.out.println("O total de grãos de trigo em um tabuleiro de xadrez é: " + totalGraos);
    }
}
