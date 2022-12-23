package data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Data {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:36");
		Instant d06 = Instant.parse("2022-07-20T05:30:36Z");
		Instant d07 = Instant.parse("2022-07-20T05:30:36-03:00");
		
		LocalDateTime d08 = LocalDateTime.parse("16/02/2005 17:00", fmt1);
		
		LocalDate d09 = LocalDate.of(2022, 7, 20);
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); //converte com base no fuso do pc
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));//fuso horário que voce escolehr
		
		System.out.println(d04.getDayOfMonth()); //pega qual eh o dia do mês
		System.out.println(d04.getMonthValue()); //mostra qual eh o mês
		System.out.println(d04.getYear()); //pega o ano
		System.out.println(d05.getHour()); //pega hora
		
		LocalDate pastWeek = d04.minusDays(7); //tira o tanto de dias
		LocalDate nextWeek = d04.plusDays(7); //adiciona o tanto de dias
		
		
		
	}
}
