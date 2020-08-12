package day03variables;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Tam Ýsminizi Giriniz");
		String tamIsým = scan.nextLine();
		System.out.println("Yaþýnýzý Giriniz");
		int yas=scan.nextInt();
		System.out.println("isim "+tamIsým +" yaþ "+ yas);
		System.out.println("ilk Harf giriniz");
		char ilk = scan.next().charAt(0);
		System.out.println(ilk);
		System.out.println("Çocuk Sayýsýný Giriniz");
		byte cocuk = scan.nextByte();
		System.out.println(cocuk);
				
scan.close();


	}

}
