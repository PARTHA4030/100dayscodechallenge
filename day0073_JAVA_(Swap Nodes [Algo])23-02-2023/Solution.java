import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Solution {
public static     int    left[]=new int[1025],
            right[]=new int[1025];
public static void swapNodes(int k){
    Deque<Integer> ds=new LinkedList<>();
    ds.addLast(1);
    int lvl=0;
    while(!ds.isEmpty()){
        lvl++;
        int count=ds.size();
       while (count-->0) {
           int e= ds.pollFirst();

           if (lvl % k == 0) {
               int temp = left[e];
               left[e] = right[e];
               right[e] = temp;
           }
           if(left[e]!=-1) ds.addLast(left[e]);
           if(right[e]!=-1) ds.addLast(right[e]);
       }
    }
}
public static void printInorder(int root){
    if(root==-1) return;
    printInorder(left[root]);
    System.out.print(root+" ");
    printInorder(right[root]);
}

    public static void main(String[] args) throws IOException {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  for(int i=1;i<=n;i++) {
      int a = sc.nextInt(), b = sc.nextInt();
      left[i]=a; right[i]=b;
  }
  int t=sc.nextInt();
  while(t-->0){
      swapNodes(sc.nextInt());
      printInorder(1);
      System.out.println();
  }
    }
}