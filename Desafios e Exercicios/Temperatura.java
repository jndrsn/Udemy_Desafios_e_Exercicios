package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		
		final int K1 = 32;
		final double FATOR = 5/9.0;
		
		double F=86;
		double C = FATOR * (F - K1);
		System.out.println("A temperatura de "+ F + "� F em �C � :" + C);
		
		F = 0;
		C = FATOR * (F - K1);		
		System.out.println("A temperatura de "+ F + "� F em �C � :" + C);
	}
}
