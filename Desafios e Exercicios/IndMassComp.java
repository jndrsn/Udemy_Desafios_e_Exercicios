package ExercicioFinal;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class IndMassComp {
	public static void main(String[] args) {
		
		
		String alt = JOptionPane.showInputDialog("Informe sua Altura").replace(",", ".");
		String pes = JOptionPane.showInputDialog("Informe seu Peso").replace(",", ".");
	
		double altura = Double.parseDouble(alt);
		double peso = Double.parseDouble(pes);
			
		double rv =  peso / Math.pow(altura, altura) ;
		
		DecimalFormat df = new DecimalFormat("#,##");
		String formatado = df.format(rv);
		double IMC = Double.parseDouble(formatado);
		
		String info = IMC > 30 ? "Voc� est� acima do peso, seu IMC � : " + IMC :
		              IMC < 30 && IMC > 20 ? "Voc� est� dentro do normal, seu IMC � :" + IMC :
		              IMC < 20 ? "Voc� est� em Subpeso Severo" + IMC : "N�o Definido!";
			       
		System.out.println(info);
		
	}
}
