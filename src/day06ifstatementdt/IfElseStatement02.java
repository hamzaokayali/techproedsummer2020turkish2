package day06ifstatementdt;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {


Scanner scan=new Scanner(System.in);
		
		System.out.println("Bir Sayý Giriniz");
		int s=scan.nextInt();
		
		
		if (s>=10 && s<100) {
			System.out.println("Ýki Basamaklý");
		}

else {
		System.out.println("Ýki Basaklý Deðil");
	}
		
		scan.close();

	}

}
