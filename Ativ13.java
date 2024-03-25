// Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número. Não utilize a função de potência da linguagem.

import java.util.Scanner;

public class Ativ13 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    int base, expo, result;
    
    System.out.println("Escreva o numero para base");
    base = teclado.nextInt();

    System.out.println("Escreva o numero para expoente");
    expo = teclado.nextInt();

    for(int i = 0; i < expo; i++){
      
    result = base*expo;
    }
    teclado.close();
    
    System.out.println("O resultado do numero " +base+ " elevado ao numero " +expo+ " é " + result);
  }

}