package day03variables;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Tam Ýsminizi Giriniz");
		String tamIsým = scan.nextLine();
		System.out.println("isminiz= " + tamIsým);
		scan.close();
		
		

	}

}
