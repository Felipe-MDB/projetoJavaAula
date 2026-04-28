package metodos;

import metodoExterno.ExemploMetodoExterno;

public class ExemploMetodos {

	public static void main(String[] args) {
		
		int resultado = somar(2,5); // resultado = 7
		
		System.out.println("O primeiro resultado: " + resultado);
		// System.out.println(" O primeiro resultado: " + somar(2,5))
		
		mensagem();	
		saudacao("Bom dia, turma");
		
		ExemploMetodoExterno.info();
	}

	public static int somar(int num1, int num2) {	// Assinatura do Método
		// Lógica do método
		return num1 + num2;	
	}
	
	public static void mensagem() {
		System.out.println("Esse método não tem retorno (void)");
	}
	
	public static void saudacao(String msg) {
		System.out.println(msg);
	}
}
