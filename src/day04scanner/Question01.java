package day04scanner;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Dikdörtgenin enini boyunu giriniz.");
		double en = scan.nextDouble();
		double boy = scan.nextDouble();
		System.out.println("Alan= " + en*boy);;
		System.out.println("Çevre= " + 2*(en+boy));
		
		scan.close();
		
	}

}
