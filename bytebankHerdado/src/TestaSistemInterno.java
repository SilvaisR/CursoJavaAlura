
public class TestaSistemInterno {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setSenha(2222); 
		
		Administrador ad = new Administrador();
		ad.setSenha(2222);
		
		Cliente cl = new Cliente();
		cl.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.Autentica(g); 
		si.Autentica(ad); 
		si.Autentica(cl); 

		
	}
	
}
