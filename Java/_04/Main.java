/*
PROBLEMA:

Um hotel deseja fazer uma promoção especial de final de semana, concedendo um desconto
de 25% na diária. Sendo informados, através do teclado, o número de apartamentos do hotel e
o valor da diária por apartamento para o final de semana completo, elabore um programa
para calcular e escrever:
-valor promocional da diária
-valor total a ser arrecadado caso a ocupação neste final de semana atinja 100%
-valor total a ser arrecadado caso a ocupação neste final de semana atinja 70%
-valor que o hotel deixará de arrecadar em virtude da promoção, caso a ocupação atinja 100%
*/

package _04;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.print("Insira o número de apartamentos: ");
	int num_apart = teclado.nextInt();
	System.out.print("Insira o valor da diária (R$): ");
	int valor_diaria = teclado.nextInt();
	double valor_fim_de_semana = valor_diaria * 2;
	double desconto = valor_diaria  * (0.25);
	double valor_diaria_promocao = valor_diaria - desconto;
	double valor_fim_de_semana_promocao = valor_diaria_promocao * 2;
	double valor_total = valor_fim_de_semana_promocao * num_apart;
	double valor_70 = valor_fim_de_semana_promocao * (num_apart * (0.7));
	double diff_promocao_valor_normal = (valor_fim_de_semana * num_apart) - valor_total;
	System.out.println("-> Valor promocional da diária: " + valor_diaria_promocao);
	System.out.println("-> Valor total a ser arrecadado caso a ocupação neste final de semana atinja 100%: " + valor_total);
	System.out.println("-> Valor total a ser arrecadado caso a ocupação neste final de semana atinja 70%: " + valor_70);
	System.out.println("-> Valor que o hotel deixará de arrecadar em virtude da promoção, caso a ocupação atinja 100%: " + diff_promocao_valor_normal);
	}

}
