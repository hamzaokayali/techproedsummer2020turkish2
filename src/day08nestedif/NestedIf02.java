package day08nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Ya��n�z� Giriniz");
		int s=scan.nextInt();
		
		if(s>0) {
			if (s>10) {System.out.println("Wooow");
		}else {System.out.println("H�mmmmmmm");}
		}
		else {
			if (s<-10) {System.out.println("Felaket");
			}else {System.out.println("Ne Yapal�m");}
			
		}
scan.close();
}
}