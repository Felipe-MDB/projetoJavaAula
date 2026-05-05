package excecoes;

public class ExcecaoSimples extends Exception {

	// Atributo
	private static final long serialVersionUID = 1L; // 1.0d
	
	public ExcecaoSimples() {
		
	}
	
	public ExcecaoSimples(String mensagem) {
		super(mensagem);
	}
}
