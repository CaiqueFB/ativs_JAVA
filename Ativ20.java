//Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o fatorial várias vezes e limitando o fatorial a números inteiros positivos e menores que 16.
import java.util.Scanner;

public class Ativ20 {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);

    System.out.println("Digite o número de termos da série de Fibonacci que deseja gerar:");
    int x = teclado.nextInt();
    if (x < 0 || x > 16 ) {
      System.out.println(" Digitou um número inválido, digite novamente: ");
      return;
    }
    gerarSerieFibonacci(x);
    teclado.close(); // Close the scanner here

  }

  public static void gerarSerieFibonacci(int x) {
    if (x <= 0) {
      System.out.println("Por favor, digite um número maior que 0.");
      return;
    }

    long[] fibonacci = new long[x];
    fibonacci[0] = 1;
    if (x > 1) {
      fibonacci[1] = 1;
    }

    for (int i = 2; i < x; i++) {
      fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
    }

    System.out.println("Série de Fibonacci até o " + x + "º termo:");
    for (int i = 0; i < x; i++) {
      System.out.print(fibonacci[i] + " ");
    }
    System.out.println();    
  }

}