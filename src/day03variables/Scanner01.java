package day03variables;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Tam �sminizi Giriniz");
		String tamIs�m = scan.nextLine();
		System.out.println("isminiz= " + tamIs�m);
		scan.close();
		
		

	}

}
