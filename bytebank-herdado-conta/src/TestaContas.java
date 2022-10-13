
public class TestaContas {

	public static void main(String[] args) {
		
		
		ContaCorrente cc = new ContaCorrente(555, 5555);
		cc.deposita(100.0); 
		
		ContaPoupanca cp = new ContaPoupanca(777, 7777);
		cp.deposita(100.0); 
		
		cc.transfere(10.0, cp);
		
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());
		
		
	}
	
}
