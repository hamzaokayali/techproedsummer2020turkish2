package day13dowhileloop;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s=0;
		do {
			
			System.out.println("Bir say� giriniz");
			 s = scan.nextInt();
			
			if (s<=10) {
				
				System.out.println("kaybettiniz");
			}
			
			
		}while (s<=10);
		
		System.out.println("Kazand�n�z");
		scan.close();

	}

}

//while nin �al��mas� i�in �art� sa�lanmas� laz�m  
//do whilenin �al��mas� i�inde �art sa�lamas� laz�m lakin �art� sa�lamadan da 1 kere �al���r.