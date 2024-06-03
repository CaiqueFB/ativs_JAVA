// A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série até o n−ésimo termo.
import java.util.Scanner;

public class Ativ15 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número de termos da série de Fibonacci que deseja gerar:");
        int x = teclado.nextInt();
        gerarSerieFibonacci(x);
        teclado.close();
    }
    public static void gerarSerieFibonacci(int x) {
        if (x <= 0) {
          System.out.println("Por favor, digite um número maior que 0.");
          return;}

        long[] fibonacci = new long[x];
        fibonacci[0] = 1;
        if (x > 1) {
        fibonacci[1] = 1;}

        for (int i = 2; i < x; i++) {
          fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];}

        System.out.println("Série de Fibonacci até o " + x + "º termo:");
        for (int i = 0; i < x; i++) {
          System.out.print(fibonacci[i] + " ");}
          System.out.println();
    
    }
}
