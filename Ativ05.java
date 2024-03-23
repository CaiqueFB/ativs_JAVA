// Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento
// Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.

import java.util.Scanner;

public class Ativ05 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int ano = 0;
    double pA , pB;
    double creA , creB;

    System.out.println("Informe a população do país A: ");
    pA = teclado.nextDouble();
    System.out.println("Informe a população do país B: ");
    pB = teclado.nextDouble();

    System.out.println("Informe a taxa de atualização da população do país A: ");
    creA = teclado.nextDouble();
    System.out.println("Informe a taxa de atualização da população do país B: ");
    creB = teclado.nextDouble();

    teclado.close();

    do{
      pA = pA + (pA * creA);
      pB = pB + (pB * creB);
      ano++;
    }
    while (pA <= pB);
    System.out.println("A população de A ultrapassa ou iguala a população de B em " + ano + " anos.");
    
  }


}