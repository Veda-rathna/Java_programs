package Advanced_Java.Unit_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Parsing_dates {
    public static void main(String[] args) throws ParseException {
        String str = "08 / 18 / 23";
        SimpleDateFormat d = new SimpleDateFormat("MM / dd / yy");
        Calendar c = Calendar.getInstance();
        c.setTime(d.parse(str));
        System.out.println("Time parsed from String : " + c.getTime());
}
}
