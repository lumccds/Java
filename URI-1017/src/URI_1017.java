import java.util.Scanner;

public class URI_1017 {
	
	public static void main(String args[]) {
		Scanner teclado;
		teclado = new Scanner(System.in);
	
	int t;
	int v;
	
	System.out.println("Forne�a o tempo gasto (em horas): ");
	t = teclado.nextInt();
	System.out.println("Forne�a a velocidade m�dia (em horas): ");
	v = teclado.nextInt();
	
	float s = t*v;
	
	System.out.printf("A quantidade de litros de combust�vel necess�ria �: %.3f\n",(s/12));
	
	teclado.close();
	
	}
}