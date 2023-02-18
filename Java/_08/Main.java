//Elabore um programa que leia o tamanho do lado de um quadrado 
//e informe a área e o perímetro do quadrado


package _08;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.print("Informe o lado do quadrado: ");
	int lado_quadrado = teclado.nextInt();
	int area = lado_quadrado * lado_quadrado;
	int perimetro = lado_quadrado * 4;
	System.out.println("Área do quadrado: " + area);
	System.out.print("Perímetro do quadrado: " + perimetro);
	
	}

}
