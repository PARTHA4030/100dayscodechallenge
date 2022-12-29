   import java.util.*;
    public class test 
    {
       public static void main(String[] args) 
       {
         Scanner in = new Scanner(System.in);
         Deque<Integer> deque = new ArrayDeque<>();
         HashSet<Integer> hs = new HashSet<>();

         int n = in.nextInt();
         int m = in.nextInt();
         int max = Integer.MIN_VALUE;

         for (int i = 0; i < n; i++) 
         {
            int input = in.nextInt();
            deque.add(input);
            hs.add(input);

            if (deque.size() == m) 
            {
                if (hs.size() > max)
                max = hs.size();
                int first = deque.remove();
                if (!deque.contains(first)) 
                hs.remove(first);
            }
        }
              System.out.println(max);
    }
}

