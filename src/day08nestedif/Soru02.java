package day08nestedif;

import java.util.Scanner;

public class Soru02 {
	
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("kac adet ürün almak istiyorsunuz");
		int a=scan.nextInt();
		
		System.out.println("ürünün birim fiyatini söyleyiniz");
		double b=scan.nextDouble();
		
		if(a>1000) {
			System.out.println("fiyat:"+(a*b*0.9));
		}else {
			System.out.println(a*b);
		}
		
	scan.close();
	
	}
}
