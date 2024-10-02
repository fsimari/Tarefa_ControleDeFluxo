import java.util.Scanner;

public class ExemploAnimal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Solicita ao usuário que insira o nome de um animal
        System.out.println("Digite o nome de um animal (DOG, CAT, TIGER): ");
        String texto = s.next().toUpperCase(); // Converte o input para maiúsculas

        // Chama o metodo example0fIF e armazena o resultado
        String animal = exampleOfIF(texto);
        System.out.println(animal);

        // Fecha o Scanner para evitar vazamento de recursos
        s.close();
    }

    // Metodo que classifica o animal
    public static String exampleOfIF(String animal) {
        String result;

        // Verifica se o animal é domesticado ou selvagem
        if (animal.equals("DOG") || animal.equals("CAT")) {
            result = "domestic animal";
        } else if (animal.equals("TIGER")) {
            result = "wild animal";
        } else {
            result = "unknown animal";
        }

        // Retorna o resultado
        return result;
    }
}
