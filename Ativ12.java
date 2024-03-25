// Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
//Tabuada de 5:
//5 X 1 = 5
//5 X 2 = 10
//...
//5 X 10 = 50

import java.util.Scanner;

public class Ativ12 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    int numero;

    System.out.println("Escreva um numero para gerar a tabuada");
    numero = teclado.nextInt();

    for (int i =  0; i <= 10; i++){
      System.out.println(numero + " X " +i+ " = " + numero * i); 
    }
    teclado.close();
  }

}