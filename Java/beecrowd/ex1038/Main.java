package ex1038;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int item_code = entrada.nextInt();
	double qtd_item = entrada.nextDouble();
	double price = 0;
	if (item_code == 1) {
		price = 4.0;
	} else if (item_code == 2) {
		price = 4.50;
	} else if (item_code == 3) {
		 price = 5.0;
	} else if (item_code == 4) {
		 price = 2.0;
	} else if (item_code == 5) {
		 price = 1.50;
	}
	double valor = (qtd_item * price);
	
	String saida = String.format("Total: R$ %.2f", valor);
	System.out.println(saida);
			
	
		

	
	
	
	
	
	
	
	
	}
}
