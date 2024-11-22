public class SomaEMediaPares {
    public static void main(String[] args) {
        int soma = 0;
        int quantidadePares = 0;
        
   
        for (int i = 50; i <= 70; i++) {
          
            if (i % 2 == 0) {
                soma += i; 
                quantidadePares++; 
        }
        
      
        double media = (double) soma / quantidadePares;
        }
        
    
        System.out.println("Soma dos valores pares: " + soma);
        System.out.println("Média aritmética dos valores pares: " + media);
    }
}
