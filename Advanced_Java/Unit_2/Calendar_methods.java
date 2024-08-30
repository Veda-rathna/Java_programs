package Advanced_Java.Unit_2;

import java.util.Calendar;

public class Calendar_methods {
    public static void main(String[] args){

        Calendar calendar= Calendar.getInstance();
        System.out.println("Current Time: "+ calendar.getTime());
        System.out.println("Current Calendar's Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Current Calendar's Day: " + calendar.get(Calendar.DATE));
        System.out.println("Current MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("Current SECOND: " + calendar.get(Calendar.SECOND));

        int max = calendar.getMaximum(Calendar.WEEK_OF_MONTH);
        System.out.println("Maximum week of month: " + max);

        calendar.add(Calendar.MONTH,1);
        calendar.set(Calendar.YEAR, 2039);

        System.out.println("Current Time now: "+ calendar.getTime());
    }
}

