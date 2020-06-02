package section10;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Exercicio37 {

	public static void main(String[] args) {
		
		SimpleDateFormat varTempo01 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("1981-04-04T08:21:35Z"));
		
		System.out.println(varTempo01.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println(varTempo01.format(d));
		
		//imprimindo somente os minutos
		
		int minutos = cal.get(Calendar.MINUTE);
		
		System.out.println(minutos+" min");

		
		

	}

}
