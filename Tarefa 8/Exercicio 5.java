public class PotenciasDeTres {
    public static void main(String[] args) {
      
        long resultado = 1; 
        
        
        System.out.println("Potências de 3:");
        for (int expoente = 0; expoente <= 15; expoente++) {
            System.out.println("3^" + expoente + " = " + resultado);
            resultado *= 3; 
        }
    }
}
