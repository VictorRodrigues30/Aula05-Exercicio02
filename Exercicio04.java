// Nome: Victor Guimarães Rodrigues
// RA: 1261946761

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite N: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Valor inválido. N deve ser maior que zero.");
        } else {
            int contador = 1;

            while (contador <= N) {
                System.out.println(contador);
                contador++;
            }

            System.out.println("Contagem concluída.");
        }

        scanner.close();
    }
}