package day13dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String c;
		
		do {
			System.out.println("Bir Kelime Giriniz");
			c=scan.nextLine();
			
			if(!c.contains("a")) {
				System.out.println("kaybettiniz");
			}
			
			
		}while (!c.contains("a"));
		
		System.out.println("kazandýnýz");
		
	}

}
