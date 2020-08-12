package day23daytime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date01 {

	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		
		System.out.println(ld.plusDays(275));
		
		System.out.println(ld.plusMonths(3));
		
		System.out.println(ld.plusYears(3));
		
		System.out.println(ld.minusDays(34));
		
		System.out.println(ld.minusMonths(6));
		
		System.out.println(ld.minusYears(4));
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd_MMMM_yyyy");
		
		
		System.out.println(dtf.format(ld));
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM_d_yy");
		
		System.out.println(dtf2.format(ld));
		
		System.out.println(dtf2.format(ld.plusDays(15)));

	}

}
