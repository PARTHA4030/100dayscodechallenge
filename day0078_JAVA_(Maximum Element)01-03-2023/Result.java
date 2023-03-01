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

     public static List<Integer> getMax(List<String> operations) {
       
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        Integer max = 0;
        
        for (final String op : operations) {
            if (op.startsWith("1 ")) { 
                final Integer val = Integer.parseInt(op.substring(2));
                stack.push(val);
                max = Math.max(max, val);
            } else if (op.equals("2")) { 
                if (stack.pop().equals(max)) { 
                    max = stack.empty() ? 0 : Collections.max(stack);
                }
            } else {
                result.add(max);
            }
        }
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ops = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> res = Result.getMax(ops);

        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
