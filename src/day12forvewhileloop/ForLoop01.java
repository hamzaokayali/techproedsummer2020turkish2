package day12forvewhileloop;

public class ForLoop01 {

	public static void main(String[] args) {
int sum=0;

		for (int i=1 ; i<=30 ; i++) {
			
		sum=sum+i;	
					
		}
		
		System.out.println(sum);
		int sum1=1;
		for (int i =1 ; i<=10 ; i++ ) {
			sum1=i*sum1;
			
		}
		System.out.println(sum1);
		int sum2 =0;
		for (int i=101 ; i<200 ;i++) {
			
			if (i%3==0) {
				sum2=sum2+i;
			}
			
		}
		System.out.println(sum2);
	}

}
