package String_buffer_class;

public class String_buffer_class {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("January 31st dhane pa new year");
        str.append(", If I'm not wrong scientifically");
        System.out.println(str);
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf("dhane"));
        str.replace(0,7,"Febuary");
        System.out.println(str);
        System.out.println(str.substring(0,7));
    }
}
