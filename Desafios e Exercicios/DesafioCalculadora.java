package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor: ");
			
		String operador = JOptionPane.showInputDialog("Qual a operação que deseja ?");
		
		String valor2 = JOptionPane.showInputDialog("Digite o segundo valor: ");
		
			// necessário transformar o string em valor decimal
		
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		
		double resultado = " + ".trim().equals(operador.trim()) ? num1 + num2 : 
			               " * ".trim().equals(operador.trim()) ? num1 * num2 :
			               " - ".trim().equals(operador.trim()) ? num1 - num2 : 
			               " / ".trim().equals(operador.trim()) ? num1 / num2 :
			               " % ".trim().equals(operador.trim()) ? num1 % num2 : 0;		
		
		System.out.println("O resultado é : " + resultado);
		
		
		
	}
}
