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
    public static String isBalanced(String s) {
    Stack<Character> bracketStack = new Stack<>();
    HashMap setOfBrackets = new HashMap<Character, Character>();
    setOfBrackets.put('(', ')');
    setOfBrackets.put('{', '}');
    setOfBrackets.put('[', ']');
    for(int i = 0; i < s.length(); i++) {
        if(setOfBrackets.get(s.charAt(i)) != null){
           bracketStack.push(s.charAt(i)); 
        } else {
            if(bracketStack.isEmpty()) return "NO";
            if(setOfBrackets.get(bracketStack.pop()).equals(s.charAt(i))) {
                continue;
            } else {
                return "NO";
            }
        }
        
    } 
    
     return bracketStack.isEmpty() ? "YES" : "NO";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}