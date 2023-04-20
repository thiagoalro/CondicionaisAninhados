import java.util.Scanner;

public class CondicionalMultipla {

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = input.nextInt();
		switch(numero){
			case 1:
				System.out.print("você digitou 1");
				break;
			case 2:
				System.out.print("você digitou 2");
				break;
			default:
				System.out.println("Não é 1 nem 2");
		}
	}
}
