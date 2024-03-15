package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class dataHoraAula02 {
    public static void main(String[] args) {
        
        //date formater
        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        //objeto de formatação considerando o fuso horario do sistema local em que se esta utilizando
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;


        LocalDate d04 = LocalDate.parse("2024-03-15");
        LocalDateTime d05 = LocalDateTime.parse("2024-03-15T01:30:26");
        
        
         //instant não tem .format pq não esta em uma data local não se pode formatar sem saber qual o fuso-horario
        Instant d06 = Instant.parse("2024-03-15T01:30:26Z");
        //sem formatação
        System.out.println("d04 = " + d04);
        //formatado d04
        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
        //formatado d05
        System.out.println("d05 = " + d05.format(fmt1));
        System.out.println("d05 = " + d05.format(fmt2));
        System.out.println("d05 = " + d05.format(fmt4));
        
        //formatando d06
        System.out.println("d06 = " + fmt3.format(d06));
        System.out.println("d06 = " + fmt5.format(d06));
    }
}
