package matematica;

import java.util.Scanner;

/*
 * Neste exercicios eu aprendi mais sobre os operadores aritimetricos
 * são muito importante para fazer calculos simples e complexos.
 * 
 * */

public class Operadores_Aritimeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("COMEÇO DO PROGRAMA CALCULADORA");
		
		System.out.println("Digite dois numeros para as operações Aritimetricas: ");
		a = leitor.nextInt();
		b = leitor.nextInt();
		
		leitor.close();
		
		int soma = a + b;
		System.out.println("A soma dos valores eh: "+ soma);
		
		int sub = a - b;
		System.out.println("A subtração dos valores eh: "+ sub);

		int mult = a * b;
		System.out.println("A multiplicação dos valores eh: "+ mult);
		
		int div = a / b;
		System.out.println("A divisão dos valores eh: "+ div);
		
		int res = a % b;
		System.out.println("O resto da divisão dos valores eh: "+ res);
		
		System.out.println("FIM DO PROGRAMA!");



	}

}
