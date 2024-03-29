//Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares.
 import java.util.Scanner;

public class Ativ14 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    int numero, par=0, impar=0;
    System.out.println("Digite dez números: ");
    
    for (int i = 0; i < 10; i++) {
      numero = teclado.nextInt();
      
      if (numero % 2 == 0) {
        par++;
      } 
      else {
        impar++;
      }
    }
      
    System.out.println("Números pares é: " + par);
    System.out.println("Números impares é: " + impar);
    teclado.close();
  }
}


  