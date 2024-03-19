package IO_operation;

import java.io.*;
public class Password {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.print("Enter the password:");
        char[] pwd = c.readPassword();
        if (pwd == null) {
            System.err.println("No password entered!");
            return;
            }
        String pass = new String(pwd);
        System.out.println("Your password is " + pass);
    }
}
