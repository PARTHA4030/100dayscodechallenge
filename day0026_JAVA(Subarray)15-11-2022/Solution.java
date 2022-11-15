import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
            int[] array = new int[num];
        for(int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }        
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            int currentCount = 0;
            for(int j = i; j < array.length; j++) {
                currentCount += array[j];
                if(currentCount < 0) count++;
            }
        }
        System.out.println(count);
    }
}