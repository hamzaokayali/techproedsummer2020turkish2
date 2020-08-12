package day08nestedif;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Bir karakter giriniz");
		char c=scan.next().charAt(0);
		
		String res = c>='a'&&c<='z'||(c>='A'&&c<='Z') ? "Harf" : "Harf deðil";
		System.out.println(res);
		
scan.close();
		
		
	}

}
