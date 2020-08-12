package day07ifelseifstatementdt;

import java.util.Scanner;

public class Deneme {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ýki notunuzu giriniz");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		double ort =(n1+n2)/2;
				
		if((n1<0 || n2<0) || (n1>100 || n2>100)) {
			System.out.println("gecerli not giriniz");
		}else if (ort<50) {
			System.out.println("Kaldýnýz");
		}else if (ort<70) {
			System.out.println("C ile gectiniz");
		}else if (ort<85) {
			System.out.println("B ile gectiniz");
		}else {
			System.out.println("A ile gectiniz");
			System.out.println(ort);
		}
		
		scan.close();
	}

}
