package fundamentos;

import java.util.Scanner;


public class DesafioConversao {
	public static void main(String[] args) {
		
		float soma, media;
				
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salario do funcionario: ");
		String val1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o segundo salario do funcionario: ");
		String val2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o terceiro salario do funcionario: ");
		String val3 = entrada.nextLine().replace(",", ".");
		
		double sal1 = Double.parseDouble(val1);
		double sal2 = Double.parseDouble(val2);
		double sal3 = Double.parseDouble(val3);
		
		soma = (float) (sal1 + sal2 + sal3);
		media = soma/3;
		
		System.out.println("O valor total dos 3 meses é R$ " + soma);
		System.out.println("A média dos 2 meses é R$" + media);
		
		entrada.close();
		
	}
}
