package listaEncadeada;

public class Celula {
	private String valor;
	private Celula proximo;
	
	public Celula(String valor) {
		this.valor = valor;
	}
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;;
	}
	public Celula getProximo() {
		return proximo;
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}

}
