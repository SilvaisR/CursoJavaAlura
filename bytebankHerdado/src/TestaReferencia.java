
public class TestaReferencia {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Antônio");
		g1.setSalario(5000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setNome("João");
		ev.setSalario(2500.0);
		
		Designer dn = new Designer();
		dn.setNome("Armando");
		dn.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		System.out.println(controle.getSoma());
		controle.registra(ev); 
		System.out.println(controle.getSoma());
		controle.registra(dn);
		System.out.println(controle.getSoma()); 
	}

}
