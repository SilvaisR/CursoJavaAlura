
public class Gerente extends Funcionario implements autenticavel{
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public double getBonificacao() {
		return super.getSalario() + 1000.0;
	}
	
	
}


