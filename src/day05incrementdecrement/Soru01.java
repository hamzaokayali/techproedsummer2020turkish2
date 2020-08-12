package day05incrementdecrement;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci Sayýyý Giriniz");
		int say1 = scan.nextInt();
		System.out.println("ikinci Sayýyý Giriniz");
		int say2 = scan.nextInt();
		
		int temp = 0 ;
		System.out.println("sayýlar           1   2   boþ\n");
		System.out.println("deðiþimden önce  :"+say1+"   "+say2+"   "+temp);
		temp=say1;
		System.out.println("1. aþama         :"+say1+"   "+say2+"   "+temp);
		say1=say2;
		System.out.println("2. aþama         :"+say1+"   "+say2+"   "+temp);
		say2=temp;
		System.out.println("3. aþama         :"+say1+"   "+say2+"   "+temp);
		scan.close();
	}

}
