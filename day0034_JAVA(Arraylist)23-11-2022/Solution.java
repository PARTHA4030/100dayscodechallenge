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
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int n = sc.nextInt();
        int m = 0;
        for (int i = 0; i < n; i++) 
        {
            m = sc.nextInt();
            for (int j = 0; j < m; j++) 
            {
                temp.add(sc.nextInt());
            }
            arrayList.add((ArrayList<Integer>) temp.clone());
            temp.clear();
        }
            int q = sc.nextInt();
            for (int i = 0; i < q; i++) 
            {
              try 
               {
                 System.out.println(arrayList.get(sc.nextInt() - 1).get(sc.nextInt() - 1));
               } 
               catch (Exception e) 
               {
                System.out.println("ERROR!");
               }
            }
    }           
}
