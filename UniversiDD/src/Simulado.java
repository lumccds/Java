import java.util.Scanner;

public class Simulado {
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int corretas = 0;
		
		QuestaoSimples simulado [] = new QuestaoSimples[5];
		simulado[0] = new QuestaoSimples("Quantas gera��es de pok�mon existem atualmente?", "Oito");
		simulado[1] = new QuestaoSimples("Qual o nome da fus�o entre Pearl e Amethyst?", "Opal");		
		simulado[2] = new QuestaoMultiplaEscolha("Qual a digievolu��o correta da Tailmon de Kari", "Ophanimon", "MagnaDramon", "Lilithmon", "Ophanimon", "Rosemon", "Seraphimon");
		simulado[3] = new QuestaoMultiplaEscolha("N�o tenho criatividade", "N�o", "", "", "N�o", "", "");
		simulado[4] = new QuestaoDica("Qual a campe� mais bel�ssima de League of Legends?", "Diana", "Aspecto de um astro");
		
	}
	

}
