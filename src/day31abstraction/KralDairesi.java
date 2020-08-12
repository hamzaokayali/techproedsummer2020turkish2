package day31abstraction;

public class KralDairesi extends Otel{

	public static void main(String[] args) {
		KralDairesi krl = new KralDairesi();
		
		krl.cay();
		krl.wifi(5);
		krl.kahvalti("serpme");
		

	}
	
	@Override
	public void kahvalti(String tür) {
		System.out.println(tür + " Kahvaltýnýz hazýrlanýyor");
		
	}

	@Override
	public void cay() {
		System.out.println("Çay iç");
	}
	


}
