import java.util.Scanner;

public class ScannerNomeAltura {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = s.nextLine();
        System.out.println("Digite sua altura: ");
        double altura = s.nextDouble();
        System.out.println("Digite seu peso: ");
        double peso = s.nextDouble();
        System.out.println("Digite seu idade: ");
        int idade = s.nextInt();

        System.out.println(nome + " tem " + idade + " anos" + " com " + peso + " quilos" + " e "+ altura + " de altura") ;

    }
}
