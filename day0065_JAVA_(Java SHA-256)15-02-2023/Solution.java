import java.io.*;
import java.util.*;
import java.math.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] message = md.digest(s.getBytes());
            BigInteger n = new BigInteger(1,message);
            String hashtext = n.toString(16);
            while(hashtext.length()<64){
                hashtext ="0"+hashtext;
            }
            System.out.println(hashtext);
        }
        catch(NoSuchAlgorithmException e){
            System.out.println(e);
        }
        
    }
}
