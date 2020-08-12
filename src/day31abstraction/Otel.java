package day31abstraction;

public abstract class Otel {

	public static void main(String[] args) {
		/*abstract class'i final yapamayiz cunku final class'larin child class'lari olamaz; halbuki biz 
	 abstract class'lari child class'lari olsun ve child class'lari bazi seyleri yapmaya mecbur biraksin diye olustururuz.
	 Bu celiskiden dolayi Java abstract class'larin final olmasina musaade etmez, Compile Time Error verir.
		 * */

	}
	public void wifi(int kisiSayisi) {
		System.out.println(kisiSayisi+ " Kiþilik þifre oluþturuldu");
		
		
		
	}
	public abstract void kahvalti(String tür);
	
	public void cay() {
		System.out.println("Caylar þirketten");
	}
	
	

}
