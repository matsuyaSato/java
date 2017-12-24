package java_date;

import java.util.Date;
import java.time.*;
import java.time.format.*;

public class Main {
	public static void main(String[] args){
		Instant i1 = Instant.now();
		System.out.println(i1);
		
		ZonedDateTime z1 = ZonedDateTime.now();
		ZonedDateTime z2 = ZonedDateTime.of(2014, 1,2,3,4,5,6,ZoneId.of("Asia/Tokyo"));
		
		System.out.println(z1);
		
		LocalDateTime l1 = LocalDateTime.now();
		System.out.println(l1);
		LocalDateTime l2 = LocalDateTime.of(2014, 1,1,9,5,0,0);
		System.out.println(l2);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		LocalDate l3 = LocalDate.now();
		System.out.println(l3.format(f));
		LocalDate d1 = LocalDate.of(2012, 1, 3);
		LocalDate d2 = LocalDate.of(2012, 1, 9);
		Period p1 =  Period.ofDays(3);
		Period p2 = Period.between(d1, d2);
		System.out.println(p2);
	}
}
