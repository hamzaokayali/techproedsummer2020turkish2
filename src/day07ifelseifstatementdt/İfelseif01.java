package day07ifelseifstatementdt;

import java.util.Scanner;

public class �felseif01 {

	public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
		
		System.out.println("Bir Say� Giriniz");
		double s=scan.nextDouble();
		
		
		if (s>0 ) {
			System.out.println("Pozitif");
		}
		else if (s==0) {
			System.out.println("N�tr");
		}
		else {
			System.out.println("Negatif");
		}
		
		
scan.close();		
		
		
	}

}
