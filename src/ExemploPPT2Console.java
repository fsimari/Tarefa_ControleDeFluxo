import java.util.Scanner;
    public class ExemploPPT2Console {
        public static void main(String[] args) {
            Scanner digite = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int result = digite.nextInt();

            if (result >= 1 && result <=5) {
                System.out.println("Resultado entre 1 e 5");
            }else if (result >=6 && result <=10) {
                System.out.println("Resultado entre 6 e 10");
            } else{
                System.out.println("Resultado diferente dos anteriores");
            }

        }
    }


