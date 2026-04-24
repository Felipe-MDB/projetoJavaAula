package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploSet {

	public static void main(String[] args) {
		
		// Cria a Collection Set, do tipo String chamada setFrutas
				Set<String> setFrutas = new HashSet<String>();

				// Adiciona algumas frutas na Colection Set
				setFrutas.add("Abacate");
				setFrutas.add("Banana");
				setFrutas.add("Jaboticaba");
				setFrutas.add("Kiwi");
				setFrutas.add("Maçã");
				setFrutas.add("Morango");
				setFrutas.add("Pêra");
				setFrutas.add("Jaboticaba");
				setFrutas.add("Kiwi");
				
				/**
				 * Mostra os dados armazenados na Collection Set Observe que as frutas repetidas
				 * foram inseridos apenas uma vez
				 */
				System.out.println("\nDados da Collection: " + setFrutas);
				
				// Lista todos os elementos da Collection Set com a Classe Iterator (iterar == Percorrer)
				System.out.println("\n\nListar todos os Elementos com o Iterator");

				Iterator<String> isetFrutas = setFrutas.iterator();

				while (isetFrutas.hasNext()) { 	// Tem um proximo?
					System.out.println(isetFrutas.next());
				}

	}

}
