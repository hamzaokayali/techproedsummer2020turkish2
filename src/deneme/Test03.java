package deneme;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir i�lem t�r� se�iniz (* , + , / ,- ) ");
		char islem = scan.next().charAt(0);
		System.out.println("iki say� giriniz");
		int ilk = scan.nextInt();
		int iki = scan.nextInt();
		
		
		
	}
	
	public static void carpma(int a, int b) {
		System.out.println("�arp�m sonucu= " + (a*b));
	
		
	}
	public static void b�lme(int a, int b) {
		System.out.println("b�lme sonucu= " + (a/b));
	
		
	}
	public static void toplama(int a, int b) {
		System.out.println("toplama sonucu= " + (a+b));
	
		
	}
	public static void c�karma(int a, int b) {
		System.out.println("��karma sonucu= " + (a-b));
	
		
	}
	public static void kontrol() {
		
		
		
		
	}
}
