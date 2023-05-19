package by.pvt.dataformat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataFormat {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("G, q 'квартал', e, dd MMM yyyy, 'время:' hh:mm:ss a");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.format(dateTimeFormatter));

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("G, q 'квартал', e, dd MMM yyyy, 'время:' HH:mm:ss");
        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(localDateTime1.format(dateTimeFormatter1));
    }
}
