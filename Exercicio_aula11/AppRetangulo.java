package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AppRetangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		System.out.println("---------RETANGULO--------");
		System.out.print("Insira a base do retangulo: ");
		ret.base = sc.nextDouble();
		System.out.print("Insira a altura do retangulo: ");
		ret.altura = sc.nextDouble();
		
		System.out.println("");
		System.out.println("---------RESULTADO--------");
		System.out.printf("A área é %.2f%n", ret.calcularArea());
		System.out.printf("O perímetro é %.2f%n", ret.calcularPerimetro());		
		
		sc.close();
	}

}
