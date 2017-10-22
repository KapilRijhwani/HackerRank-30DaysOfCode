import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n_dup, rem, max, count;
        count = max = 0;
        n_dup = n;
        
       while(n_dup > 0){
           rem = n_dup % 2;
           n_dup /= 2;
           if(rem == 1){
               count++;
               if(count > max){
                   max = count;
               }
           }
           else{
               count = 0;
           }
       }
        System.out.println(max);
    }
}
