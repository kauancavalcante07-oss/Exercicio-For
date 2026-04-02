import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int velhos = 0;
        int jovens = 0;
        float somaAlturas = 0;
        int leves = 0;

        for (int pessoa = 1; pessoa <= 10; pessoa++) {
            System.out.print("Idade: ");
            int idade = entrada.nextInt();

            System.out.print("Altura: ");
            float altura = entrada.nextFloat();

            System.out.print("Peso: ");
            float peso = entrada.nextFloat();

            if (idade > 50) {
                velhos++;
            }

            if (idade >= 10 && idade <= 20) {
                somaAlturas += altura;
                jovens++;
            }

            if (peso < 40) {
                leves++;
            }
        }

        float mediaAltura = (jovens > 0) ? somaAlturas / jovens : 0;
        float percLeves = (leves * 100.0f) / 10;

        System.out.println("Maiores de 50: " + velhos);
        System.out.println("Média das alturas de 10 a 20 anos: " + mediaAltura);
        System.out.println("Porcentagem menor que 40kg: " + percLeves + "%");

        entrada.close();
    }
}