package prova;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		//Chamar e importar o scanner, para que o numero seja digitado pelo cliente
		Scanner ler = new Scanner(System.in);
		
		//Declarar as Variáveis
		int numero1; 
		int numero2;
		int soma;
		
		//Dar valor ao primeiro numero
		System.out.println("Informe um numero");
		numero1 = ler.nextInt();
		
		//Dar valor ao segundo numero
		System.out.println("Informe outro numero");
		numero2 = ler.nextInt();
				
		//Realizar a SOMA dos numeros 
		soma = numero1 + numero2;
		
		//Mostrar o Resultado final da SOMA
		System.out.println("O resultado da operação é : " + soma);
		
		//Fechar o Scanner
		ler.close();

	}

}
