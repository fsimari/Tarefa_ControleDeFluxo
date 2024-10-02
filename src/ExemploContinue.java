public class ExemploContinue {
    public static void main(String[] args) {
        for (int contador=1 ; contador<=100 ; contador++){
            if(contador%5!=0){   /// multiplos de 5
                continue;
            }
            System.out.println("Contador " + contador);
        }
    }

}