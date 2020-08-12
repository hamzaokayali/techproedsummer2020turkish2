package day08nestedif;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
		
		
		System.out.println("3 Sayý Giriniz");
		int k1=scan.nextInt();
		int k2=scan.nextInt();
		int k3=scan.nextInt();
		
		String res = k1==k2&&k1==k3 ? "eþkenar üçgen" : "Eþkenar deðil";
		System.out.println(res);
		
scan.close();
		
	}

}
