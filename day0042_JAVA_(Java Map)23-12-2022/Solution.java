import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String []argh) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> hm = new HashMap<>();
        in.nextLine();
        for(int i=0; i<n; i++) {
            String name=in.nextLine();
            int phone=in.nextInt();
            hm.put(name, phone);
            in.nextLine();   
        }
        while(in.hasNext())
        {
            String s = in.nextLine();
            
            if(hm.containsKey(s)) 
            {
                System.out.println(s+"="+hm.get(s));
            } 
            else 
            {
                System.out.println("Not found");
            }
        }
    }
}