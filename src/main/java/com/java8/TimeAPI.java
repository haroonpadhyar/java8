package com.java8;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.util.Date;

/**
 * Created by hpadhyar on 5/17/2017.
 */
public class TimeAPI {
  public static void main(String[] args) {
    Clock clock = Clock.systemDefaultZone();
    System.out.println("clock: "+clock);

    long millis = clock.millis();
    System.out.println("millis: "+millis);

    Instant instant = clock.instant();
    System.out.println("instant: "+instant);
    Date from = Date.from(instant);
    System.out.println("from: "+from);

    LocalTime localTime = LocalTime.now();
    System.out.println("localTime1: "+localTime);
    System.out.println("localTime1: "+localTime.withHour(20));

    LocalDate localDate = LocalDate.now();
    System.out.println("localDate1: "+localDate);
    System.out.println("localDate2: "+localDate.withMonth(1));
    System.out.println("localDate3: "+localDate.plusDays(1));
    System.out.println("localDate4: "+localDate.atStartOfDay());

    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println("localDateTime1: "+localDateTime);
    System.out.println("localDateTime2: "+localDateTime.plusYears(1));
    System.out.println("localDateTime3: "+localDateTime.withMonth(1));
    System.out.println("localDateTime4: "+localDateTime.plusDays(1));
    System.out.println("localDateTime5: "+localDateTime.plusHours(1));
    System.out.println("localDateTime6: "+localDateTime.toLocalDate());
    System.out.println("localDateTime7: "+localDateTime.plus(1,ChronoUnit.DECADES));
    System.out.println("localDateTime8: "+localDateTime.plus(Duration.ofDays(1)));

    localDateTime.atZone(ZoneId.systemDefault());
    Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

    System.out.println("Date: "+Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant()));

  }
}
