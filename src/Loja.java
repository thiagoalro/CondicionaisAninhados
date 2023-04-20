/*Faça um programa que calcula o que deve ser
pago por um produto, considerando o preço
original e a forma de pagamento:
Código      Pagamento
1           Dinheiro: 10% de desconto
2           1x no cartão: 5% de desconto
3           2x no cartão: preço original
4           3x no cartão: juros de 5% do original
*/

import java.util.Scanner;

public class Loja {

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Digite o preço de prateleira do produto: ");
		double preco = input.nextDouble();

		System.out.print(
				"1 - Dinheiro: 10% de desconto\n" +
				"2 - 1x no cartão: 5% de desconto\n" +
				"3 - 2x no cartão: preço original\n" +
				"4 - 3x no cartão: juros de 5% do original\n");

		System.out.print("Digite a opção de pagamento: ");
		int opcao = input.nextInt();

		double desconto, precoFinal;

		switch(opcao){
			case 1:
				desconto = preco*0.1;
				precoFinal = preco - desconto;
				System.out.printf("Preço com 10%% de desconto: %.2f", precoFinal);
				break;
			case 2:
				System.out.printf("Preço com 5%% de desconto: %.2f", preco - preco*0.05);
				break;
			case 3:
				System.out.printf("Preço sem desconto: %.2f", preco);
				break;
			case 4:
				System.out.printf("Preço com juros de 5%%: %.2f", preco + preco*0.05);
				break;
			default:
				System.out.print("Opção Inválida!");
		}
	}
}
