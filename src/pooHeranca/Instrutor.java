package pooHeranca;

public class Instrutor {
	
	// Atributos
	private String nome;
	private int idade;
	private String email;
	private String especialidade;
	
	// Método construtor pega os atributos e constroi
	public Instrutor(String nome, int idade, String email, String especialidade) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.especialidade = especialidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}
