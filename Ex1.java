import java.util.Scanner;

/**
 * Exercício 1) <br>
 * 
 * Descreva um algoritmo que vá lendo a altura de pessoas até o usuário entrar
 * com o número 0 <br>
 * Calcule a média de altura delas.
 * 
 */
public class Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double somaAltura = 0;
		int contador = 0;
		double altura;

		while (true) {
			System.out.println("Insira a altura");
			altura = input.nextDouble();

			if (altura == 0) {
				break;
			}

			if (altura < 0) {
				System.out.println("Altura inválida.");
				continue;
			}

			somaAltura += altura;
			contador++;
		}

		if (contador > 0) {
			double media = somaAltura / contador;
			System.out.println("somaAltura = " + somaAltura);
			System.out.println("contador =  " + contador);
			System.out.println("Média de altura: " + media + " metros");
		} else {
			System.out.println("Nenhuma altura válida foi informada.");
		}

		input.close();
	}

}