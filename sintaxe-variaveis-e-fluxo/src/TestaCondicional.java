
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 2;
		int quantidadePessoas = 0;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não tem 18 mas pode entrar, pois está acompanhado.");
			} else {
				System.out.println("infelizmente você não pode entrar.");
			}
		}
	}
}
