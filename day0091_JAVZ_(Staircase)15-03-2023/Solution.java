import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static void staircase(int n) {
     int spaces=n-1;
int boxes=1;

for(int i=0;i<n;i++){
    for(int j = 1; j<=spaces;j++){
        System.out.print(" ");
    }
    for(int j = 1; j<=boxes;j++){
        System.out.print("#");
    }
    System.out.print("\n");
    spaces--;
    boxes++;
}
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
