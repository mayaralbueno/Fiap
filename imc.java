package Turma29;

import java.util.Scanner;

public class imc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	      
	    System.out.println("digite seu peso");
		double peso = sc.nextDouble();
		System.out.println("digite sua altura");
		double altura = sc.nextDouble();		
		double imc;
		
		imc = peso /(altura*altura);
		
	
		
       if(imc != 25) {
    	   System.out.println("Parabens seu imc est� ideal");
    	   
       }else {
    	   System.out.println("seu imc est� fora recomendado");
       }
		

	}

}
