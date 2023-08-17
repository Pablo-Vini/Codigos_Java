package Logica;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataHora {

	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println("LocalDate: " + localDate);
		
		LocalTime localTime= LocalTime.now();
		System.out.println("LocalTime: " + localTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("LocalTime: " + localDateTime);
		
		System.out.println("Dia: " + localDateTime.getDayOfMonth());
		System.out.println("Mês: " + localDateTime.getMonth() + "  ou  " + localDateTime.getMonthValue());
		System.out.println("Ano: " + localDateTime.getYear());
		System.out.println("Hora: " + localDateTime.getHour());
		System.out.println("Minuto: " + localDateTime.getMinute());
		System.out.println("Segundo: " + localDateTime.getSecond());
		
		
		DateTimeFormatter localDateFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("PT","br"));
		System.out.println("Data formatada BR: " + localDateTime.format(localDateFormatter));
	}

}






