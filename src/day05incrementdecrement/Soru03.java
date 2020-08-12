package day05incrementdecrement;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Üç basamaklý bir Sayý Giriniz");
		int say1 = scan.nextInt();
		
		int a=say1%10;
		say1=(say1-a)/10;
		
		int b=say1%10;
		say1=(say1-b)/10;
		
		int top=a+b+say1;
		System.out.println(top);
		
		scan.close();
	}

}
