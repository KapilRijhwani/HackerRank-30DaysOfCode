import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int swap_count,swap_current;
        swap_count = swap_current = 0;
        
        for(int i = 0;i < n;i++){
            swap_current = 0;
            for(int j = i+1;j < n ;j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    swap_count++;
                    swap_current++;
                }
            }
            if(swap_current == 0)
                break;
        }
        
        System.out.printf("Array is sorted in %d swaps.\nFirst Element: %d\nLast Element: %d",
                         swap_count,a[0],a[n-1]);
        
    }
}
