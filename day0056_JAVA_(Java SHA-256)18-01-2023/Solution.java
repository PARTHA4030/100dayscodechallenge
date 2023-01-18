import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;

public class Solution {
    private static String s;
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            s = br.readLine();
        }catch(Exception e){
            System.out.println(e);
        }
        
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] result = md.digest(s.getBytes(StandardCharsets.UTF_8));
            BigInteger number = new BigInteger(1, result);
            StringBuilder hexString = new StringBuilder(number.toString(16));
            while (hexString.length() < 64)
            {
                hexString.insert(0, '0');
            }
            System.out.println(hexString.toString());
 
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e);
        }
    }
}