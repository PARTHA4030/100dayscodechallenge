import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{

      public static void main(String[] args) 
    {
          Scanner sc = new Scanner(System.in);
          List<Integer> list = new ArrayList<>();
          int n = sc.nextInt();
          for (int i = 0; i < n ; i++){
            list.add(sc.nextInt());
        }
          int q = sc.nextInt();
          for(int j = 0; j < q; j++)
        {
             sc.nextLine();
             String comment = sc.nextLine();
             int x = sc.nextInt();
               if (comment.equals("Insert") )
            {
                list.add(x,sc.nextInt());
            }
               if (comment.equals("Delete") )
            {
                list.remove(x);
            }
        }
            for(int i : list)
        {
            
           System.out.printf(i + " ");
        }
        
    }
}
   