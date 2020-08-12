package day13dowhileloop;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ýlk deðeri Giriniz:");
		int t = scan.nextInt();
		int i =1;
		
		while (i<=10) {
		System.out.println(t +"x" + i +"="+i*t);
		
			i++;
			
		}
		scan.close();
		

	}

}
