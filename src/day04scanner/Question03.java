package day04scanner;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Saat giriniz:");
		long saat = scan.nextLong();
		System.out.println(saat*60*60);
		
		
		scan.close();
		
		
	}

}
