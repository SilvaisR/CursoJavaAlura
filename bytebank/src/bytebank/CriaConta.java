package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Novo saldo da primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		segundaConta.saldo = 50;
		
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo); 
		System.out.println("Saldo da primeira conta sem ter sido alterada: " + primeiraConta.saldo);
		
		Conta terceiraConta = new Conta();
		
		terceiraConta.saldo = 700;
		System.out.println("Saldo da terceira conta que não tem nada a ver com as outras:"
				+ " " + terceiraConta.saldo);
		
		terceiraConta.agencia = 004;
		System.out.println(terceiraConta.agencia);
		System.out.println(terceiraConta.conta);
	
	}
}
