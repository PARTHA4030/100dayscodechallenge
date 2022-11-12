import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
       
       char[] c= a.toLowerCase().toCharArray();
       char[] d= b.toLowerCase().toCharArray();
       java.util.Arrays.sort(c); 
       java.util.Arrays.sort(d);
       return new String(c).equals(new String(d))?true:false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}