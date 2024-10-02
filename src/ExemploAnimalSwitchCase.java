import java.util.Scanner;

public class ExemploAnimalSwitchCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome do animal: ");
        String texto = s.next();
        String animal = exampleOsSwitch(texto);
        System.out.println(animal);
    }

    public static String exampleOsSwitch(String texto) {
        String result;
        switch (texto) {
            case "dog":
            case "cat":
                result = "Animal domestico";
                break;
            case "tiger":
                result = "Animal Selvagem";
                break;
            default:
                result = "Animal nao encontrado";
                break;
        }
        return result;
    }
}
