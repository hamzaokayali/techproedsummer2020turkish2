package day07ifelseifstatementdt;

import java.util.Scanner;

public class �felseif02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.println("Bir harf Giriniz");
	/*	char s=scan.next().charAt(0);
		
		
		if (s=='a' || s=='A' ) {
			System.out.println("�lk Harf");}
		else if (s=='b' || s=='B' ) {
			System.out.println("�kinci Harf");}
		else if (s=='c' || s=='C' ) {
			System.out.println("���nc� Harf");}
		
		else {System.out.println("Bilmiyorum");}
		
		
		System.out.println(" HARF giriniz" );*/
        String harf =scan.next();
        
        
        if(harf.equals("a") || harf.equals("A")) {
        
            System.out.println("Ilk harf" );
        } 
        else if(harf.equals("b") || harf.equals("B")) {
            
            System.out.println("Ik�nci harf" );
        } 
        else  {
            
            System.out.println(" Bilinmeyen harf" );
            }
    
	}
}	
		
		
		
		
	


