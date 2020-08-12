package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
		
		System.out.println("Bir Sayý Giriniz");
		int s=scan.nextInt();
		
		if(s%3==0) 
			{System.out.println("Sayý üçe bölünür");}		
		
		if(s%3!=0) 		
			{System.out.println("Sayý üçe bölünmez");}
		
	scan.close();
}
}