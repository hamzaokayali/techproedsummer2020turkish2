package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
		
		System.out.println("Bir Say� Giriniz");
		int s=scan.nextInt();
		
		if(s%3==0) 
			{System.out.println("Say� ��e b�l�n�r");}		
		
		if(s%3!=0) 		
			{System.out.println("Say� ��e b�l�nmez");}
		
	scan.close();
}
}