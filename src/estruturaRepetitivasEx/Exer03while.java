package estruturaRepetitivasEx;

import java.util.Scanner;

public class Exer03while {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int tipoCom, A=0, G=0, D=0;
	
	System.out.println("Digite o teipo de combustivel");
	tipoCom = sc.nextInt();
	
	while (tipoCom != 4) {
		if (tipoCom == 1) {
			A = A + 1;
		}
		else if (tipoCom == 2) {
			G = G + 1;
		}
		else if (tipoCom == 3) {
			D = D + 1;
		}
		
		tipoCom = sc.nextInt();
	}

	System.out.println("MUITO OBRIGADO");
	System.out.println("Alcool: " + A);
	System.out.println("Gasolina: " + G);
	System.out.println("Diesel: " + D);
	sc.close();
}
}
