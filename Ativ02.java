// Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
import java.util.Scanner;

public class Ativ02 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    String nome, senha;

    System.out.println(" Digite o seu nome: " );
    nome = teclado.next();

    System.out.println(" Digite a sua senha: " );
    senha = teclado.next();
    
    if (nome == senha){
      System.out.println(" Nome e senha invalidos! Didite novamente ");
    }
    teclado.close();
  }

 
}