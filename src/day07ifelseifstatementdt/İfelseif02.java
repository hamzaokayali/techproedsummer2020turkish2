package day07ifelseifstatementdt;

import java.util.Scanner;

public class Ýfelseif02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.println("Bir harf Giriniz");
	/*	char s=scan.next().charAt(0);
		
		
		if (s=='a' || s=='A' ) {
			System.out.println("Ýlk Harf");}
		else if (s=='b' || s=='B' ) {
			System.out.println("Ýkinci Harf");}
		else if (s=='c' || s=='C' ) {
			System.out.println("Üçüncü Harf");}
		
		else {System.out.println("Bilmiyorum");}
		
		
		System.out.println(" HARF giriniz" );*/
        String harf =scan.next();
        
        
        if(harf.equals("a") || harf.equals("A")) {
        
            System.out.println("Ilk harf" );
        } 
        else if(harf.equals("b") || harf.equals("B")) {
            
            System.out.println("Ikýnci harf" );
        } 
        else  {
            
            System.out.println(" Bilinmeyen harf" );
            }
    
	}
}	
		
		
		
		
	


