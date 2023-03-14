import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static void plusMinus(List<Integer> arr) {
      int n=arr.size();
    NumberFormat nf= NumberFormat.getInstance();
    nf.setMaximumFractionDigits(6);
    int pCount=0;
    int nCount=0;
    int zCount=0;
      for(int i:arr){
          if(i>0)
            pCount++;  
          if(i<0)
              nCount++;
          if(i==0)
              zCount++;
      }
      System.out.println(nf.format((double)pCount/n));
      System.out.println(nf.format((double)nCount/n));
      System.out.println(nf.format((double)zCount/n));
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
