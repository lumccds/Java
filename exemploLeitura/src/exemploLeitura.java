import java.util.Scanner;

public class exemploLeitura {
	
	public static void main(String args[]) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int a;
		float b;
		String texto;
		
		
		System.out.println("Digite um nome: ");
		texto = teclado.nextLine();
		System.out.println("Digite um valor inteiro: ");
		a = teclado.nextInt();
		System.out.print("Digite um valor real: ");
		b = teclado.nextFloat();
		
		System.out.println("O texto que você digitou foi: ");
		System.out.println(texto);
		System.out.println("Os valores digitados foram: "+a+" e "+b);
		
		teclado.close();
	}

}
