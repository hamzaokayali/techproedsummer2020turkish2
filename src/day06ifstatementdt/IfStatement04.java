package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement04 {

	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
		
		System.out.println("Bir Sayý Giriniz");
		int s=scan.nextInt();
		
		if (s<=9 && s>=0) {System.out.println("rakam");}
		if (s>9 && s<100) {System.out.println("Ýki basamaklý");}
		
	scan.close();		
		

	}

}
