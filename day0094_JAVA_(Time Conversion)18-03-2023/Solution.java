import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
class Result {
    public static String timeConversion(String s) {
       int hour = 0;
    String result = "";
    String lastTimeStr = "";
    if(s != "") {
        hour = Integer.parseInt(s.substring(0, s.indexOf(":")));
        lastTimeStr = s.substring(s.indexOf(":") + 1);
    }
    if (hour >= 0 && hour <= 12) {
        if(s.indexOf("AM") != -1 && hour == 12){
            result = "00:" + lastTimeStr;
        }else if (s.indexOf("PM") != -1 && hour < 12){
            result = Integer.toString((hour + 12)) + ":" + lastTimeStr;
        }else{
            result = Integer.toString(hour) + ":" + lastTimeStr;
            if(hour < 12){
              result = "0" + result;  
            }
        }
        result = result.substring(0, result.length() - 2);
    }
    return result;
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String s = bufferedReader.readLine();
        String result = Result.timeConversion(s);
        bufferedWriter.write(result);
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
