package Turma29;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		conta cc  = new conta ();
		
		cc.saldo = 50.00;
		cc.agencia = 123;
		cc.numero= 321;
		
		cc.depositar(1000);
	    System.out.println(cc.verificarSaldo());	 
	    
	    
	    conta poupanca = new conta (111,222,1000);
	    
	    poupanca .retirar(50);   
	    
	    System.out.println(poupanca.verificarSaldo());
	}
	
	 
      
}
