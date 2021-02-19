package estruturaSequencial;

import java.util.Scanner;

public class Exec01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int val1, val2, soma;
		
		System.out.println("Digite o primeiro Valor");
		val1 = sc.nextInt();
		
		System.out.println("Digite o segundo Valor");
		val2 = sc.nextInt();
		
		soma = val1 + val2;
		
		System.out.println("O Valor da soma é: "+soma);
		
		sc.close();
	}
}
