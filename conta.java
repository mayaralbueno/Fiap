package Turma29;
/*
 * criamos a classe conta com os atributos agencia, numero e saldo com um cpnstrutor padr�o e um construtor de classe.
 */

public class conta {

	int agencia;
	int numero;      
	double saldo;

	/*
	 * atributos da classe conta 
	 */

	public conta  () {

	}
	public conta (int agencia, int nuemro, double saldo) {

		this. agencia = agencia;
		this.numero = numero;      
		this.saldo = saldo;
		
		
	}
	 public void depositar (double valor) {
		 this.saldo += valor;
		  

			/*
			 * cria��o de metodos que v�o ser acessador pela classe teste
			 */

		 
	 }
	 public void retirar(double valor) {
		 this.saldo -= valor;
	 }
	 public double verificarSaldo() {
		 return this.saldo;
	 }



}
