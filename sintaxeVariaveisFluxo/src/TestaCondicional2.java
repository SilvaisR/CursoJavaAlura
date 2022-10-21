
public class TestaCondicional2 {
	public static void main(String[] args) {
		
		int idade = 18;
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas >=2;
		
		if(idade >= 18 && acompanhado) {
			System.out.println("Seja muito bem vindo!");
		} else {
			System.out.println("Você não pode entrar!");
		}
		
	}

}
