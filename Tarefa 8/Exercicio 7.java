public class Fibonacci {
    public static void main(String[] args) {
        int termo1 = 1;
        int termo2 = 1;
        int proximoTermo;
        
        System.out.println("Os primeiros 15 termos da série de Fibonacci são:");
        System.out.print(termo1 + " " + termo2 + " "); 
       
        for (int i = 3; i <= 15; i++) {
            proximoTermo = termo1 + termo2;
            System.out.print(proximoTermo + " ");
           
            termo1 = termo2;
            termo2 = proximoTermo;
        }
    }
}
