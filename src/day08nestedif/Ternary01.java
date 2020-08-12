package day08nestedif;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {


		if (5>4) {System.out.println("Elma");}else {System.out.println("Armut");}
		String res = 5<4 ? "elma" : "Armut";
		System.out.println(res);
		
Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Sayý Giriniz");
		int s=scan.nextInt();
		String res1 = s>0&&s<9 ? "Rakam" : "Sayý";
		System.out.println(res1);
		
scan.close();

	}

}

