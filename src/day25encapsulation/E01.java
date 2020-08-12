package day25encapsulation;

public class E01 {

	private int sifre = 123456;
	private String isim = "Ali Can";
	private int deneme = 2525;
	
	public static void main(String[] args) {
		
		//System.out.println(sifre);
		
		
		
		
	}
	public int getSifre() {
		return sifre;
	}
	public String getIsim() {
		return isim;
	}
	public int getDeneme() {
		return deneme;
	}
	public void setSifre(int sifre) {
		this.sifre = sifre;
	}
	public void setDeneme(int deneme) {
		this.deneme = deneme;
	}
	public void setIsim(String isim) {
		this.isim = isim ;
	}
}
