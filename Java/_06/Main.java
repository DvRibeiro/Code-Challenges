//Faça o programa que calcule o valor em Reais, correspondente aos dólares que um turista
//possui no cofre do hotel. Deve-se informar os seguintes dados: quantidade de dólares guardados
//no cofre e a cotação do dólar do dia.

package _06;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.print("Quantidade de dólares guardados: ");
	int qtd_dolar = teclado.nextInt();
	System.out.print("Cotação do dólar hoje: ");
	double cotacao_dolar = teclado.nextDouble();
	double valor_reais = qtd_dolar * cotacao_dolar;
	System.out.print("Valor em reais: " + valor_reais);
		
	}

}
