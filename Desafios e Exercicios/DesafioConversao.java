package fundamentos;

import java.util.Scanner;


public class DesafioConversao {
	public static void main(String[] args) {
		
		float soma, media;
				
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salario do funcionario: ");
		String x = entrada.nextLine();
		String val1 = x.replace(",", ".");
		
		System.out.println("Digite o segundo salario do funcionario: ");
		String y = entrada.nextLine();
		String val2 = y.replace(",", ".");
		
		System.out.println("Digite o terceiro salario do funcionario: ");
		String z = entrada.nextLine();
		String val3 = z.replace(",",".");
		
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
