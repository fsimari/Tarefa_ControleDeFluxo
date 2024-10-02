import java.util.Scanner;

public class IdadeMaioridade {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);

        System.out.print("Digite sua idade ");
        int idade = digite.nextInt();
        String idadeSt = getIdade (idade);
        System.out.println(idadeSt);
    }

    public static String getIdade(int idade){
        if (idade >= 1 && idade <18) {
            return "Voce é menor de idade";
        }else if (idade >18 && idade <=150) {
            return "Voce é maior de idade";
        } else{
            return "Voce nao existe";
        }
    }
}
