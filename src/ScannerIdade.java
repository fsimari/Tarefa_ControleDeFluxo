import java.util.Scanner;

public class ScannerIdade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite seu idade: ");
        int idade = s.nextInt();
        System.out.println("Voce tem " + idade + " anos");
    }
}
