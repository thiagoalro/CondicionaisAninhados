/*
Faça um programa que recebe três valores e
verifica e mostra se eles podem ou não formar
um triângulo. Se for possível formar um
triângulo, verificar e mostrar também se o
triângulo formado é equilátero, isósceles ou
escaleno.
*/


import java.util.Scanner;

public class Triangulos {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o tamanho do primeiro lado: ");
		double lado1 = input.nextDouble();
		System.out.print("Digite o tamanho do segundo lado: ");
		double lado2 = input.nextDouble();
		System.out.print("Digite o tamanho do terceiro lado: ");
		double lado3 = input.nextDouble();

		if ( (lado1 < lado2 + lado3) && (lado2 < lado3 + lado1) && (lado3 < lado1 + lado2) ){
			System.out.print("Os tamnhos digitados para os lados formam um triângulo!\n");

			if (lado1 == lado2 && lado2 == lado3){
				System.out.print("O triângulo é EQUILÁTERO!");
			}
			else {
				if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
					System.out.print("O triângulo é ISÓSCELES!");
				}
				else {
					System.out.print("O triângulo é ESCALENO!");
				}

			}
		}
		else {
			System.out.print("Os tamanhos digitados para os lados NÃO formam um triângulo!");
		}

	}
}
