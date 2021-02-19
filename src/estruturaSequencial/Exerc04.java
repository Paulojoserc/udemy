package estruturaSequencial;

import java.util.Scanner;

public class Exerc04 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int numFun, horaTra;
	
	double sal, valorHora ;
	
	System.out.println("Digite a Matricula");
	numFun = sc.nextInt();
	
	System.out.println("Digite a quantidade horas Trabalhadas");
	horaTra = sc.nextInt();
	
	System.out.println("Digite o valor da hora trabalhada");
	valorHora = sc.nextDouble();
	
	sal = horaTra * valorHora;
	
	System.out.printf("O funcionario da matricula %d tem o salario de: R$ %.2f %n",numFun, sal);
	
	
	sc.close();
}
}
