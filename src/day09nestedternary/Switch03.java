package day09nestedternary;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir ay numaras�n� Giriniz");
				
				int a = scan.nextInt();
				
				
	switch (a) {
				
		case 1 : System.out.println("ocak");
		case 2 : System.out.println("�ubat");
		case 3 : System.out.println("mart");
		case 4 : System.out.println("nisan");
		case 5 : System.out.println("may�s");
		case 6 : System.out.println("haziran");
		case 7 : System.out.println("temmuz");
		case 8 : System.out.println("a�ustos");
		case 9 : System.out.println("eyl�l");
		case 10 : System.out.println("ekim");
		case 11 : System.out.println("kas�m");
		case 12 : System.out.println("aral�k");break;
		default  : System.out.println("Ge�erli bir ay numaras� giriniz");
		
				}
	scan.close();
			}

}
