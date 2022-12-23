package entidades;

public class Entidades {
	private int lote;
	private String data;
	private double valor;
	private int festa;
	
	public Entidades() {
	}

	public Entidades(int lote, String data, double valor, int festa) {
		this.lote = lote;
		this.data = data;
		this.valor = valor;
		this.festa = festa;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getFesta() {
		return festa;
	}

	public void setFesta(int festa) {
		this.festa = festa;
	}

	public String toString() {
		return "Evento: "+festa+"° festa -- Lote: "+lote+"° Lote -- Venda Dia: "+data+" Valor: "+valor;
	}
	
	
	
	
}
