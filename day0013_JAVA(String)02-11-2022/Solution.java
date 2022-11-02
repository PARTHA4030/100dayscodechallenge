import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        if ((int)A.charAt(0)>(int)B.charAt(0))
        {
        System.out.println("Yes");
        }
        else
        {
         System.out.println("No");
        }       
     
String AUp = A.substring(0,1).toUpperCase() + A.substring(1);  
String BUp = B.substring(0,1).toUpperCase() + B.substring(1); 
System.out.println(AUp+" "+BUp);
    }
}
