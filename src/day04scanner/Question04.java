package day04scanner;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("bir karakter giriniz");
		char a = scan.next().charAt(0);
		System.out.println("  "+ a);
		System.out.println(" " + a+" "+a);
		System.out.println(a+" "+a+" "+a);
		scan.close();
		
		
		
		
	}

}
