package programa;

import estruturaDados.Vetor;

public class Aula2 {

	public static void main(String[] args) throws Exception {
		Vetor vetor = new Vetor(10);
		
		vetor.Adiciona("b");
		vetor.Adiciona("c");
		vetor.Adiciona("e");
		vetor.Adiciona("f");
		vetor.Adiciona("g");			
		System.out.println(vetor);
		
		vetor.adicionaQqrLugar(0, "a");
		System.out.println(vetor);

		vetor.adicionaQqrLugar(3, "d");
		System.out.println(vetor);
	}

}