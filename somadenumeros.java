package Turma29;

import java.util.Scanner;

public class somadenumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner sc = new Scanner(System.in);
		
		
		System.out.println("digite o primeiro numero");
		int numero1 = sc.nextInt();
		System.out.println("digite o segundo numero");
		int numero2 = sc.nextInt();
		
		int soma = numero1 +numero2;
		System.out.println("a soma � "+ soma);
		
		
		int resto = soma % 2;
		if(resto == 0) {
			System.out.println("esse numero � par");
		}else {
			System.out.println("esse numero � impar.");
		}
	
	}

}
