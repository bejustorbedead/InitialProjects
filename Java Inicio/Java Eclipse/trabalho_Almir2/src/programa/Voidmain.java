package programa;

import java.util.ArrayList;
import java.util.List;

import entidades.Entidades;

public class Voidmain {

	public static void main(String[] args) {
		List<Entidades> ingressos = new ArrayList<>();
			
			for (int i = 1; i <= 3; i ++) {
				int festaLote = 1;
				double valor = 20.00;
				ingressos.add(new Entidades(valor, festaLote));
			}
			
			for (int i = 1; i <= 2; i ++) {
				int festaLote = 2;
				double valor = 20.00;
				ingressos.add(new Entidades(valor, festaLote));
			}
			
			for (Entidades ent : ingressos) {
				System.out.println(ent);
			}
	}

}
