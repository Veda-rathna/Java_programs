package Advanced_Java.Unit_2;

import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateExample {
    public static void main(String[] args) {
        // Using Date class
        Date date = new Date();
        System.out.println("Current Date: " + date);

        // Using LocalDate class
        LocalDate localDate = LocalDate.now();
        System.out.println("Current Local Date: " + localDate);

        // Using LocalDateTime class
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Formatted Local DateTime: " + localDateTime.format(formatter));
    }
}
