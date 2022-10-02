
public class TestaConstrutor {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(775589, 341, new Cliente("João Paulo", "222.222.222-22"));
		
		
		
		System.out.println("Agencia: " + conta.getAgencia());
		System.out.println("N°conta: " + conta.getNumero());
		System.out.println("Saldo: " + conta.getSaldo());
		
		Conta conta2 = new Conta(778483, 878, new Cliente("Pedro almeida", "333.333.333-33"));
		Conta conta3 = new Conta(758454, 759, new Cliente("Roger Sena", "444.444.444-44"));
		
		System.out.println("Total de contas criadas: " + Conta.getTotalContas());
		
		
		conta.deposita(700);
		System.out.println("Conta1: $" + conta.getSaldo());
		System.out.println();
		
		conta.transfere(250, conta2);
		System.out.println("conta1: $" + conta.getSaldo());
		System.out.println("conta2: $" + conta2.getSaldo());
		
	}
	
}
