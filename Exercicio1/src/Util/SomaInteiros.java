package Util;

import java.util.Scanner;

class SomaInteiros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, soma;
		
		System.out.print("Digite um  numero inteiro: ");
		x = sc.nextInt();
		System.out.print("\nDigite outro  numero inteiro: ");
		y = sc.nextInt();
		
		soma = x+y;
		
		System.out.println("\nA soma dos dois numeros é: " + soma);
		
		sc.close();
	}
}
