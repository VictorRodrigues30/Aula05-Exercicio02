// Nome: Victor Guimarães Rodrigues
// RA: 1261946761

import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Lado A: ");
      int A = scanner.nextInt();
      System.out.print("Lado B: ");
      int B = scanner.nextInt();
      System.out.print("Lado C: ");
      Integer C = scanner.nextInt();
      if (A == B && B == C) {
        System.out.println("Triangulo Equilátero.");
    } else if (A == B || A == C || B == C) {
    System.out.println("Triangulo Isósceles.");
    } else {
        System.out.println("Triangulo Escaleno.");
    }
    scanner.close();
    }
}
