package fundamentos;

public class DesafioAritimeticos {
	
	public static void main(String[] args) {
		
//		int a = 3 * 4 - 10;
//		int b = (int) Math.pow(a, 3);
//		double c = Math.pow(a, 3);
//		
//		
//		System.out.println(b);
//		System.out.println(c);
		
		
		
		int a = 6 * (3+2);
		int b = (int) Math.pow(a, 2);
		int c = 3*2;
		int d = (int) b/c;
		
		System.out.println(d);
		
		int e = ((1-5)*(2-7))/2;
		int f = (int) Math.pow(e, 2);
		
		System.out.println(f);
		
		int x = (int) Math.pow(d-f, 3);
		int y = (int) Math.pow(10, 3);
		
		int z = x/y;
		
		System.out.println(z);
		
		
		
	}
	
	
}
