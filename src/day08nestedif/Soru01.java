package day08nestedif;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Y�l Giriniz");
		
		int y�l = scan.nextInt();
		
		if (y�l %1000==0) {
			System.out.println("milenyum");
		}else if (y�l %100==0) {
			System.out.println("y�zy�l");
		}else if (y�l %10==0) {
			System.out.println("on y�l");
		}else {System.out.println("di�er");}
		
		scan.close();
		

	}

}
