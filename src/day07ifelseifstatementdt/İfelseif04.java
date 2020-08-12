package day07ifelseifstatementdt;

import java.util.Scanner;

public class Ýfelseif04 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		System.out.println("Vize Ve final notlarýnýzý Giriniz");
		int s1=scan.nextInt();
		int s2=scan.nextInt();
		int s=(s1+s2)/2;
		
if (s1<0 || s2<0) {
	System.out.println("Geçerli not giriniz");
}else if (s1>100 || s2>100 ) {
	System.out.println("Geçerli not giriniz");
}else if (s<50 ) {
	System.out.println("Kaldýnýz");
}else if (s<70) {
	System.out.println("C ile Geçtiniz");
}else if (s<85) {
	System.out.println("B ile Geçtiniz");
}else if (s<=100) {
	System.out.println("A ile Geçtiniz");
}else {System.out.println("Geçerli not giriniz");}
System.out.println(s);

scan.close();



	}

}
