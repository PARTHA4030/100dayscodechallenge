import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
		 	String regexPattern = "<(.+)>([\\w]+[^<]*)</(\\1)>";
            Pattern p = Pattern.compile(regexPattern);
            Matcher m = p.matcher(line);
            int count = 0;
            while(m.find())
            {
                System.out.println(m.group(2)); 
                count++;
            }
            if(count == 0){
                System.out.println("None");
            }
			testCases--;
		}
	}
}

