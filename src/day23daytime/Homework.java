package day23daytime;



public class Homework {

	//Homework: Kelimenin harflerini alip onlari giris sirasina gore birlestirerek 
	//          ekrana basan bir program yaziniz. Varargs kullanmalisiniz.
		
	public static void main(String[] args) {
		
		
		
		birle�tir('s','�','l','e','y','m','a','n','\n');
		birle�tir('s','�','l','e','y','m','a','n','i','y','e');

	}
	public static void birle�tir(char ... p) {
		System.out.print(p);
	}
}
