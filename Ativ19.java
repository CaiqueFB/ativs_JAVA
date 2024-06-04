// Altere o programa anterior para que ele aceite apenas números entre 0 e 1000.
import java.util.Scanner;

public class Ativ19 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int x, y, soma;
    System.out.println("Digite o primeiro número: ");
    x = teclado.nextInt();
    System.out.println("Digite o segundo número: ");
    y = teclado.nextInt();
    teclado.close();
    if (x < 0 || x > 1000 || y < 0 || y > 1000) {
      System.out.println(" Digitou um número inválido, digite novamente: ");
      return;
    }
    if (x < y) {
      System.out.println("O menor valor é: " + x);

    } else {
      System.out.println("O menor valor é: " + y);
    }
    soma = x + y;
    System.out.println("A soma dos valores é: " + soma);
  }

}