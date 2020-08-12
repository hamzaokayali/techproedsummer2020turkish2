package day09nestedternary;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Bir gün sayýsý Giriniz");
		
		int c = scan.nextInt();
		//c=c%8;
		
	switch (c) {
		
		case 1 : System.out.println("Pazar");break;
		case 2 : System.out.println("Pazartesi");break;
		case 3 : System.out.println("salý");break;
		case 4 : System.out.println("çarþamba");break;
		case 5 : System.out.println("Perþembe");break;
		case 6 : System.out.println("Cuma");break;
		case 7 : System.out.println("Cumartesi");break;
        default  : System.out.println("tanýmlanamadý");
           					
			}
scan.close();
	}

}
