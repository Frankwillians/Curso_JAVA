package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class dataHoraAula05 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdtf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdtf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdtf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        sdtf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date y1 = sdtf1.parse("15/03/2024");
        Date y2 = sdtf2.parse("15/03/2024 01:30:48");
        Date y3 = Date.from(Instant.parse("2018-06-25t15:42:07Z"));
        Date x1 = new Date();  //imprimir o instante 
        Date x2 = new Date(System.currentTimeMillis());  //imprimir o instante 
        Date x3 = new Date(0L);   
        Date x4 = new Date(1000L * 60L * 60L * 5L);  
        System.out.println("y1 = " + sdtf2.format(y1)); 
        System.out.println("y2 = " + y2);
        System.out.println("y3 = " + sdtf3.format(y3));
        System.out.println();
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        System.out.println("x3 = " + x3);
        System.out.println("x4 = " + x4);
    }
}
