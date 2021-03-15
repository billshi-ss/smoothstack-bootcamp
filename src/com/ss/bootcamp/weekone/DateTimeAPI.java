/**
 * 
 */
package com.ss.bootcamp.weekone;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Code snippets using Java 8 date and time features
 * Week one day five (3/12/21) assignment
 * @author Bill Shi
 *
 */
public class DateTimeAPI {

	public static void main(String[] args) {
		
		/* 
		 * 1. Which class would you use to store your birthday in years, 
		 * months, days, seconds, and nanoseconds?
		 * 
		 * The LocalDateTime class.
		 * 
		 */
		
		/*
		 * 2. Given a random date, how would you find the date of the previous Thursday?
		 */
		
		 LocalDateTime randTime = LocalDateTime.now();
		 do {
		 	randTime = randTime.minusDays(1);
		 } while (randTime.getDayOfWeek() != DayOfWeek.THURSDAY);
		 System.out.printf("Date of the previous Thursday: %s\n", randTime.toString());
		 
		 /*
		  * 3. What is the difference between a ZoneId and a ZoneOffset?
		  * 
		  * ZoneId store the name to identify a time zone by and the rule to convert
		  * between a Instant class and a LocalDateTimeClass.
		  * ZoneOffset store the number of hours a time zone is offset from GMT time
		  * 
		  */
		 
		 /*
		  * 4.
		  * How would you convert an Instant to a ZonedDateTime? 
		  * How would you convert a ZonedDateTime to an Instant?
		  * 
		  */
		 
		 Instant i = Instant.now();
		 ZonedDateTime toZdt = i.atZone(ZoneId.of("America/New_York"));
		 
		 ZonedDateTime zdt = ZonedDateTime.now();
		 Instant toI = zdt.toInstant();
		 
		 /*
		  * 5. Write an example that, for a given year, reports the length of each month 
		  * within that year.
		  */
		 
		 Year year = Year.of(2021);
		 for (Month m : Month.values()) {
			 YearMonth ym = year.atMonth(m);
			 System.out.printf("There is %d number of days in %s\n", ym.lengthOfMonth(), ym.toString());
		 }
		 
		 /*
		  * 6. Write an example that, for a given month of the current year, lists all of
		  * the Mondays in that month.
		  */
		 
		 YearMonth givenMonth = YearMonth.of(Year.now().getValue(), 3);
		 for (int dayNumber = 1; dayNumber <= givenMonth.lengthOfMonth(); dayNumber++) {
			 LocalDate date = givenMonth.atDay(dayNumber);
			 if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
				 System.out.println(date);
			 }
		 }

		 /*
		  * 7. Write an example that tests whether a given date occurs on Friday the 13th.
		  */
		 
		 LocalDate givenDate = LocalDate.now();
		 if (givenDate.getDayOfWeek() == DayOfWeek.FRIDAY && givenDate.getDayOfMonth() == 13) {
			 System.out.println("Today is Friday the thirteenth");
		 }
		 
	}
	
}
