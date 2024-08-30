package Advanced_Java.Unit_2;

import java.util.*;

public class Date_class {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date(0L);
        Date d3 = new Date(0, 0, 0);

        boolean a = d1.after(d2);
        System.out.println(a);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
