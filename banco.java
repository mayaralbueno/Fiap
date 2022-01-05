package Turma29;

public class banco {

	
	
	int numero;
	
	int agencia;
	
	double saldo;
	
	public banco () {
		
		
	}
	public banco(int numero, int agencia, double saldo) {
		this.numero = numero;
		this.saldo= saldo;
		this.agencia = agencia;
		
		
	}
	public void depositar(double valor) {
		this. saldo += valor;
	}
	public void retirar(double valor) {
		this. saldo -= valor;
	}
	
}
