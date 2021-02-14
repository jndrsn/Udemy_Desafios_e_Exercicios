package ExercicioFinal;

import java.util.Scanner;

public class Temperaturas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println(   "Escolha uma das Opções: "     );
		System.out.println("--------------------------------");
		System.out.println(" 1 - De Celsius para Farenhaith ");
		System.out.println(" 2 - De Farenhaith para Celsius" );
		System.out.println("--------------------------------");
		
		String x = entrada.next();
		
		System.out.println("Digite a temperatura que deseja converter :");
		double y = Double.parseDouble(entrada.next());
		
		System.out.println(y);
		
		double conv = "1".trim().equals(x) ? ((y*9/5)+32) : "2".trim().equals(x) ? ((y-32)*5/9) : 0;
		
		System.out.println("A temperatura convertida é : " + conv);
	}
	
}
