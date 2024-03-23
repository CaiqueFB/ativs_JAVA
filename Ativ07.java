// Faça um programa que leia 5 números e informe o maior número.

import java.util.Scanner;

public class Ativ07 {
  public static void main(String[] args) {
   
    Scanner teclado = new Scanner(System.in);
    
    int maior = 0;
    
    System.out.println("Digite 5 números:");
    maior = teclado.nextInt();
    
    for (int i = 1; i < 5; i++) {
      int num = teclado.nextInt();
      if (num > maior) {
        maior = num;
      }
    }
    
    System.out.println("O maior número é: " + maior);

    teclado.close();
    
  }
}