import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
         int min=0;
        int max=0;
        for(int i=0;i<s.length()-k+1;i++){
            if(s.substring(max).compareTo(s.substring(i,i+k))<0)
            {
                max=i;
            }
            if(s.substring(min).compareTo(s.substring(i,i+k))>0)
            {
                min=i;           
            }
        }
        smallest+=s.substring(min,min+k);
        largest+=s.substring(max,max+k);
                      
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}