package Advanced_Java.Unit_2;

import java.text.SimpleDateFormat;
import java.util.*;
public class Date_formatter {
    public static void main(String args[]){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("E dd/MMMM/yyyy hh:mm:ss z");
        formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
        String d = formatter.format(date);
        System.out.println(d);
    }
}
