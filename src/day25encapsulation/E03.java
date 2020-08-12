package day25encapsulation;

public class E03 {
	
		private byte yas = 23 ;
		private float borc = 6500.0f;
		private String isim = "Kemal Doðru";
		private boolean zengin = true;
	public static void main(String[] args) {
		String a = "java";
		StringBuilder b = new StringBuilder("java");
		//if(a==b)
			b.substring(6, 5);
		

	}

	public byte getYas() {
		return yas;
	}

	public void setYas(byte yas) {
		this.yas = yas;
	}

	public String getIsim() {
		return isim;
	}

	public void setBorc(float borc) {
		this.borc = borc;
	}

	public boolean isZengin() {
		return zengin;
	}

	public void setZengin(boolean zengin) {
		this.zengin = zengin;
	}

}
