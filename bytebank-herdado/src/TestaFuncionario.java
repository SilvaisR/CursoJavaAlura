
public class TestaFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Gerente(); 
		
		f1.setNome("Arthur");
		f1.setCpf("225.569.547-45");
		f1.setSalario(5000.00);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getBonificacao());
		

	}

}
