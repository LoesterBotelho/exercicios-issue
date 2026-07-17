import java.util.Scanner;

/**
 * Exercício 2) <br>
 * Crie uma array de 5 elementos e descubra:<br>
 * a) Qual o maior elemento<br>
 * b) Qual o menor elemento <br>
 * c) A média dos elementos
 * 
 * 
 */
public class Ex2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numeros = new int[5];
		double soma = 0;
		
		System.out.println("Digite 5 numeros:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Numero " + (i+1) + ": ");
			numeros[i] = input.nextInt();
			soma += numeros[i];
		}

		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		for (int num : numeros) {
			if (num > maior) {
				maior = num;
			} else if (num < menor) {
				menor = num;
			}
		}

		double media = soma / numeros.length;

		System.out.println("Maior numero: " + maior);
		System.out.println("Menor numero: " + menor);
		System.out.println("Media dos numero: " + media);

	}
}
