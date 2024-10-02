import java.util.Scanner;

public class TabuadaFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um numero para a tabuda: ");
        int num = s.nextInt();
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}

