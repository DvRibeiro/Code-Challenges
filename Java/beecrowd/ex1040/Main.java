package ex1040;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.0");

	double n1 = entrada.nextDouble();
	double n2 = entrada.nextDouble();
	double n3 = entrada.nextDouble();
	double n4 = entrada.nextDouble();
	double media = (((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10.0);
	System.out.println("Media: " + df.format(media));
	if (media >= 7.0) {
		System.out.println("Aluno aprovado.");
	} else if (media >= 5.0 && media <= 6.9) {
		System.out.println("Aluno em exame.");
		double exam = entrada.nextDouble();
		System.out.println("Nota do exame: " + df.format(exam));
		double nova_media = (media + exam) / 2;
		if (nova_media >= 5.0) {
			System.out.println("Aluno aprovado.");
			System.out.println("Media final: " + df.format(nova_media));
		} else {
			System.out.println("Aluno reprovado.");
			System.out.println("Media final: " + df.format(nova_media));
		}
	} else {
		System.out.println("Aluno reprovado.");
	}

	}

}
