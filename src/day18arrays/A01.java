package day18arrays;

import java.util.Arrays;

public class A01 {

	public static void main(String[] args) {


		int arr1[] = new int [3];
		
		//bir arrayi konsola yazdýrmak için Arrays.toString kullanýrýz .
		
			System.out.println(Arrays.toString(arr1));
		
		//bir arraya eleman atama
			
			arr1[2] = 22;
			
			System.out.println(Arrays.toString(arr1));
			
			arr1[1] = 9;
			
			System.out.println(Arrays.toString(arr1));
			
			arr1[0] = 7;
			
			System.out.println(Arrays.toString(arr1));
			
			int arr2 [] = {8,10,12,144,};
			
			System.out.println(Arrays.toString(arr2));
			
			for (int j = 0; j<=arr2.length-1 ; j++) {
				System.out.println(arr2[j]);
			int k =0;	
			while (k<=arr2.length-1) {
				if (k%2==0) {
				System.out.print(arr2[k]+" ");
				
				}
				k=k+1;
				
			}
			}
			System.out.println(arr2[arr2.length-1]);
			
	}

}
