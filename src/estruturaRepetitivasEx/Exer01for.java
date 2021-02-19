package estruturaRepetitivasEx;

import java.util.Scanner;

public class Exer01for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, soma=0;
		
		System.out.println("Digite o valor de x");
		x = sc.nextInt();
		
		for (int i = 1; i <= x ; i++) {
			if ( i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
