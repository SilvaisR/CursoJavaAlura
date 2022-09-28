
public class TestaEcapsulamento {

	public static void main(String[] args) {
		
		
		Conta contaDoPaulo = new Conta();
		
		contaDoPaulo.setTitular(new Cliente());

		contaDoPaulo.getTitular().setNome("Paulo Ricardo Santos");
		
		String nomePrimeiroCliente = contaDoPaulo.getTitular().getNome();
		System.out.println(nomePrimeiroCliente);
		
		
		contaDoPaulo.setAgencia(854);
		contaDoPaulo.setNumero(577589);
		contaDoPaulo.getTitular().setProfissao("Programador Java");
		contaDoPaulo.getTitular().setCpf("222.222.222-22");
		contaDoPaulo.deposita(3500.00);
		
		System.out.println("Saldo Paulo: " + contaDoPaulo.getSaldo());
		
		contaDoPaulo.saca(300.0);
		
		System.out.println("Saldo Paulo: " + contaDoPaulo.getSaldo());
		
		//################################################################
		
		Conta contaDaMaria = new Conta();
		contaDaMaria.setTitular(new Cliente());
		contaDaMaria.getTitular().setNome("Maria de Jesus");
		contaDaMaria.getTitular().setProfissao("Advogada");
		contaDaMaria.setAgencia(745);
		contaDaMaria.setNumero(896532);
		contaDaMaria.deposita(1200.0); 
		System.out.println();
		System.out.println("Saldo Maria: " + contaDaMaria.getSaldo());
		System.out.println();
		
		contaDoPaulo.transfere(150.5, contaDaMaria);
		
		System.out.println("Saldo Paulo: " + contaDoPaulo.getSaldo());
		System.out.println("Saldo Maria: " + contaDaMaria.getSaldo());
		
		
		

	}
	
}
