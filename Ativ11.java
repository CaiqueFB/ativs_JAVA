// Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.
// Altere o programa anterior para mostrar no final a soma dos números.

import java.util.Scanner;

public class Ativ11 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num1, num2, i, soma;

    System.out.println("Digite o primeiro número: ");
    num1 = teclado.nextInt();
    System.out.println("Digite o segundo número: ");
    num2 = teclado.nextInt();

    i = num1 - num2;
    if (num1 < num2){
      i = num2 - num1;
    }
    soma = num1 + num2;
    
    System.out.println("Os números inteiros entre " + num1 + " e " + num2 + " são: " + i + " A soma entre os numeros é " + soma);
    teclado.close();
  }
}