package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
		
		System.out.println("Bir Sayý Giriniz");
		int s=scan.nextInt();
		
		if (s<0) {System.out.println("sayý Negatifdir.");}
		if (s>0) {System.out.println("sayý Pozitiftir.");}
		if (s==0) {System.out.println("sayý Nötr.");}
		
	scan.close();
	}

}
