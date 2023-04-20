/*Faça um programa que recebe os coeficientes
de uma equação do segundo grau e mostra as
suas raízes. O programa deve avisar caso não
tenha raízes reais.
 */

import java.util.Scanner;

public class RaizSegundoGrau {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite o coeficiente a: ");
		double a = input.nextDouble();

		System.out.print("Digite o coeficiente b: ");
		double b = input.nextDouble();

		System.out.print("Digite o coeficiente c: ");
		double c = input.nextDouble();

		System.out.printf("Soluções para a equação %.2fx² + %.2fx + %.2f = 0:%n", a, b, c);

		double delta = Math.pow(b, 2) - 4*a*c;

		if (delta > 0){
			double x1 = (-b + Math.sqrt(delta))/(2*a);
			double x2 = (-b - Math.sqrt(delta))/(2*a);

			System.out.printf("Como Δ > 0, temos duas soluções: %.2f, %.2f.", x1, x2);
		}
		else {

			if (delta == 0){
				double x = -b/(2*a);

				System.out.printf("Como Δ = 0, temos uma solução: %.2f.", x);
			}
			else {
				System.out.print("Como Δ < 0, não existe solução nos reais.");
			}
		}

	}
}