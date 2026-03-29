//Nome: Victor Guimarães Rodrigues
//RA: 1261946761

import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) throws Exception {
   Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
    Integer numero = scanner.nextInt();
    if (numero % 2 == 0) {
        System.out.print(numero + " é par."); }
        else {
            System.out.print(numero + " é impar.");
        
    }
    scanner.close();
    }
}
