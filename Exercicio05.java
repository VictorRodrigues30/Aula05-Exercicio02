// Nome: Victor Guimarães Rodrigues
// RA: 1261946761

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = -1; // valor inicial diferente de 0
        int soma = 0;

        while (numero != 0) {
            System.out.print("Digite um número (0 para encerrar): ");
            numero = scanner.nextInt();

            soma += numero;
        }

        System.out.println("Soma total: " + soma);

        scanner.close();
    }
}