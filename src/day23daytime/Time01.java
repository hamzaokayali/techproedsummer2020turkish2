package day23daytime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Time01 {

	public static void main(String[] args) {
		
		LocalTime lt = LocalTime.now();
		
		System.out.println(lt); //22:21:07.828   828= nano saniye
		
	
		
		System.out.println(lt);
		
		System.out.println(lt.plusMinutes(7));
		
		System.out.println(lt.minusMinutes(5));
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm");
		
		System.out.println(dtf1.format(lt));
		
		System.out.println(LocalTime.now(ZoneId.of("Pacific/Rarotonga")));
	}

}
