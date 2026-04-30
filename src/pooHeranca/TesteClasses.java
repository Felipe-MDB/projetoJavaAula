package pooHeranca;

public class TesteClasses {

	public static void main(String[] args) {

		Estudante e = new Estudante("Maria", 20, "maria@email.com", "2026A", "Computação");
		Instrutor i = new Instrutor("Carlos", 35, "carlos@email.com", "Java");

		System.out.println("====== Dados Estudante ======");
		System.out.println("Nome: " + e.getNome());
		System.out.println("Idade: " + e.getIdade());
		System.out.println("Email: " + e.getEmail());
		System.out.println("Matrícula: " + e.getMatricula());
		System.out.println("Curso: " + e.getCurso());

		System.out.println("\n====== Dados Instrutor ======");
		System.out.println("Nome: " + i.getNome());
		System.out.println("Idade: " + i.getIdade());
		System.out.println("Email: " + i.getEmail());
		System.out.println("Especialidade: " + i.getEspecialidade());
		
	}

}
