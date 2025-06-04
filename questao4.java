package prova;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		
	//DECLARAR O SCANNER
	Scanner ler = new Scanner(System.in);
	
	//DECLARAR A VARIAVEL SOMA
	int soma = 0;
	
	//USAMOS O FOR PARA QUE, ENQUANTO O NUMERO FOR MENOR OU IGUAL A 10, A VARIAVEL I CONTINUE SENDO SOMADA
	for (int i = 1; i <= 10; i++) {
		
		//PEDIMOS PARA QUE O USUARIO DIGITE O VALOR DOS NUMEROS, CONFORME PEDIDO
		System.out.println("Digite o " + i + "º numero: ");
		int numero = ler.nextInt();
		
		//A VARIAVEL SOMA IRA ADICIONAR CADA NUMERO DIGITADO E AO FINAL, MOSTRAR O RESULTADO
		soma += numero;
		
		//MOSTRAR A SOMA DOS 10 NUMEROS AO USUARIO
		System.out.println("A soma dos 10 numeros é: " + soma);
		
	}

	//FECHAR O SCANNER
	ler.close();
	}

}
