package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {

	public static void main(String[] args) {

		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais","Espirito Santo", 
				"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");
		
		// Stream
		List<String> estadosEmMaiusculo = estados.stream()  // Criação da Stream
				.map(x -> x.toUpperCase())  // Operação Intermediaria focada no processamento
				.collect(Collectors.toList()); // Operação Terminal (Finalização)
		
		List<String> estadosUnicos = estados.stream()
				.distinct()
				.collect(Collectors.toList()); // Resultado dos Processamentos (Operação Terminal)
		
		long quantidadeDeEstados = estados.stream() 
				.count(); // Operação Terminal (finalização) o count ele conta os indices
				
		System.out.println("Estados em Maiúsculos: " + estadosEmMaiusculo);
		System.out.println("\nEstados Únicos: " + estadosUnicos);
		System.out.println("\nQuantidade de Estados " + quantidadeDeEstados);
		
		System.out.println("Coleção/Dados inicial: " + estados);
	}

}
