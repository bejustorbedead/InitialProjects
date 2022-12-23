package estruturaDados;

import java.util.Arrays;

public class Vetor {
	private String[] elementos;
	private Integer tamanho;
		
	public Vetor (int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
		
	/* public void Adiciona (String elemento) {
		for (int i = 0; i <= elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	} */
	
	public void Adiciona (String elemento) throws Exception {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("Vetor já cheio.");
		}
 
	}
	
	public boolean Adiciona2 (String elemento) {
		if (this.tamanho < this.elementos.length) {
			this.elementos[tamanho] = elemento;
			tamanho++;
			return true;
		} else {
			return false;
		}
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	public String toString () {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for (int i=0; i<this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if (this.tamanho>0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
	
	public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Invalida.");
		}
		return this.elementos[posicao];
	}
	
	public int buscaExiste(String elemento) {
		for (int i = 0; i<this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean adicionaQqrLugar(int posicao, String elemento) {
		
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Invalida.");
		}
		
		for (int i=this.tamanho; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return false;
	}
}
