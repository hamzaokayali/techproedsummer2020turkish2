package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
		
		System.out.println("Bir Say� Giriniz");
		int s=scan.nextInt();
		
		if (s<=9 && s>=0) {System.out.println("rakam");}
		if (s>9 || s<0) {System.out.println("Say�");}
		
	scan.close();
		
	}

}
