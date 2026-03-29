// Nome: Victor Guimarães Rodrigues
// RA: 1261946761

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int N = scanner.nextInt();

        int multiplicador = 1;

        while (multiplicador <= 10) {
            int resultado = N * multiplicador;
            System.out.println(N + " x " + multiplicador + " = " + resultado);
            multiplicador++;
        }

        scanner.close();
    }
}