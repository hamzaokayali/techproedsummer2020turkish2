package day09nestedternary;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Bir g�n say�s� Giriniz");
		
		int c = scan.nextInt();
		//c=c%8;
		
	switch (c) {
		
		case 1 : System.out.println("Pazar");break;
		case 2 : System.out.println("Pazartesi");break;
		case 3 : System.out.println("sal�");break;
		case 4 : System.out.println("�ar�amba");break;
		case 5 : System.out.println("Per�embe");break;
		case 6 : System.out.println("Cuma");break;
		case 7 : System.out.println("Cumartesi");break;
        default  : System.out.println("tan�mlanamad�");
           					
			}
scan.close();
	}

}
