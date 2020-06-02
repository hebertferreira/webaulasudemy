package section10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Exercicio36 {

	public static void main(String[] args) throws ParseException {
		/* DATE */
		
		SimpleDateFormat exemplo01 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat exemplo02 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat exemplo03 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		exemplo03.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date d1 = exemplo01.parse("30/05/1989");
		Date d2 = exemplo02.parse("19/10/1989 16:30:45");
		Date xNow = new Date();
		
		//ISO-8601 UTC
		Date d3 = Date.from(Instant.parse("1981-04-04T16:21:08Z"));
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println();
		System.out.println(exemplo01.format(d1));
		System.out.println(exemplo02.format(d2));	
		System.out.println(exemplo02.format(xNow));	
		System.out.println("UTC: "+exemplo03.format(d3));
		
		
		
	}

}
