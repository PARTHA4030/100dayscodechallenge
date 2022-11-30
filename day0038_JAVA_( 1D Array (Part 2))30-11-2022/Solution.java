import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) 
    {
       int i=0;
       LinkedList<String> ll = new LinkedList<String>();
       int[][] arr=new int[game.length][3];
    
      while(true)
    {
      if((i+leap)>=game.length || (i+1)>=game.length)
      {
        return true;
      }
      else if(arr[i][0]==0 && (i+leap)<game.length && game[i+leap]==0)
      {
        arr[i][0]=1;
        ll.add(i+"l");
        i=i+leap;
      }
      else if(arr[i][1]==0 && (i+1)<game.length && game[i+1]==0)
      {
        arr[i][0]=1;
        arr[i][1]=1;
        ll.add(i+"f");
        i=i+1;
      }
      else if(arr[i][2]==0 && (i-1)>=0 && game[i-1]==0)
      {
        arr[i][0]=1;
        arr[i][1]=1;
        arr[i][2]=1;
        ll.add(i+"b");
        i=i-1;
      }
      else{
        arr[i][0]=1;
        arr[i][1]=1;
        arr[i][2]=1;
        
        while(true){
          if(ll.size()!=0)
          {
            String s1=ll.getLast();
            String s2=s1.substring(0,s1.length()-1);
            char c=s1.charAt(s1.length()-1);
            
            if(c=='b')
            {
              ll.removeLast();
            }
            else if(c=='f' || c=='l')
            {
              i=Integer.parseInt(s2);
              ll.removeLast();
              break;
            }
          }
          else
          {
            return false;
          }
        }
      }
    } 
  }
      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
