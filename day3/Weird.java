import java.util.Scanner;
public class Weird
{
    public static void main(String[]args)
    {
        int n;
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        
        if(n%2!=0)
        {
            System.out.print("Weird");
        }
        else if(n%2==0 && n>=2 && n<=5)
        {
          System.out.print("Not Weird");  
        }
         else if(n%2==0 && n>=6 && n<=20)
        { 
          System.out.print("Weird");  
        }
         else if(n%2==0 && n>20)
        {
          System.out.print("Not Weird");  
        }
    }    
} 