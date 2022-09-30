import java.util.Scanner;
class SumNatural
{
 public static void main(String args[])
 {
   int n,sum=0;
   System.out.println("Enter The No of Term");
   Scanner r=new Scanner(System.in);
   n=r.nextInt();
   for(int i=1;i<=n;i++)
   {
     sum=sum+i;
   } 
    System.out.print("Addition="+sum); 
 }
}