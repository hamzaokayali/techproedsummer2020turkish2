package day09nestedternary;

import java.util.Scanner;

public class NestedTernary01 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir Sayý Giriniz");
		int s1 = scan.nextInt();
		
		String c = s1>0 ? s1>9 ? "sayi" : "rakam" : s1==0 ? "rakam" : "negatif sayý";
		System.out.println(c);
		
scan.close();
		
		
		
	}

}
