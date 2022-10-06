
public class TestaGerente {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Armando Pinto"); 
		g1.setCpf("899.654.325-66");
		g1.setSalario(6000.00); 
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(22522);
		
		boolean result = g1.autentica(22522);
		System.out.println(result);
		
		System.out.println();
		System.out.println(g1.getBonificacao());
	}

}
