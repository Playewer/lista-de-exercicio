public class ex5 {
    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
    public static void main(String[] args) {    
        for (int i = 2; i <= 123; i++) {
            if( ehPrimo(i) )
                System.out.println(i + " é primo.");
        }    
    }
    
}    