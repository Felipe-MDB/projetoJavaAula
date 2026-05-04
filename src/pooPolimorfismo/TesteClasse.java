package pooPolimorfismo;

public class TesteClasse {

	public static void main(String[] args) {
		
		//	Pessoa p = new Pessoa("Maria", 18); // Classes Abstratas não podem ser instanciadas, no caso a palavra pessoa é vaga e generaliza muita coisa
		//	p.visualizar();
		
		TriAtleta t = new TriAtleta("Felipe", 34, 200);
		
		TriAtleta t2 = new TriAtleta("Maria", 30, 20);
		
	
		//	t2.competicoesConcluidas();
		//	t2.competicoesConcluidas(8);
		
		// t.setNome("Queren");
		// System.out.println(t.getNome());
	}

}
