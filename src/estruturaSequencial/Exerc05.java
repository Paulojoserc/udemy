package estruturaSequencial;

import java.util.Scanner;

public class Exerc05 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int cod1,cod2, peca1, peca2;
	double valUni1, valUni2, val1, val2, total;
	
	System.out.println("Digite o código da peça");
	cod1 = sc.nextInt();
	
	System.out.println("Digite o nímero de peças");
	peca1 = sc.nextInt();
	
	System.out.println("Digite o valor da peça");
	valUni1 = sc.nextDouble();
	
	
	System.out.println("Digite o código da peça");
	cod2 = sc.nextInt();
	
	System.out.println("Digite o nímero de peças");
	peca2 = sc.nextInt();
	
	System.out.println("Digite o valor da peça");
	valUni2 = sc.nextDouble();
	
	val1 = peca1 * valUni1;
	
	val2 = peca2 * valUni2;
	
	total = val1 + val2;
	
	System.out.printf("O valor total a ser pago é: R$ %.2f%n ",total);
	
	sc.close();
}
}
