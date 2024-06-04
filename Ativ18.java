// Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a soma dos valores.

import java.util.Scanner;

public class Ativ18 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int x, y, soma;
    System.out.println("Digite o primeiro número: ");
    x = teclado.nextInt();
    System.out.println("Digite o segundo número: ");
    y = teclado.nextInt();
    teclado.close();

    if (x < y){
      System.out.println("O menor valor é: " + x);
      
    }else {
      System.out.println("O menor valor é: " + y);
    }
    soma = x + y;
    System.out.println("A soma dos valores é: " + soma);
  
  
  }
  
}