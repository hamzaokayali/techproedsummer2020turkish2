package day24accessmodifierstringbuilder;

public class Sb01 {

	public static void main(String[] args) {
		
		StringBuilder stb1 = new StringBuilder();
		
		System.out.println(stb1);
		
		stb1.append("Java"); 
		
		System.out.println(stb1);
		
		stb1.append(" kolaydir");
		
		System.out.println(stb1);
		
		StringBuilder stb2 = new StringBuilder(5);
		
		stb2.append("ali");
		System.out.println(stb2);
		
		stb2.append(" kazandi");
		System.out.println(stb2);
		
		StringBuilder stb3 = new StringBuilder("Java");
		System.out.println(stb3);
		
		StringBuilder stb4 = new StringBuilder("deneme");
		stb4.append("saat").append("deneme");
		System.out.println(stb4.substring(5, 8));
		System.out.println(stb4);
		
	System.out.println(	stb4.charAt(3));
	System.out.println(stb4.delete(5, 8));
	
	System.out.println(stb4.getClass());
	
	System.out.println(stb4.indexOf("ne"));
	
	System.out.println(stb4);
	System.out.println(stb4.insert(5, "."));
	
	System.out.println(stb4.lastIndexOf(""));
	
	System.out.println(stb4.reverse());
	stb4.setCharAt(1, 'E');
	System.out.println(stb4);
	
	StringBuilder stb5 = new StringBuilder(9);
	stb5.append("sfgdfgdfgdhh");
	System.out.println(stb5.capacity());
	System.out.println(stb5.length());
	
	StringBuilder stb6 = new StringBuilder("Java Kolay");
	System.out.println(stb6);
	stb6.append("x");
	System.out.println(stb6);
		
	System.out.println(stb6.substring(8));
	System.out.println(stb6);
	
	StringBuilder strBld = new StringBuilder("LearnJava");
	strBld.substring(3);
	System.out.println(strBld);
	
	}

}
