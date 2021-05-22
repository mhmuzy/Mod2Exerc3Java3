package Hitss.Treinamneto.Infra;

import java.util.Scanner;

public class Controller {
	public static void Play() {
		
		String[] Cliente = new String[4];
		
		
		String[] DvD = new String[4];
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("");
		System.out.println("     Hitss Treinamento");
		System.out.println("");
		for (int j = 1; j < 4; j++) {
			System.out.println("");
			System.out.println("Digite o Nome do(a) Cliente:");
			System.out.println("");
			Cliente[j] = teclado.next();
			System.out.println("");
			for (int j2 = 1; j2 < 4; j2++) {
				System.out.println("");
				System.out.println("Digite o Dvd" + j2 +":");
				System.out.println("");
				DvD[j2] = teclado.next();
				System.out.println("");
			}
		}
		
		System.out.println("Resultado do Processamento");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("");
		for (int j = 1; j < 4; j++) {
			System.out.println("Nome: " + Cliente[j]);
			System.out.println("");
			System.out.println("Dvds Que Pediu:");
			System.out.println("");
			System.out.println("--------------------------------------------");
			System.out.println("");
			for (int j2 = 1; j2 < 4; j2++) {
				System.out.println("Dvd: " + DvD[j2]);
			}
			System.out.println("");
			System.out.println("--------------------------------------------");
			System.out.println("");

		}
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("");

	}
}
