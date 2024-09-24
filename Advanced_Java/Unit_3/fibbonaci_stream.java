package Advanced_Java.Unit_3;

import java.util.*;
import java.util.stream.*;

class fibbonaci_stream{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        List<Integer> series = Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
                                     .limit(n)
                                     .map(fib -> fib[0])
                                     .collect(Collectors.toList());
        
        System.out.println(series);
        sc.close();
    }
}
