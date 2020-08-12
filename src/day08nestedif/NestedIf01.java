package day08nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Cinsiyetinizi Giriniz Erkek / Kadýn");
		String cins=scan.next();
		
		System.out.println("Yaþýnýzý Giriniz");
		int yas=scan.nextInt();
		
		if (cins.contentEquals("Erkek")) {
			if(yas<18) {
				System.out.println("erkek Çocuk");
			}else {System.out.println("bay");}
		}
		else if (cins.contentEquals("Kadýn")) {
			if(yas<18) {
				System.out.println("Kýz Çocuk");
			}else {System.out.println("bayan");}
		}else {System.out.println("tanýmlanamadý");}
		scan.close();

	}

}
