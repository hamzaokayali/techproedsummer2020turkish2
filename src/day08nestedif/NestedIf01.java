package day08nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Cinsiyetinizi Giriniz Erkek / Kad�n");
		String cins=scan.next();
		
		System.out.println("Ya��n�z� Giriniz");
		int yas=scan.nextInt();
		
		if (cins.contentEquals("Erkek")) {
			if(yas<18) {
				System.out.println("erkek �ocuk");
			}else {System.out.println("bay");}
		}
		else if (cins.contentEquals("Kad�n")) {
			if(yas<18) {
				System.out.println("K�z �ocuk");
			}else {System.out.println("bayan");}
		}else {System.out.println("tan�mlanamad�");}
		scan.close();

	}

}
