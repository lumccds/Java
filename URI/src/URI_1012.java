import java.util.Scanner;

public class URI_1012 {
	
	public static void main(String args[]) {
		Scanner teclado;
		teclado = new Scanner(System.in);
	
	double a;
	double b;
	double c;
	
	//System.out.println("Digite o valor de A: ");
	a = teclado.nextFloat();
	//System.out.println("Digite o valor de B: ");
	b = teclado.nextFloat();
	//System.out.println("Digite o valor de C: ");
	c = teclado.nextFloat();
	
	System.out.printf("A �rea do tri�ngulo ret�ngulo b = A e h = C: %.3f\n",(a*c)/2 );
	System.out.printf("A �rea do c�rculo de r = C: %.3f\n",3.14159*(c*c));
	System.out.printf("A �rea do trap�zio que tem bases = A e B & h = C: %.3f\n",((a+b)*c)/2);
	System.out.printf("A �rea do quadrado que tem l = B: %.3f\n",b*b);
	System.out.printf("A �rea do ret�ngulo que tem lados A e B: %.3f\n",a*b);
	
	teclado.close();
	
	}
}

