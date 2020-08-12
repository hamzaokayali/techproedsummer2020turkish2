package day08nestedif;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir Sayý Giriniz");
		int s1 = scan.nextInt();
		
		int res = s1%2==1 ? (s1*s1) : (s1/2) ;
		
		System.out.println(res);
scan.close();
		
	}

}
