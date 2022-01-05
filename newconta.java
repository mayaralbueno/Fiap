package Turma29;

public class newconta {


     private int numero;
     private double saldo;
     
     
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
