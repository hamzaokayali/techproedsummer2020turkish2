package day08nestedif;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Yýl Giriniz");
		
		int yýl = scan.nextInt();
		
		if (yýl %1000==0) {
			System.out.println("milenyum");
		}else if (yýl %100==0) {
			System.out.println("yüzyýl");
		}else if (yýl %10==0) {
			System.out.println("on yýl");
		}else {System.out.println("diðer");}
		
		scan.close();
		

	}

}
