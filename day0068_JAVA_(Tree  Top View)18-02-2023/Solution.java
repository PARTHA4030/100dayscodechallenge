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
public static void topView(Node root) {
      LinkedList<Node> nextToVisitNode = new LinkedList<>();
      LinkedList<Integer> nextToVisitHd = new LinkedList<>();
      Map<Integer, Integer> topView = new TreeMap<>();
      
      nextToVisitNode.add(root);
      nextToVisitHd.add(0);
      
      while(!nextToVisitNode.isEmpty()) {
          Node current = nextToVisitNode.remove();
          int hd = nextToVisitHd.remove();
          if (!topView.containsKey(hd)) {
            topView.put(hd, current.data);
          }
        
          if (current.left != null) {
              nextToVisitNode.add(current.left);
              nextToVisitHd.add(hd - 1);
          }
          if (current.right != null) {
              nextToVisitNode.add(current.right);
              nextToVisitHd.add(hd + 1);
          }
      }
      
      for (Map.Entry<Integer,Integer> node: topView.entrySet()) {
          System.out.print(node.getValue() + " ");
      }
      
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
        scan.close();
        topView(root);
    }	
}