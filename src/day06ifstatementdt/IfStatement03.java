package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
		
		System.out.println("Bir Say� Giriniz");
		int s=scan.nextInt();
		
		if (s<0) {System.out.println("say� Negatifdir.");}
		if (s>0) {System.out.println("say� Pozitiftir.");}
		if (s==0) {System.out.println("say� N�tr.");}
		
	scan.close();
	}

}
