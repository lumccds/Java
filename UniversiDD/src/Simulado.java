import java.util.Scanner;

public class Simulado {
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int corretas = 0;
		
		QuestaoSimples simulado [] = new QuestaoSimples[5];
		simulado[0] = new QuestaoSimples("Quantas gerações de pokémon existem atualmente?", "Oito");
		simulado[1] = new QuestaoSimples("Qual o nome da fusão entre Pearl e Amethyst?", "Opal");		
		simulado[2] = new QuestaoMultiplaEscolha("Qual a digievolução correta da Tailmon de Kari", "Ophanimon", "MagnaDramon", "Lilithmon", "Ophanimon", "Rosemon", "Seraphimon");
		simulado[3] = new QuestaoMultiplaEscolha("Não tenho criatividade", "Não", "", "", "Não", "", "");
		simulado[4] = new QuestaoDica("Qual a campeã mais belíssima de League of Legends?", "Diana", "Aspecto de um astro");
		
	}
	

}
