package bytebank;

public class TestaClasses {
	
	public static void main(String[] args) {
		
		Conta contaDoJoao = new Conta();
		contaDoJoao.saldo = 500;
		contaDoJoao.agencia = 575;
		contaDoJoao.conta = 412131;

		contaDoJoao.titular = new Cliente();
		contaDoJoao.titular.nome = "Joao ferreira";
		contaDoJoao.titular.cpf = "222.222.222-22";
		contaDoJoao.titular.profissao = "Programador";
		
		System.out.println("Titular:  	" + contaDoJoao.titular.nome);
		System.out.println("CPF do titular: " + contaDoJoao.titular.cpf);
		System.out.println("profissão: 	" + contaDoJoao.titular.profissao);
		
		System.out.println("Saldo da conta:  R$" + contaDoJoao.saldo);
		contaDoJoao.deposita(1200);
		System.out.println("Saldo da conta:  R$" + contaDoJoao.saldo);
		contaDoJoao.saca(190);
		System.out.println("Saldo da conta:  R$" + contaDoJoao.saldo);
		System.out.println();
		
		
		
		Conta contaDaMaria = new Conta();
		contaDaMaria.titular = new Cliente();
		contaDaMaria.titular.nome = "Maria das Dores";
		contaDaMaria.titular.cpf = "333.333.333-33";
		contaDaMaria.titular.profissao = "Dá curso";
		System.out.println("Titular: " + contaDaMaria.titular.nome);
		System.out.println();
		
		contaDaMaria.deposita(100);
		System.out.println("Saldo Maria: " + contaDaMaria.saldo);
		System.out.println();
		
		contaDoJoao.transfere(350, contaDaMaria);
		System.out.println("Saldo Maria: " + contaDaMaria.saldo);
		System.out.println("Saldo Joao: " + contaDoJoao.saldo);
	}

}
