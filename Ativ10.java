//Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.

import java.util.Scanner;

public class Ativ10 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    int num1, num2, i;
    
    System.out.println("Digite o primeiro número: ");
    num1 = teclado.nextInt();
    System.out.println("Digite o segundo número: ");
    num2 = teclado.nextInt();

    i = num1 - num2;
    if (num1 < num2){
      i = num2 - num1;
    }
    System.out.println("Os números inteiros entre " + num1 + " e " + num2 + " são: " + i);
    teclado.close();
  }
}