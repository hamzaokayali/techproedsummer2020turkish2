package day13dowhileloop;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s=0;
		do {
			System.out.println("Bir Sayý giriniz:");
			s=scan.nextInt();
			if (s%2==1) {
				System.out.println("Kaybettiniz");
				
			}
			
			
			
		}while (s%2==1);
		
		System.out.println("Kazandýnýz");
		
		scan.close();
	}

}
