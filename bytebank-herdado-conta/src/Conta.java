
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	public Conta (int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}	
	}

}
