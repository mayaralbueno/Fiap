package Turma29;

public class newconta {


	private int numero;
	private double saldo;
	

	public newconta () {

	}


	public newconta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
		
	}

	private double recuperarSaldo () {
		return saldo;
	}
	public void depositar(double valor) {
		saldo = saldo + valor;

	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getnumero () {

		return numero;
	}







}
