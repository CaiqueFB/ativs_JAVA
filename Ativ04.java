// Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento

public class Ativ04 {
  public static void main(String[] args) {
    
    int ano = 0;
    double pA = 80000, pB = 200000;
    double creA = 0.03, creB = 0.015;

    do{
      pA = pA + (pA * creA);
      pB = pB + (pB * creB);
      ano++;
    }
      while (pA <= pB);
    System.out.println("A população de A ultrapassa ou iguala a população de B em " + ano + " anos.");
 
  }

}