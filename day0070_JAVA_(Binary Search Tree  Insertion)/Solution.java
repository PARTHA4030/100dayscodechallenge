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
  
  	public static void preOrder( Node root ) {
      
    	if( root == null)
        	return;
      
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
     
    }
public static Node insert(Node root,int data) {
        if(root == null) return new Node(data);
        Node n = root;
        while(true) {
            if(n.data >=data) {
                if(n.left==null) {
                    n.left = new Node(data);
                    break;
                }
                else n = n.left;
            }
            else {
                if(n.right==null) {
                    n.right = new Node(data);
                    break;
                }
                else n = n.right;
            }
        }
        return root;
    }
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
      	preOrder(root);
    }
}