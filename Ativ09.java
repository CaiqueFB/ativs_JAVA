// Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.

// import org.junit.jupiter.api.Test;

public class Ativ09 {
  public static void main(String[] args) {

    for (int num = 0; num <= 50; num++) {
    if(num % 2 == 1){
     System.out.println(num); 
    }
  }
  }
}