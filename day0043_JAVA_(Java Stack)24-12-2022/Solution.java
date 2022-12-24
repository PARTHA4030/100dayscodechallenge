import java.util.*;
class Solution
{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) 
        {
			String input=sc.next();
            char[] ch=input.toCharArray();
            String s="";
            Stack<Character> co= new Stack<>();
            Stack<Character> cc= new Stack<>();
          for(int i=0;i<ch.length;i++)
          {
            if(ch[i]=='{'||ch[i]=='('||ch[i]=='[')
            co.push(ch[i]);
            else if(ch[i]=='}'||ch[i]==')'||ch[i]==']')
            cc.push(ch[i]);
          }
            if(co.size()==cc.size()){
            if(input.length()==2&&input.charAt(0)=='}')
            System.out.println("false");
            else
            System.out.println("true");
        }
           else
           System.out.println("false");
        }
           sc.close();
    }
		
}
