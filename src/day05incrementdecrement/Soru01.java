package day05incrementdecrement;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci Say�y� Giriniz");
		int say1 = scan.nextInt();
		System.out.println("ikinci Say�y� Giriniz");
		int say2 = scan.nextInt();
		
		int temp = 0 ;
		System.out.println("say�lar           1   2   bo�\n");
		System.out.println("de�i�imden �nce  :"+say1+"   "+say2+"   "+temp);
		temp=say1;
		System.out.println("1. a�ama         :"+say1+"   "+say2+"   "+temp);
		say1=say2;
		System.out.println("2. a�ama         :"+say1+"   "+say2+"   "+temp);
		say2=temp;
		System.out.println("3. a�ama         :"+say1+"   "+say2+"   "+temp);
		scan.close();
	}

}
