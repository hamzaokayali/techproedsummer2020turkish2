package day13dowhileloop;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("�lk de�eri Giriniz:");
		int ilk = scan.nextInt();
		System.out.println("ikinci say�y� Giriniz");
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
