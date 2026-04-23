package lacoRepeticao;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);
		 int numero1, numero2, resultado;
		 String continua = "";
		 
		 // o valor de continua e igual a N?
		 // Sim, é n
		 // ! true em false
		
		 while (!continua.equalsIgnoreCase("n"))  	// Uppercase = maiusculo LowerCase = minusculo
			 	 
		 System.out.println("Digite primeiro valor: ");
         numero1 = leia.nextInt();

         System.out.println("Digite segundo valor: ");
         numero2 = leia.nextInt();

         resultado = numero1 + numero2;

         System.out.println("O resultado da soma é: " + resultado);
         
         System.out.println("Deseja continuar? (s/n)");
         continua = leia.next();

		
	}

}
