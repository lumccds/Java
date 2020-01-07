import java.util.Scanner;

public class URI_1017 {
	
	public static void main(String args[]) {
		Scanner teclado;
		teclado = new Scanner(System.in);
	
	int t;
	int v;
	
	System.out.println("Forneça o tempo gasto (em horas): ");
	t = teclado.nextInt();
	System.out.println("Forneça a velocidade média (em horas): ");
	v = teclado.nextInt();
	
	float s = t*v;
	
	System.out.printf("A quantidade de litros de combustível necessária é: %.3f\n",(s/12));
	
	teclado.close();
	
	}
}