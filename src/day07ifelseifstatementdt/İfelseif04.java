package day07ifelseifstatementdt;

import java.util.Scanner;

public class �felseif04 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		System.out.println("Vize Ve final notlar�n�z� Giriniz");
		int s1=scan.nextInt();
		int s2=scan.nextInt();
		int s=(s1+s2)/2;
		
if (s1<0 || s2<0) {
	System.out.println("Ge�erli not giriniz");
}else if (s1>100 || s2>100 ) {
	System.out.println("Ge�erli not giriniz");
}else if (s<50 ) {
	System.out.println("Kald�n�z");
}else if (s<70) {
	System.out.println("C ile Ge�tiniz");
}else if (s<85) {
	System.out.println("B ile Ge�tiniz");
}else if (s<=100) {
	System.out.println("A ile Ge�tiniz");
}else {System.out.println("Ge�erli not giriniz");}
System.out.println(s);

scan.close();



	}

}
