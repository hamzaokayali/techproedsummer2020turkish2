package day04scanner;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Yar� �ap� giriniz:");
		float cap = scan.nextFloat();
		System.out.println("Alan= " + 3.14159*cap*cap);
		System.out.println("�evre= " + 2*3.14159*cap);
		
		
		scan.close();
	}

}
