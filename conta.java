package Turma29;
/*
 * criamos a classe conta com os atributos agencia, numero e saldo com um cpnstrutor padrão e um construtor de classe.
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
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}




}
