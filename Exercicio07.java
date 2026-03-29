// Nome: Victor Guimarães Rodrigues
// RA: 1261946761

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota (0 a 100): ");
        int nota = scanner.nextInt();

        // Validação da nota
        while (nota < 0 || nota > 100) {
            System.out.println("Nota inválida. Tente novamente.");
            System.out.print("Digite a nota (0 a 100): ");
            nota = scanner.nextInt();
        }

        // Classificação
        if (nota >= 90) {
            System.out.println("Conceito: A");
        } else if (nota >= 75) {
            System.out.println("Conceito: B");
        } else if (nota >= 60) {
            System.out.println("Conceito: C");
        } else {
            System.out.println("Conceito: D (Reprovado)");
        }

        scanner.close();
    }
}