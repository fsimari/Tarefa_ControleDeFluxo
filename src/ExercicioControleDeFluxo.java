import java.util.Scanner;

public class ExercicioControleDeFluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        float somaNotas = 0.0f;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota " + i + ": ");
            String notaStr = scanner.nextLine().replace(",", ".");  // Substitui vírgula por ponto
            double nota = Double.parseDouble(notaStr);  // Converte para double
            somaNotas += nota;
        }

        // Cálculo da média
        float media = somaNotas / 4;

        // Impressão do resultado
        System.out.println("Nome do aluno: " + nome);
        System.out.printf("Média: %.2f\n", media);

        // Verificação do status do aluno
        if (media > 7) {
            System.out.println("Situação: Aprovado");
        } else if (media >= 5 && media <= 6) {
            System.out.println("Situação: Recuperação");
        } else {
            System.out.println("Situação: Reprovado");
        }

        scanner.close();  // Fechar o scanner
    }
}
