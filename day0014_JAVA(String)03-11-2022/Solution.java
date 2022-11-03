import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(!s.trim().isEmpty())
        {
        String[] word=s.trim().split("[ !,?._'@]+");
        System.out.println(word.length);
        StringTokenizer stc=new StringTokenizer(s,"[ !,?._'@]+");
        while (stc.hasMoreTokens())
        {
            System.out.println(stc.nextToken());
        }
        }
       else
       {
        System.out.println("0");
       }
        scan.close();
    }
}
