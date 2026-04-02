import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aprovados = 0;
        int exame = 0;
        int reprovados = 0;
        float somaMedias = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Aluno atual: " + i);

            System.out.print("Digite a primeira nota do mesmo: ");
            float n1 = scanner.nextFloat();

            System.out.print("Digite a segunda nota do mesmo: ");
            float n2 = scanner.nextFloat();

            float media = (n1 + n2) / 2;
            somaMedias += media;

            System.out.println("Média: " + media);

            if (media <= 3) {
                System.out.println("Reprovado");
                reprovados++;
            } else if (media < 7) {
                System.out.println("Exame");
                exame++;
            } else {
                System.out.println("Aprovado");
                aprovados++;
            }
        }

        float mediaClasse = somaMedias / 6;

        System.out.println("Total de aprovados: " + aprovados);
        System.out.println("Total de exame: " + exame);
        System.out.println("Total de reprovados: " + reprovados);
        System.out.println("Média da classe: " + mediaClasse);

        scanner.close();
    }
}