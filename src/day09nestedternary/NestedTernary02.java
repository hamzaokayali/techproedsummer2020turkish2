package day09nestedternary;

import java.util.Scanner;

public class NestedTernary02 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("�� Kenar Uzunluklar�n� Giriniz");
		int k1 = scan.nextInt();
		int k2 = scan.nextInt();
		int k3 = scan.nextInt();
		
		String res = k1==k2&&k1==k3 ? k1*3>30 ? "ne b�y�ks�n" : "normal" : (k1+k2+k3)<20 ? "ne k���ks�n" : "normal2";
		System.out.println(res);
	
scan.close();
	}

}
