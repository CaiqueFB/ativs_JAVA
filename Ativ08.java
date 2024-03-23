// Faça um programa que leia 5 números e informe a soma e a média dos números.

import java.util.Scanner;

public class Ativ08 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    
    int nu = 0, soma = 0, media = 0;
    
    System.out.println("Digite 5 números:");
      nu = teclado.nextInt();
    for (int i = 1; i < 5; i++ ) 
    nu = teclado.nextInt();
    
    soma = nu + nu + nu + nu + nu;
    media = soma / 5; 
        
      teclado.close();

      System.out.println("A soma dos numeros é: " + soma );
      System.out.println("A media dos numeros é: " + media );
  }

}