package day31abstraction;

public class Cat extends Mammal{

	public static void main(String[] args) {
		
		
		
		/*
		 * 1) concrete classlar parentlari olan abstract classlardan tum abstract metodlari
		 * override etmek zorundadir. aksi halde cte olur.
		 * 2) concrete classlar parentlari olan abstract classlardaki concrete metodlari
		 * override etmek zorunda degildir. concrete metodlarin override edilmesi istege
		 * baglidir.
		 */
		
			
		}
		@Override
		public void asi() {
			System.out.println("ey kedi igne ol");
			
		}
		@Override
		public void drink() {
			System.out.println("su ic");
	}
		@Override
		public void feed() {
			
			System.out.println("Yavrularýný besler");
			
		}

}
