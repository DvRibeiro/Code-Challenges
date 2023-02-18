//Faça um programa que possa receber um valor de um produto e escreva
//o valor tendo em vista que o desconto foi de 9%.

package _05;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double taxa_desconto = 0.09;
	System.out.print("Valor do produto (R$): ");
	float valor_produto = teclado.nextFloat();
	double valor_desconto = valor_produto - (valor_produto * taxa_desconto);
	System.out.println("Valor do produto com desconto (R$): " + valor_desconto );
	
		
	}

}
