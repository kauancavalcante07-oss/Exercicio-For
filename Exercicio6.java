import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lula = 0;
        int bolsonaro = 0;
        int dilma = 0;
        int temer = 0;
        int nulo = 0;
        int branco = 0;

        for (int eleitor = 1; eleitor <= 10; eleitor++) {
            System.out.print("Digite o voto do eleitor " + eleitor + ": ");
            int voto = scanner.nextInt();

            if (voto == 1) {
                lula++;
            } else if (voto == 2) {
                bolsonaro++;
            } else if (voto == 3) {
                dilma++;
            } else if (voto == 4) {
                temer++;
            } else if (voto == 5) {
                nulo++;
            } else if (voto == 6) {
                branco++;
            } else {
                System.out.println("Voto não computado");
            }
        }

        int totaldeVotos = 10;

        float quantosNulos = (nulo * 100.0f) / totaldeVotos;
        float quantosBrancos = (branco * 100.0f) / totaldeVotos;

        System.out.println("Resultado final:");
        System.out.println("Lula: " + lula);
        System.out.println("Bolsonaro: " + bolsonaro);
        System.out.println("Dilma: " + dilma);
        System.out.println("Temer: " + temer);
        System.out.println("Nulos: " + nulo);
        System.out.println("Brancos: " + branco);
        System.out.println("Percentual de nulos: " + quantosNulos + "%");
        System.out.println("Percentual de brancos: " + quantosBrancos + "%");

        scanner.close();
    }
}