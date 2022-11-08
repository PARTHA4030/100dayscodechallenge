import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
private static short B,H;
private static boolean flag;
private static Scanner sc =new Scanner(System.in);
static
{
    B = sc.nextShort();
    H = sc.nextShort();
    try
    {
        if ( B<=0 || H<=0) 
        throw new Exception("Breadth and height must be positive");
        flag=true;
    }
    catch (Exception e)
    {
        flag=false;
        System.out.println(e.toString());
    }
}   
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}
}
