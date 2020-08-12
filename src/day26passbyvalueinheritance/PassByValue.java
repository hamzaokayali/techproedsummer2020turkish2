package day26passbyvalueinheritance;

public class PassByValue {

	
	
	public static void main(String[] args) {
		
		int gomlek = 100 ; 
		String hazine = "altýn";
		
		indOgr(gomlek);
		
		System.out.println(gomlek);
		System.out.println(indOgr(gomlek));
		System.out.println(askInd(gomlek));
		System.out.println(yasInd(gomlek));
		System.out.println(gomlek);
		hazineAl(hazine);
		System.out.println(hazine);
		System.out.println(hazineAl(hazine));
		
		
	}
	public static int indOgr (int gomlek) {
		return gomlek  -20;
	}
	public static int askInd(int gomlek) {
		return gomlek - 5;
	}
	public static int yasInd(int gomlek) {
		return gomlek - 10 ;
	}
	public static String hazineAl(String hazine) {
		return hazine + "alindi";		
	}

}
