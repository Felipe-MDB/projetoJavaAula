package poo;

// A classe é o molde
public class Carro {
	
	// Atributos
	private String marca;
	private int rodas;
	private int portas;
	private String modelo_motor;
	
	// Método construtor
	public Carro(String marca, int rodas, int portas, String modelo_motor) {
		this.marca = marca; // This => Classe
		this.rodas = rodas; // Carro.rodas = Parametro rodas
		this.portas = portas; // 
		this.modelo_motor = modelo_motor;
	}
	
	// Métodos de Acesso/Especiais - (Get = Pega / Set = Coloca)
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca; // This é ESSA em inglês, no caso Essa classe
		// Carro.marca = parametro marca
		
	}
	
	public int getRodas() {
		return rodas;
	}

	public void setRodas(int rodas) {
		this.rodas = rodas;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public String getModelo_motor() {
		return modelo_motor;
	}

	public void setModelo_motor(String modelo_motor) {
		this.modelo_motor = modelo_motor;
	}

	// Métodos
	public void locomover() {
		System.out.println("Estou me locomovendo...");
		
	}
	
	public String parar() {
		return "Estou parando";
	}
	
}
