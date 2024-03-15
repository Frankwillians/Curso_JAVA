package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class dataHoraAula04 {
    public static void main(String[] args) {
        
        LocalDate d04 = LocalDate.parse("2024-03-15");
        LocalDateTime d05 = LocalDateTime.parse("2024-03-15T01:30:26");
        Instant d06 = Instant.parse("2024-03-15T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        LocalDate nextYearLocalDate = d04.plusYears(7);

        System.out.println("pastWeekLocalDate = " +pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = "+nextWeekLocalDate);
        System.out.println("nextYearsLocalDate = "+nextYearLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
        LocalDateTime nextYearLocalDateTime = d05.plusYears(7);

        System.out.println("pastWeekLocalDate = " +pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDate = "+nextWeekLocalDateTime);
        System.out.println("nextYearsLocalDate = "+nextYearLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7,ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        //Local date por não ter horas ele não funciona precisa de uma forma de especificar alguma hora nesse caso o .atStart
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(),d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime,d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);
        System.out.println("t1 = " + t1.toDays());
        System.out.println("t2 = " + t2.toDays());
        System.out.println("t3 = " + t3.toDays());
        System.out.println("t4 = " + t4.toDays());

    }
}
