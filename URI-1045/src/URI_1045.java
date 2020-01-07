import java.util.Scanner;

public class URI_1045 {
	
	public static void main(String args[]) {
		Scanner valores;
		valores = new Scanner(System.in);
			
		double segura = 0.00;
		
		System.out.println("Forneça o valor de A: ");
		double A = valores.nextDouble();
		System.out.println("Forneça o valor de B: ");
		double B = valores.nextDouble();
		System.out.println("Forneça o valor de C: ");
		double C = valores.nextDouble();
		
		for (int cont = 0; cont <= 3; cont++) {
			if (A < B){
				segura = A;
				A = B;
				B = segura;
			}
			if (B < C){
				segura = B;
				B = C;
				C = segura;
			}
			if (A < C){
				segura = A;
				A = C;
				C = segura;
			}
		}
			
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		
		if (A >= B + C){
			System.out.println("NAO FORMA TRIANGULO");
		}
		if ((A*A) == (B*B + C*C)){
			System.out.println("TRIANGULO RETANGULO");
		}
		if ((A*A) > (B*B + C*C) && (A < B + C)){
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		if ((A*A) < (B*B + C*C)){
			System.out.println("TRIANGULO ACUTANGULO");
		}
		if (A == B && B == C && A == C){
			System.out.println("TRIANGULO EQUILATERO");
		}
		if (A == B && A != C || A == C && A != B){
			System.out.println("TRIANGULO ISOSCELES");
		}
	
	valores.close();
	}
}