package deneme;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		int num = scan.nextInt();
		for(int i = 1; i<=num; i++ ) {
			if(num%i==0) {
				System.out.print(i+" ");
			}


	}
		System.out.println();
		int j = 1;
		while(j<=num) {
			if(num%j==0) {
				System.out.print(j+" ");
			}
			j++;
		}


}
}