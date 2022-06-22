public class ex4 {
    public static void main(String[] args) {
        long somaI = 0, mult = 1;
        
    for (int i = 1; i <= 30; i++){
            if (i % 2 == 1){
                somaI += i;
            }
            else {
                if (i>0)
                mult *= i;
            }
        }
    System.out.println("Resultado da soma é: " + somaI);
    System.out.println("Resultado da multiplicação é: " + mult);
    }
}    
