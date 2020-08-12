package day10stringmethods;

import java.util.Scanner;

public class StringMethods02 {

	public static void main(String[] args) {
		
		String a ="Java";
		String b ="Java";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Java");
		String c = scan.nextLine();
		
		
		System.out.println(a==b);//true
		System.out.println(a.equals(b));
		System.out.println(a==c);
		System.out.println(a.equals(c));
		
		scan.close();
		
		String d = "Java";
		String e = "java";
		String f = "JAVA";
		System.out.println(d.equalsIgnoreCase(e));
		System.out.println(e.equalsIgnoreCase(d));
		
		
		
		

	}

}
