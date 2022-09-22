package bytebank;

public class Conta {
	double saldo = 0;
	int agencia = 575;
	int conta = 341;
	String titular;
	
	
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
