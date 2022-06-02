package com.ait.dateandtime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Example2 {

	public static void main(String[] args) {
		ZonedDateTime currentTime = ZonedDateTime.now();
        System.out.println(currentTime);
        ZonedDateTime currentTimeinparis =
        		ZonedDateTime.now(ZoneId.of("Europe/Paris"));
System.out.println(currentTimeinparis);     




	}

}
