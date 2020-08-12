package day13dowhileloop;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s=0;
		do {
			
			System.out.println("Bir sayý giriniz");
			 s = scan.nextInt();
			
			if (s<=10) {
				
				System.out.println("kaybettiniz");
			}
			
			
		}while (s<=10);
		
		System.out.println("Kazandýnýz");
		scan.close();

	}

}

//while nin çalýþmasý için þartý saðlanmasý lazým  
//do whilenin çalýþmasý içinde þart saðlamasý lazým lakin þartý saðlamadan da 1 kere çalýþýr.