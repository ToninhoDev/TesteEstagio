package main;

import java.util.Scanner;

public class fibnaci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite Um Numero: ");
		
		System.out.println(fibonacci(sc.nextInt()));
		

	}
	
	public static String fibonacci(int num) {
		
		int num1 = 0;
		int num2 = 1;
		String mem1 = "Pertence a Sequencia de fibonacci" ;
		String mem2 = "Não pertence a sequencia";
		
		while(num1 <= num) {
			if(num1 == num) {
				return mem1;
			}
			int result = num1 + num2;
			num1 = num2;
			num2 = result;
		}
		
		
		
		return mem2;
	}
}
