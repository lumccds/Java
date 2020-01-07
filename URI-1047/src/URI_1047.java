import java.util.Scanner;

public class URI_1047 {
	
	public static void main(String args[]) {
		Scanner valores;
		valores = new Scanner(System.in);
		
		System.out.print("O jogo começou que hora(s)? ");
		int hI = valores.nextInt();
		System.out.print("E que minuto(s)? ");
		int minI = valores.nextInt();
		System.out.print("O jogo terminou que hora(s)? ");
		int hF = valores.nextInt();
		System.out.print("E que minuto(s)? ");
		int minF = valores.nextInt();
		
		int minIT = (hI * 60) + minI;
		int minFT = (hF * 60) + minF;
		int dia = 24*60;
		int res = 0;
		

		if (minFT > minIT) {
		res = minFT - minIT;
		System.out.printf("O jogo durou %d hora(s) e %d minuto(s)\n", (res/60), (res%60));
		} else if (minIT > minFT) {
		res = (dia - minIT)+(minFT);
		System.out.printf("O jogo durou %d hora(s) e %d minuto(s)\n", (res/60), (res%60));
		} else if (minFT == minIT) {
		System.out.printf("O Jjogo durou %d hora(s) e %d minuto(s)\n", 24, 0);
		}
		
	valores.close();
	}
}