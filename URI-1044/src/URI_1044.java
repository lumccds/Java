import java.util.Scanner;

public class URI_1044 {
	
	public static void main(String args[]) {
		Scanner valores;
		valores = new Scanner(System.in);
			
		System.out.println("Forneça o valor de A: ");
		int A = valores.nextInt();
		System.out.println("Forneça o valor de B: ");
		int B = valores.nextInt();
		
		if (B % A == 0){
			System.out.printf("Sao Multiplos");
		}
		else {
			System.out.printf("Nao sao Multiplos");
		}
	
	valores.close();
	}
}