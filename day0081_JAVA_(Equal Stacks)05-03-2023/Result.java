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
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int cap1 = 0;
        int cap2 = 0;
        int cap3 = 0;
        
        for (int i : h1) {
            cap1 += i;
        }
    
        for (int i : h2) {
            cap2 += i;
        }
        
        for (int i : h3) {
            cap3 += i;
        }
        int count = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        while ((cap1 == cap2 && cap2 == cap3) == false) {
            int min = Math.min(cap1, Math.min(cap2, cap3));
            
            if (cap1 > min && i < h1.size()) {
                cap1 -= h1.get(i);
                i++;
            }
            
            if (cap2 > min && j < h2.size()) {
                cap2 -= h2.get(j);
                j++;
            }
            
            if (cap3 > min && k < h3.size()) {
                cap3 -= h3.get(k);
                k++;
            }
        }
        
        return cap1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n1 = Integer.parseInt(firstMultipleInput[0]);

        int n2 = Integer.parseInt(firstMultipleInput[1]);

        int n3 = Integer.parseInt(firstMultipleInput[2]);

        List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> h3 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
