package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); //cria a lista
		
		list.add("Maria");	//adiciona na lista//	
		list.add("Bob");		
		list.add("Ana");		
		list.add("João");		
		list.add("Daniel");
		list.add(2, "Marco");
		
		System.out.println(list.size()); //mostra o tamanho da lista//
		
		list.remove(2);
		list.removeIf(x -> x.charAt(0) == 'M'); //remove tudo que começa com M//
		
		
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println(list.indexOf("Bob")); //mostra o endereço de tal elemento//
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //Só deixa quem começa com aquela letra no inicio//
				
	}

}
