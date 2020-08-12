package day09nestedternary;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir ay numarasýný Giriniz");
				
				int a = scan.nextInt();
				
				
	switch (a) {
				
		case 1 : System.out.println("ocak");
		case 2 : System.out.println("þubat");
		case 3 : System.out.println("mart");
		case 4 : System.out.println("nisan");
		case 5 : System.out.println("mayýs");
		case 6 : System.out.println("haziran");
		case 7 : System.out.println("temmuz");
		case 8 : System.out.println("aðustos");
		case 9 : System.out.println("eylül");
		case 10 : System.out.println("ekim");
		case 11 : System.out.println("kasým");
		case 12 : System.out.println("aralýk");break;
		default  : System.out.println("Geçerli bir ay numarasý giriniz");
		
				}
	scan.close();
			}

}
