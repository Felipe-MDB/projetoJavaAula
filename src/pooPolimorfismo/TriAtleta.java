package pooPolimorfismo;

public class TriAtleta extends Pessoa implements ICiclista{ // implements adicionar a logica , implementar
		
		int competicoes;

		public TriAtleta(String nome, int idade, int competicoes) {
			super(nome, idade); // herança da classe Pessoa, voce invoca os atributos da classe mãe (nome, idade)
			this.competicoes = competicoes;
		}

		
		public int getCompeticoes() {
			return competicoes;
		}

		public void setCompeticoes(int competicoes) {
			this.competicoes = competicoes;
		}
	
		public void competicoesConcluidas() {
			System.out.println("Competições Concluidas: " + this.competicoes);
		}
		
		// polimorfismo de Sobrecarga (Sobrecarga Método)
		public void competicoesConcluidas(int numero) {
			System.out.println("Competições Concluidas: " + numero);
		}
		
		// Polimorfismo de Sobrescrita (Sobrescrita de Método)
		public void visualizar() {
			super.visualizar();
			System.out.println("Competições: " + this.competicoes);
		}
		
		// Métodos Implementares das Interfaces
		public void pedalar() {
			System.out.println("Estou Pedalando...");
		}


		@Override // Anotação - Etiqueta de Dados/Informação
		public String aquecer() {
			return "Estou me aquecendo...";
		}
}
