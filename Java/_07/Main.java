//A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros.
//Faça um programa que receba um valor de uma compra e mostre o valor das prestações

package _07;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.print("Valor de uma compra: ");
	int valor_compra = teclado.nextInt();
	int valor_prestacao = valor_compra / 5;
	System.out.print("Valor de uma prestação: " + valor_prestacao);	
	}

}
