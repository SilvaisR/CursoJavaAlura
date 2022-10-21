package br.com.alura.main;

public enum Prioridade {
	
	Min(1),Normal(5),Max(10);
	
	private int valor;
	
	private Prioridade(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}

}
