package estruturaSequencial;

import java.util.Scanner;

public class Exerc05 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int cod1,cod2, peca1, peca2;
	double valUni1, valUni2, val1, val2, total;
	
	System.out.println("Digite o c�digo da pe�a");
	cod1 = sc.nextInt();
	
	System.out.println("Digite o n�mero de pe�as");
	peca1 = sc.nextInt();
	
	System.out.println("Digite o valor da pe�a");
	valUni1 = sc.nextDouble();
	
	
	System.out.println("Digite o c�digo da pe�a");
	cod2 = sc.nextInt();
	
	System.out.println("Digite o n�mero de pe�as");
	peca2 = sc.nextInt();
	
	System.out.println("Digite o valor da pe�a");
	valUni2 = sc.nextDouble();
	
	val1 = peca1 * valUni1;
	
	val2 = peca2 * valUni2;
	
	total = val1 + val2;
	
	System.out.printf("O valor total a ser pago �: R$ %.2f%n ",total);
	
	sc.close();
}
}
