package String_Handling;

interface Sayable1 {
    public String say(String name);
}

public class LamdaSingleParameter {
    public static void main(String args[]) {
        Sayable1 s1 = (name) -> {
            System.out.println("My name is "+name );
            return "s";
        };

        s1.say("Hello");

    }
}