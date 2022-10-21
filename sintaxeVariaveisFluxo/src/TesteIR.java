
public class TesteIR {
	
	public static void main(String[] args) {
		
		double salario = 2000.0;
		double salarioComDesconto;
		
		if(salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("O IR é de 7,5%, será deduzido 142.");
			salarioComDesconto = salario - 142;
			System.out.println("Salario anterior: " + salario);
			System.out.println("Salario: atual:" + salarioComDesconto);
		}else if(salario > 2800.00 && salario < 3751.01) {
			System.out.println("O IR é de 15%, será deduzido 350.");
			salarioComDesconto = salario - 350;
			System.out.println("Salario anterior: " + salario);
			System.out.println("Salario: atual:" + salarioComDesconto);
		} else if(salario > 3751.00 && salario < 5664.01) {
			System.out.println("O IR é de 22,5%, será deduzido 636.");
			salarioComDesconto = salario - 636;
			System.out.println("Salario anterior: " + salario);
			System.out.println("Salario: atual:" + salarioComDesconto);
				}
			}
		}

