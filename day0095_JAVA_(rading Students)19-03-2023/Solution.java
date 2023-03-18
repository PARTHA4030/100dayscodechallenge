import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
class Result {
    public static List<Integer> gradingStudents(List<Integer> grades) {
      for(int i=0;i<grades.size();i++){
        if((int)Math.floor(Math.abs((grades.get(i)/5)*5)+5)-grades.get(i)<3 && grades.get(i)>=38){
            grades.set(i, (int)Math.floor(Math.abs((grades.get(i)/5)*5)+5));
        }
        else{
            continue;
        }
    }
    return grades;
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> grades = new ArrayList<>();
        for (int i = 0; i < gradesCount; i++) {
            int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
            grades.add(gradesItem);
        }
        List<Integer> result = Result.gradingStudents(grades);
        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));
            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
