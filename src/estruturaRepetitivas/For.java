package estruturaRepetitivas;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N,soma=0; ;
		
		System.out.println("Digite o n�meros de vez para N");
		N = sc.nextInt();
		
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma = soma+x;
		}
		
		System.out.println(soma);
		sc.close();
	}
}
