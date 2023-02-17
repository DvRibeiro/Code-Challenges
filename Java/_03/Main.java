//Faça um programa que receba o peso e a altura de uma pessoa.
//Determine e escreva a massa corpórea da pessoa (=peso em kg dividido pela altura ao quadrado).

package _03;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.print("Digite seu peso (kg): ");
	int peso = teclado.nextInt();
	System.out.print("Digite sua altura (cm): ");
	double altura = teclado.nextDouble();
	double altura_formatada = altura/100 * altura/100;
	double imc = peso/(altura_formatada);
	System.out.println(imc);
	

	}

}
