// Nome: Victor Guimarães Rodrigues
// RA: 1261946761

import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Digite o primeiro número: ");
double num1 = scanner.nextDouble();
System.out.print("Digite o segundo número: ");
double num2 = scanner.nextDouble();
System.out.println("Operações: 1-Soma 2-Subtração 3-Multiplicação 4-Divisão");
System.out.print("Escolha: ");
int opcao = scanner.nextInt();
switch (opcao) {
    case 1: // Soma
System.out.println("Resultado: " + (num1 + num2));
break;

    case 2: // Subtração
System.out.println("Resultado: " + (num1 - num2));
break;

    case 3: // Multiplicação
System.out.println("Resultado: " + (num1 * num2));
break;

    case 4: // Divisão
if (num2 == 0) {
System.out.println("Erro: Divisão por zero não é permitida.");
} else {
System.out.println("Resultado: " + (num1 / num2));
}
break;

default:
System.out.println("Opção inválida.");
break;
}
scanner.close();
}
}
