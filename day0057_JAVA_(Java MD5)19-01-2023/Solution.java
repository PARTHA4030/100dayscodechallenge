import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;
import java.security.MessageDigest;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] mDigest = md.digest(s.getBytes());
            BigInteger bI = new BigInteger(1, mDigest);
            String hashText = bI.toString(16);
            while (hashText.length() < 32) {
                hashText = "0" + hashText;
            }
            System.out.println(hashText);   
        }catch(NoSuchAlgorithmException e){
            throw new IllegalArgumentException(e);
        }
    }
}