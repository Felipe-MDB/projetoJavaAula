package excecoes;

public class Exemplo3 {

	public static void main(String[] args) throws ExcecaoSimples{
		
		String nomes[] = { "João", "Maria", "Pedro", "Manuela" };

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(nomes[i]);
			}
			
			throw new ExcecaoSimples("Exceção Simples!");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("\nExceção: " + e);
			System.out.println("\nPosição Inválida");
		}catch (ExcecaoSimples e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Teste");
		
		

	}


	

}
