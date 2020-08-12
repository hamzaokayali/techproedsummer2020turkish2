package deneme;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir iþlem türü seçiniz (* , + , / ,- ) ");
		char islem = scan.next().charAt(0);
		System.out.println("iki sayý giriniz");
		int ilk = scan.nextInt();
		int iki = scan.nextInt();
		
		
		
	}
	
	public static void carpma(int a, int b) {
		System.out.println("çarpým sonucu= " + (a*b));
	
		
	}
	public static void bölme(int a, int b) {
		System.out.println("bölme sonucu= " + (a/b));
	
		
	}
	public static void toplama(int a, int b) {
		System.out.println("toplama sonucu= " + (a+b));
	
		
	}
	public static void cýkarma(int a, int b) {
		System.out.println("çýkarma sonucu= " + (a-b));
	
		
	}
	public static void kontrol() {
		
		
		
		
	}
}
