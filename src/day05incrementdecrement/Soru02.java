package day05incrementdecrement;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {


Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci Say�y� Giriniz");
		int say1 = scan.nextInt();
		System.out.println("ikinci Say�y� Giriniz");
		int say2 = scan.nextInt();
		
		
		System.out.println(say1+say2);
		
		/* say1 = say1 + say2;
		 * say2 = say1 - say2;
		 * say1 = say1 - say2; 
		 * */
		
		
		
		System.out.println("say�lar           1   2   \n");
		System.out.println("de�i�imden �nce  :"+say1+"   "+say2);
		say1=say1+say2;
		System.out.println("1. a�ama         :"+say1+"   "+say2);
		say2=say1-say2;
		System.out.println("2. a�ama         :"+say1+"   "+say2);
		say1=say1-say2;
		System.out.println("3. a�ama         :"+say1+"   "+say2);
		scan.close();
		
		
		
		
	}

}
