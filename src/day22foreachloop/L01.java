package day22foreachloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L01 {

	public static void main(String[] args) {
		
		//Bir arrayi nas�l list te �evirebiliriz
		
		String s[] = {"A","B","C"};
		
		List<String> sl = new ArrayList<>();
		
		sl = Arrays.asList(s);
		
		System.out.println(sl);
		
		Object[] listtenArray =sl.toArray();
		
		
		

	}

}
