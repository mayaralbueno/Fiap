package Turma29;

import java.util.Scanner;

public class carrinho {
	
	Scanner sc = new Scanner(System.in);

	// L? os dois n?meros
	int numero1 = sc.nextInt();
	int numero2 = sc.nextInt();

	try {
	  // Realiza a divis?o
	  int divisao = numero1 / numero2;
	  // Exibe o resultado
	  System.out.println("O resultado ?: " + divisao);
	} catch (ArithmeticException e) {
	  System.err.println("Erro ao dividir!");
	}
	sc.close();
