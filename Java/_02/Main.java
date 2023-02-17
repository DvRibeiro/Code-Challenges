package _02;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	double rendimento, total;
	Scanner teclado = new Scanner(System.in);
	System.out.print("Valor depósito: ");
	int deposito = teclado.nextInt();
	System.out.print("Taxa juros (%): ");
	double taxa = teclado.nextInt();
	System.out.print("tempo (meses): ");
	int tempo = teclado.nextInt();
	rendimento = (deposito * tempo * (taxa/100));
	total = (deposito + rendimento);
	System.out.println(rendimento);
	System.out.println(total);
	}

}
