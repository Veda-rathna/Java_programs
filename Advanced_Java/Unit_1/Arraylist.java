package Advanced_Java.Unit_1;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> al = new ArrayList<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            al.add(a);
        }

        for (int q : al) {
            System.out.print(q + " ");
        }
    }
}
