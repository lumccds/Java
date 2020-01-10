
public class QuestaoSimples {
	protected String enunciado;
	protected String resposta;
	
	public QuestaoSimples (String enunciado, String resposta) {
		this.enunciado = enunciado;
		this.resposta = resposta;
	}
	
	
	public String getEnunciado() {
		return enunciado;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	public String getRespostas() {
		return resposta;
	}
	public void setRespostas(String resposta) {
		this.resposta = resposta;
	}
	
	
	void aplicarQuestao(){
		System.out.println("Questão: "+enunciado);
	}
	boolean corrigirQuestao(String respUser){
		return resposta.equals(respUser);
	}
}

