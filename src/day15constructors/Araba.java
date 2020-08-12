package day15constructors;

public class Araba {
	
	int yil = 2019;
	String marka = "Toyata";
	String model = "Rav4";
	int fiyat = 20000;
	
	Araba(String model , int fiyat){
		this.model =model ;
		this.fiyat= fiyat;
	}
	Araba(String model , int fiyat, String marka, int yil){
		this.model =model ;
		this.fiyat= fiyat;
		this.yil=yil;
		this.marka=marka;
	}
	Araba(){
		
	}

	public static void main(String[] args) {
		Araba a1 = new Araba();
		System.out.println("fiyatý " + a1.fiyat);
		System.out.println("marka "+ a1.marka);
		System.out.println("model "+ a1.model);
		System.out.println("Üretim yýlý " + a1.yil);
		a1.hizlanma(8);
		a1.tuketim();
		System.out.println("_______________________");
		Araba a2 = new Araba("corolla" , 1000);
		System.out.println("fiyatý " + a2.fiyat);
		System.out.println("marka "+ a2.marka);
		System.out.println("model "+ a2.model);
		System.out.println("Üretim yýlý " + a2.yil);
		a2.hizlanma(7);
		a2.tuketim();
		System.out.println("___________________");
		Araba a3 = new Araba("a200", 100000 ,"mercedes",2020);
		System.out.println("fiyatý " + a3.fiyat);
		System.out.println("marka "+ a3.marka);
		System.out.println("model "+ a3.model);
		System.out.println("Üretim yýlý " + a3.yil);
		a3.hizlanma(3);
		a3.tuketim();
	}

	 public void hizlanma(int i) {
		 System.out.println(i +" sn' 100/sa e ulaþýr");		 
		 
	 }
	 public void tuketim() {
		 System.out.println("km ' de 0,1 dolar yakar");
	 }
}
