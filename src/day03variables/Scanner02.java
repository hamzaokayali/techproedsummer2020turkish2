package day03variables;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Tam �sminizi Giriniz");
		String tamIs�m = scan.nextLine();
		System.out.println("Ya��n�z� Giriniz");
		int yas=scan.nextInt();
		System.out.println("isim "+tamIs�m +" ya� "+ yas);
		System.out.println("ilk Harf giriniz");
		char ilk = scan.next().charAt(0);
		System.out.println(ilk);
		System.out.println("�ocuk Say�s�n� Giriniz");
		byte cocuk = scan.nextByte();
		System.out.println(cocuk);
				
scan.close();


	}

}
