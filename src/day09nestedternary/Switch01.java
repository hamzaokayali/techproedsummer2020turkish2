package day09nestedternary;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir Harf Giriniz");
		
		char c = scan.next().charAt(0);
		
	switch (c) {
		
		case 'a' :
    	case 'A' : System.out.println("�lk Harf");
    				break;
   		case 'b' :
   		case 'B' : System.out.println("�kinci Harf");
   					break;
        case 'c' :
        case 'C' : System.out.println("���nc� Harf");
  					break;
        default  : System.out.println("tan�mlanamad�");
           					
			}
		scan.close();
	}

}
