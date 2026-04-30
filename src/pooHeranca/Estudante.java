package pooHeranca;

public class Estudante extends Pessoa{	// Classe Filha ou Classe Derivada de Pessoa
	
	// Atributos
	
    private String matricula;
    private String curso;
    
    // Método construtor pega os atributos e constroi
	public Estudante(String nome, int idade, String email, String matricula, String curso) {
		super(nome, idade, email);	// super = Classe Mãe / Método Construtor da Classe Mãe
		// invocando Pessoa (nome, idade, email)
		
		this.matricula = matricula;
		this.curso = curso;
	}
	// Métodos de Acesso (GET - pega ou ler / SET define ou altera
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
}
