package pooPolimorfismo;

public class Pessoa {
	
		
		private String nome;
	    private int idade;
	    
		public Pessoa(String nome, int idade) {
			this.nome = nome;
			this.idade = idade;
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
		
		public void visualizar() {
			System.out.println("Dados da Pessoa Usuária:");
			System.out.println("****************************************************************");
			System.out.println("Nome: " + this.nome);
			System.out.println("Idade: " + this.idade);
		}
		
		// Método Abstrato
		// public abstract void escrever();
}
