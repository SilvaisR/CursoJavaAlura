package bytebank;

public class TestaMetodos {
	public static void main(String[] args) {
		
		Conta contaDoJoao = new Conta();
		
		contaDoJoao.deposita(100);
		System.out.println(contaDoJoao.saldo);
		
		contaDoJoao.deposita(300);
		System.out.println(contaDoJoao.saldo);
		
		Conta contaDaMaria = new Conta();
		contaDaMaria.deposita(1000);
		System.out.println(contaDaMaria.saldo);
		
		contaDaMaria.saca(50);
		System.out.println(contaDaMaria.saldo);
		
		contaDaMaria.transfere(200, contaDoJoao);
		System.out.println("ContaDoJoao: " + contaDoJoao.saldo);
		System.out.println("ContaDaMaria: " + contaDaMaria.saldo);
		
	}
}
