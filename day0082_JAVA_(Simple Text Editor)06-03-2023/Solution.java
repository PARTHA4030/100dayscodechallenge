import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();
        Stack<String> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();
        scanner.nextLine();
        for(int i=0;i<queries;i++){
            String query = scanner.nextLine();
            int operation = Integer.parseInt(query.split(" ")[0]);
            switch(operation){
                case 1: //append
                    stack.push(builder.toString());
                    builder.append(query.split(" ")[1]);
                    break;
                case 2: //delete last K chars
                    stack.push(builder.toString());
                    builder.delete(builder.length()-Integer.parseInt(query.split(" ")[1]), builder.length());
                    break;
                case 3: //print kth character
                    System.out.println(builder.charAt(Integer.parseInt(query.split(" ")[1])-1));
                    break;
                case 4: //undo
                    builder = new StringBuilder(stack.pop());
                    break;
            }
        }
        scanner.close();
    }
}