package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dataHoraAula01 {
    public static void main(String[] args) {
        
        //date formater
        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        
        
        //instanciação a partir do agora 
        
        //data
        LocalDate d01 = LocalDate.now();
        
        //horario
        LocalDateTime d02 = LocalDateTime.now();
   
        //usando instant data/hora global
        Instant d03 = Instant.now();
        
        //ISO 8601
        LocalDate d04 = LocalDate.parse("2024-03-15");
        LocalDateTime d05 = LocalDateTime.parse("2024-03-15T01:30:26");
        Instant d06 = Instant.parse("2024-03-15T01:30:26Z");
        Instant d07 = Instant.parse("2024-03-15T01:30:26-03:00");
        LocalDate d08 = LocalDate.parse("15/03/2024",fmt1);
        LocalDateTime d09 = LocalDateTime.parse("14/03/2024 10:30", fmt2); 
        LocalDate d10 = LocalDate.of(2024, 07, 20);
        LocalDateTime d11 =LocalDateTime.of(2024, 12, 31, 05, 30);





        System.out.println("D01 = " + d01.toString());
        System.out.println("D02 = " + d02.toString());
        System.out.println("D03 = " + d03.toString());
        System.out.println("D04 = " + d04.toString());
        System.out.println("D05 = " + d05.toString());
        System.out.println("D06 = " + d06.toString());
        System.out.println("D07 = " + d07.toString());
        System.out.println("D08 = " + d08.toString());
        System.out.println("D09 = " + d09.toString());
        System.out.println("D10 = " + d10.toString());
        System.out.println("D11 = " + d11.toString());
        
        


    }
}
