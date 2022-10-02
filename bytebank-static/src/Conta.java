
public class Conta {
	double saldo;
	int numero;
	int agencia;
	Cliente titular;
	public static int totalContas;
	
	public Conta(int numero, int agencia, Cliente titular) {
		totalContas++;
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = 0;
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if(numero > 0 && numero <= 99999) {
		this.numero = numero;
		} else {
			System.out.println("Processo negado.");
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia > 0 && agencia <= 999) {
		this.agencia = agencia;
		} else {
			System.out.println("O número é inválido para uma agencia.");
		}
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public static int getTotalContas() {
		return Conta.totalContas;
	}
	
	public void saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
		} else {
			System.out.println("Processo negado.");
		}
	}
	
	public void deposita(double valor) {
		if(valor > 0) {
			this.saldo += valor;
		} else {
			System.out.println("Valor inválido.");
		}
	}
	
	public void transfere(double valor, Conta destino) {
		if(valor > 0) {
			this.saldo -= valor;
			destino.deposita(valor);
		} else {
			System.out.println("Não foi possível concluir o processo.");
		}
	}
	
}
