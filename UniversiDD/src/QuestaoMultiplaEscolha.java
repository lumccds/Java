
public class QuestaoMultiplaEscolha extends QuestaoSimples{
	private String A;
	private String B;
	private String C;
	private String D;
	private String E;
	
	
	public QuestaoMultiplaEscolha(String enunciado, String resposta, String A, String B, String C, String D, String E) {
		super(enunciado, resposta);
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
		this.E = E;
	}
	
	
	public String getA() {
		return A;
	}
	public void setA(String a) {
		A = a;
	}
	public String getB() {
		return B;
	}
	public void setB(String b) {
		B = b;
	}
	public String getC() {
		return C;
	}
	public void setC(String c) {
		C = c;
	}
	public String getD() {
		return D;
	}
	public void setD(String d) {
		D = d;
	}
	public String getE() {
		return E;
	}
	public void setE(String e) {
		E = e;
	}	
	
	
}


