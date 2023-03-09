import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int sum_values(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        System.out.println(sum_values(a,b));
        
    }
}