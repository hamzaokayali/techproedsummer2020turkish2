package day23daytime;



public class Homework {

	//Homework: Kelimenin harflerini alip onlari giris sirasina gore birlestirerek 
	//          ekrana basan bir program yaziniz. Varargs kullanmalisiniz.
		
	public static void main(String[] args) {
		
		
		
		birleþtir('s','ü','l','e','y','m','a','n','\n');
		birleþtir('s','ü','l','e','y','m','a','n','i','y','e');

	}
	public static void birleþtir(char ... p) {
		System.out.print(p);
	}
}
