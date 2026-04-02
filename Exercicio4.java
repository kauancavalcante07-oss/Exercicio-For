import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pessoas = 10;
        float somaAltura = 0;
        int contagem = 0;

        for (int i = 1; i <= pessoas; i++) {
            System.out.println("Digite a idade da pessoa " + i);
            int idade = scanner.nextInt();

            System.out.println("Digite a altura da pessoa " + i);
            float altura = scanner.nextFloat();

            if (idade >= 50) {
                somaAltura += altura;
                contagem++;
            }
        }

        if (contagem > 0) {
            float media = somaAltura / contagem;
            System.out.println("Média das alturas (idade >= 50): " + media);
        } else {
            System.out.println("Nenhuma pessoa com 50 anos ou mais.");
        }
    }
}