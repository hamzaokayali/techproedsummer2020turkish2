package day12forvewhileloop;

public class WhileLoop01 {

	public static void main(String[] args) {

int i=1;
		while (i<=10) {
		System.out.println(i);
		i++;
			
		}
		i=0;
		while (i<=10) {
			
			System.out.println(10-i);
			i++;
			
		}
		i=1;
		while (i<=100) {
			System.out.println(i*2);
			i++;
			
			
		}
		char c ='a';
		while (c<'j') {
		System.out.println(c);
		c++;
			
		}
		
		char c1='A';
		int j=1;
		int sum=0;
		while ( j<=5) {
			sum =sum+c1;
			c1++;
			j++;
			
		}
		
		System.out.println(sum);
	}

}
