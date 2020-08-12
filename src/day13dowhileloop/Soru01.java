package day13dowhileloop;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Ýlk deðeri Giriniz:");
		int ilk = scan.nextInt();
		System.out.println("ikinci sayýyý Giriniz");
		int son = scan.nextInt();
		
		int crp=1;
		while (ilk<=son) {
			crp=crp*ilk;
			ilk++;
			}
		
		System.out.println(crp);
		scan.close();
	}

}
