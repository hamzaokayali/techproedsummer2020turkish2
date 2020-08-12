package day20multidimensionalarrays;

import java.util.Arrays;

public class Mda02 {

	public static void main(String[] args) {


		int mdai [][]= {{1,2},{3},{4,5,6}};
		
		String str = "Cok calis mutevazi ol";
		String arr [] = str.split("C");
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(mdai[0][0]+mdai[0][1]+mdai[1][0]+mdai[2][0]+mdai[2][1]+mdai[2][2]);
		
		
		
		int sum=0;
		for (int j=0;j<mdai.length;j++) {
			for (int i=0; i<mdai[j].length;i++) {
				
				sum+=mdai[j][i];
			}
		}
		System.out.println(sum);

	}

}
