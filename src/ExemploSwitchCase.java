import java.util.Scanner;

public class ExemploSwitchCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 5");
        int num = s.nextInt();
        String numSt = getNum(num);
        System.out.println(numSt);
    }
    public static String getNum(int num) {
        String result;
        switch(num) {
            case 1:
            case 2:
                result = "A";
                break;
            case 3:
                result = "B";
                break;
            case 4:
                result = "C";
                break;
            case 5:
                result = "D";
                break;
            default:
                result = "Fora de 10";
        }
        return result;
    }
}
