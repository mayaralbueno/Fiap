package Turma29;

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("digite sua idade");
		idade = sc.nextInt();



		if(idade >=18 && idade <70) {
			System.out.println("maior de idade");
		}else if(idade >=70){
			System.out.println("terceira idade");
		}if( idade >=100) {
			System.out.println("centenaria");
		}
	}

}
