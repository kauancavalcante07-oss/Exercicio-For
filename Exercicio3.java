import java.util.Scanner;

public class Exercicio3{
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int num = scanner.nextInt();

        for(int i = 1; i <= num; i++)
            System.out.println("Numero digitado:  " + num + " Número atual: " + i);

    }
}