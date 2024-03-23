//Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

 import java.util.Scanner;

public class Ativ01 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    
    int nota = 0;
    
    System.out.println("Escreva a sua nota ");
    nota = teclado.nextInt();
    
    if (nota > 10 || nota < 0 ){
      System.out.println(" Valor invalido, digite novamente " );
    }
    else{
    System.out.println (" Sua nota é valida " );
    }
    teclado.close();
  }
}