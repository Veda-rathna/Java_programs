package Advanced_Java.Unit_3;

import java.util.*;
import java.util.stream.*;

@SuppressWarnings("unused")
class nthsmallest_stream{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int len = sc.nextInt();
        int[] arr = new int[len];
        
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        
        int n = sc.nextInt();
        
        int nthsmallest = Arrays.stream(arr)
                                .sorted()
                                .distinct()
                                .skip(n-1)
                                .findFirst()
                                .getAsInt();
        
        System.out.println("The "+n+"th smallest element is "+nthsmallest);

        sc.close();
    }
}