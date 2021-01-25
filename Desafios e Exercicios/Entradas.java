package fundamentos;

import javax.swing.JOptionPane;

public class Entradas {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		String valor1 = JOptionPane.showInputDialog("Digite seu primeiro salario: ").replace(",",".");
		String valor2 = JOptionPane.showInputDialog("Digite seu segundo salario: ").replace(",",".");
		String valor3 = JOptionPane.showInputDialog("Digite seu terceio salario: ").replace(",",".");
		
		double sal1 = Double.parseDouble(valor1);
		double sal2 = Double.parseDouble(valor2);
		double sal3 = Double.parseDouble(valor3);
		
		double soma = sal1+sal2+sal3;
		double media = soma/3F;
		
		System.out.println(nome+ ", o total recebido é de R$ "+soma);
		System.out.println(nome+ ", a media salarial é de R$ "+media);
	}
}
