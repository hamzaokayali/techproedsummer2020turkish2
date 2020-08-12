package day25encapsulation;

public class E02 {

	public static void main(String[] args) {
		
		E01 obj = new E01();
		
		System.out.println(obj.getSifre());
		System.out.println(obj.getIsim());
		System.out.println(obj.getDeneme());
		
		obj.setSifre(987654);
		System.out.println(obj.getSifre());
		
		obj.setDeneme(5252);
		System.out.println(obj.getDeneme());
		
		obj.setIsim("Süleyman");
		System.out.println(obj.getIsim());
		
		E03 obj2 = new E03();
		System.out.println(obj2.getIsim());
		System.out.println(obj2.getYas());
		
		obj2.setBorc(2300.0f);
		
		obj2.setYas((byte)25);
		System.out.println(obj2.getYas());
		
	}

}
