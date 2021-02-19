package estruturaCondicional;

import java.util.Scanner;

public class Exerc03 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int A, B;
	
	System.out.println("Digite um número para A");
	A = sc.nextInt();
	
	System.out.println("Digite um número para B");
	B = sc.nextInt();
	
	
	if (A %B == 0 && B%A==0 ) {
		System.out.println("São multiplos");
	}else {
		System.out.println("Não são multiplos");
	}
	
	sc.close();
	
}
}
