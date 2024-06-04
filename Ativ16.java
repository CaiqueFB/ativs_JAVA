// A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até que o valor seja maior que 500.

public class Ativ16 {
    public static void main(String[] args) {

        int primeiro = 1, segundo = 1;
        System.out.print(primeiro + " " + segundo + " ");

        while (true) {
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            if (proximo > 610) {
                break;
            }
            System.out.print(proximo + " ");

        }

    }

}
