package estruturaRepetitivas;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
		
		System.out.println("Digite o valor de x");
		x =sc.nextInt();
		
		int soma = 0;
		while(x != 0) {
			soma = soma+x;
			x= sc.nextInt();
		}
		
		System.out.println("O valor de soma é: "+soma);
		sc.close();
	}
}
