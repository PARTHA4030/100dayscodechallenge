import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int n = b.get(b.size()-1);
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i <= n/2; i++) {
            if (n%i==0) {
                result.add(i);
            }
        }
        result.add(n);
       
        for (int i = 0; i < b.size()-1; i++) {
            for (int j = 0; j < result.size(); j++) {
                if (b.get(i)%result.get(j)!=0) { 
                    result.remove(j); j--;
                }
            }
        }

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < result.size(); j++) {
                if (result.get(j)%a.get(i)!=0) { 
                    result.remove(j);j--;
                }
            }
        }
        return result.size();
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> brr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrTemp[i]);
            brr.add(brrItem);
        }

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
