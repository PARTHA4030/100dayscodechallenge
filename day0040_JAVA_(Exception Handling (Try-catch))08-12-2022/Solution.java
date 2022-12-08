import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
         try(Scanner sc = new Scanner(System.in))
         {
            while(sc.hasNext())
            {
            int resultado;
            int x= sc.nextInt();
            int y = sc.nextInt();
            resultado = x/y;
            System.out.println(resultado);
            }
        } 
        catch (ArithmeticException e)
         {
            System.out.println(e);
         } 
        catch (InputMismatchException e)
         {
            System.out.println(e.getClass().getName());
        }
    }
}