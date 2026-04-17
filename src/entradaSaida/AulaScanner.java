package entradaSaida;

import java.util.Scanner;	// Importando a classe Scanner para dentro do meu codigo

public class AulaScanner {

	public static void main(String[] args) {
		
		// Declarando as Variaveis
		Scanner leia = new Scanner(System.in);
		String nome;
		
		// Entrada de Dados
		System.out.println("Digite o seu nome: ");
		
		// Processamento
		nome = leia.nextLine();
		
		// Saída de Dados
		System.out.println("Bom dia, " + nome);	// ( + ) concatenar
	}

}
