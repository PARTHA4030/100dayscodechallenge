import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static void miniMaxSum(List<Integer> arr) {
       Collections.sort(arr);
        long minsum = 0, maxsum = 0;
        for(int i=0;i<4;i++) {
            minsum += arr.get(i);
        }
        for(int i=arr.size()-1;i>=arr.size()-4;i--) {
            maxsum += arr.get(i);
        }
        System.out.println(minsum+" "+maxsum);
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }
        Result.miniMaxSum(arr);
        bufferedReader.close();
    }
}