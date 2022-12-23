package entidades;

public class Entidades {
	private double valor;
	private int festaLote;
	
	public Entidades() {
	}
	
	public Entidades(double valor, int festaLote) {
		this.valor = valor;
		this.festaLote = festaLote;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getFestaLote() {
		return festaLote;
	}

	public void setFestaLote(int festaLote) {
		this.festaLote = festaLote;
	}
	
	public String toString () {
		return "Evento: 1° festa, Lote: "+ festaLote
				+ "° Lote, Venda dia: 01/10/2022, Valor: " + valor;
	}

}
