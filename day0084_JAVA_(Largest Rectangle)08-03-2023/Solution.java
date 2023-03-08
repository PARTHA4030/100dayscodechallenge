import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
   public static long largestRectangle(List<Integer> h) {
    long maximum = 0;
     for(int i = 0; i < h.size(); i++) {
            long count = 1;
            Integer curr = h.get(i);
        for (int j = i + 1; j < h.size(); j++) {
                if (curr > h.get(j)) 
                    break;
                count++;
            }
        for (int j = i -1; j >= 0; j--) {  
                if (curr > h.get(j)) 
                    break;
                count++;
            }
            long sum = count * curr;
            if (sum > maximum) {
                maximum = sum;
            }
        }
    return maximum;
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        long result = Result.largestRectangle(h);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}