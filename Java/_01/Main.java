//Faça um programa que leia quatro números informados pelo usuário e que depois determine e escreva a média ponderada com os pesos 1,2,3 e 4.
package _01;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double media_ponderada;
		Scanner teclado = new Scanner(System.in);
		int A = teclado.nextInt();
		int B = teclado.nextInt();
		int C = teclado.nextInt();
		int D = teclado.nextInt();
		
		media_ponderada = (A*1 + B*2 + C*3 + D*4)/10;
				System.out.println(media_ponderada);
	}

}
