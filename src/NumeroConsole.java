import java.util.Scanner;

public class NumeroConsole {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero: ");

        int result = s.nextInt();

        if (result == 1){
            System.out.println("Resultado é 1");
        } else if (result > 1){
            System.out.println("Resultado Maior que 1");
        } else{
            System.out.println("Resultado Menor que 1");
        }
    }
}
