//Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
import java.util.Scanner;

public class Ativ17 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite um número que sera calculado o fatorial");
    int fatorial = teclado.nextInt();
    if (fatorial <= 0) {
      System.out.println("O fatorial não é definido para números negativos.");
    } else {
      long result = calcularFatorial(fatorial);
      System.out.println(fatorial + "! = " + result);
    }
    teclado.close();}

    public static long calcularFatorial(int n) {
    long fatorial = 1;
    for (int i = 1; i <= n; i++) {
        fatorial *= i;
    }
    return fatorial;
  }
  
}