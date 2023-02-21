import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

static List<Integer> temp = new ArrayList<>();
    static int flag = 0; 
    public static List<Integer> path(Node curr, int v){
        
        if(curr.data == v){
            flag = 1;  
            temp.add(curr.data);
            return temp;
        }
        if(curr.left != null){
            path(curr.left, v);
            if(flag==1){              
                temp.add(curr.data);
                return temp;
            }
        }
        if(curr.right != null){
            path(curr.right, v);
            if(flag==1){
                temp.add(curr.data);
                return temp;
            }
        }
        return temp;
    }
    
    public static Node lca(Node root, int v1, int v2) {
        
        List<Integer> pathv1 = new ArrayList<>(path(root, v1));  

        flag = 0;       
        temp.clear();  
          List<Integer> pathv2 = new ArrayList<>(path(root, v2));  //find path for v2
        
        if(pathv1.size()==0){
            return new Node(pathv2.get(0));
        }
        if(pathv2.size()==0){
            return new Node(pathv1.get(0));
        }
        for(Integer i: pathv1){
           for(Integer j: pathv2){
               if(i==j){
                   return new Node(i);
               }
           }  
        }  
        
        return new Node(0); 
    }
	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        int v1 = scan.nextInt();
      	int v2 = scan.nextInt();
        scan.close();
        Node ans = lca(root,v1,v2);
        System.out.println(ans.data);
    }	
}