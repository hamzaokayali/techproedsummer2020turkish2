package day20multidimensionalarrays;

import java.util.Arrays;

public class Mda01 {

	public static void main(String[] args) {


		
		int mda [][]= new int [3][2];
		
		mda [1][0] =7;
		mda [0][0] =10;
		mda [0][1] =23;
		mda [1][1] =12;
		mda [2][0] =11;
		mda [2][1] =55;

		
		System.out.println(Arrays.toString(mda));
		
		System.out.println(Arrays.deepToString(mda));
		
		System.out.println(Arrays.toString(mda[0]));
		System.out.println(Arrays.toString(mda[1]));
		System.out.println(Arrays.toString(mda[2]));
		System.out.println(mda[0][0]);
		System.out.println(mda[1][1]);
		System.out.println(mda[2][0]);
		
		
		char mdac [][] = { {'a','c','c' },{'d' },{ 'e','f'},{'g','h','i','k'} };
		System.out.println(Arrays.deepToString(mdac));
		
		System.out.println(mdac[0][0]+mdac[0][1]+mdac[0][2]);
int sum=0;
System.out.println(mdac.length);
System.out.println(mdac[0].length);
		for (int j=0;j<mdac.length-1;j++) {
			for (int i=0; i<mdac[j].length;i++) {
				
				sum+=mdac[j][i];
			}
		}
		System.out.println(sum);
	}

}
