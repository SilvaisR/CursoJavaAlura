package bytebank;

public class Conta {
	
	double saldo;
	int agencia;
	int conta;
	Cliente titular;

	
	public void deposita(double valor) {
		saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Não deu não agora... :(");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}else {
			System.out.println("Não deu não agora... :'(");
			return false;
		}
		
	}
}
