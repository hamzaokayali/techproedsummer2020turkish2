package day18arrays;

import java.util.Arrays;

public class A02 {

	public static void main(String[] args) {


		int arr1[] = {3,4,6};
		int arr2[] = {3,4,6};
		boolean a = false;
		
		for (int i = 0 ; i<arr1.length;i++) {
			
			if (arr1[i]!=arr2[i]) {
				a=false;
				break;
				}
			else {
				a=true;
			}
			
		}
		if(a)
			System.out.println("ayný");
		else
			System.out.println("Farklý");

	
	
	if (Arrays.equals(arr1, arr2))
		System.out.println("ayný");
	else 
		System.out.println("farklý");
	System.out.println(arr2);
	
	
	
	
	
	}
	
	
	
	
	
	

}
