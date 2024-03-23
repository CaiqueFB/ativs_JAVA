// Faça um programa que leia e valide as seguintes informações:
// Nome: maior que 3 caracteres
// Idade: entre 0 e 150
// Salário: maior que zero
// Sexo: 'f' ou 'm'
// Estado Civil: 's', 'c', 'v', 'd'

import java.util.Scanner;

public class Ativ03 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    String nome, sexo, estadocivil;
    int idade;
    Double salario;

    System.out.println("Digite o seu nome ");
    nome = teclado.next();
    do {
      if (nome.length() < 3)
        System.out.println( "Nome inválido, digite novamente" );
      nome = teclado.nextLine();
    }
    while (nome.length() < 3);

    System.out.println("Digite a sua idade ");
    idade = teclado.nextInt();
    do{
      if (idade < 0 || idade > 150)
        System.out.println (" Idade invalida, digite uma idade coerente ");
      idade = teclado.nextInt();  
    }
    while (idade < 0 || idade > 150);

    System.out.println("Digitr o seu salario");
    salario = teclado.nextDouble();
    do {
      if (salario <= 0)
        System.out.println("Salario invalido, digite novamente");
      salario = teclado.nextDouble();
    }
      while (salario <= 0);

    System.out.println ("Digite o seu sexo M/F");
    sexo = teclado.nextLine();
    do{
      if (sexo != "M" && sexo != "F")
        System.out.println("Sexo invalido, digite novamente");
      sexo = teclado.nextLine(); 
    }
      while (sexo != "M" && sexo != "F");

    System.out.println("Digite o seu estado civil");
    estadocivil = teclado.nextLine();
    do{
      if (estadocivil != "s" && estadocivil != "c" && estadocivil != "v" && estadocivil != "d")
        System.out.println("Estado civil invalido, digite novamente");
      estadocivil = teclado.nextLine();
    }
      while (estadocivil != "s" && estadocivil != "c" && estadocivil != "v" && estadocivil != "d");
     teclado.close();
  }
}