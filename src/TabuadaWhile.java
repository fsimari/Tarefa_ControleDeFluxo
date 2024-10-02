import java.util.Scanner;

public class TabuadaWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Deseja iniciar a tabuada");
        String resposta = s.next();

        while(resposta.equalsIgnoreCase("sim")) {
            System.out.println("Digite um numero para gerar a tabuada: ");
            int num = s.nextInt();
            for (int i = 0; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }

            System.out.println("Digite um numero para gerar a tabuada: ");
            resposta = s.next();
        }
        System.out.println("Obrigado");
    }
}
