package day31abstraction;

public class KralDairesi extends Otel{

	public static void main(String[] args) {
		KralDairesi krl = new KralDairesi();
		
		krl.cay();
		krl.wifi(5);
		krl.kahvalti("serpme");
		

	}
	
	@Override
	public void kahvalti(String t�r) {
		System.out.println(t�r + " Kahvalt�n�z haz�rlan�yor");
		
	}

	@Override
	public void cay() {
		System.out.println("�ay i�");
	}
	


}
