import java.util.Arrays;
import java.util.Scanner;

public class KittysCalc {
    
    public static final long constant = 1000000007;
    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int queries = sc.nextInt();
    int[] parents = new int[n+1];
    long[] children = new long[n+1];
    boolean[] valuesSet = new boolean[n+1];
    long valuesSum = 0;
    long sum = 0;
    int a, b;
    for(int i = 0; i < n-1; i++) {
        a = sc.nextInt();
        b = sc.nextInt();
        if(a < b) {
            parents[b] = a;
        } else {
            parents[a] = b;
        }
    }
    parents[1] = 0;
        
    for(int i = 0; i < queries; i++) {
        int k = sc.nextInt();
        Arrays.fill(valuesSet, false);
        Arrays.fill(children, 0);
        valuesSum = 0;
        for(int j = 0; j < k; j++) {
            a = sc.nextInt();
            valuesSum += a;
            valuesSet[a] = true;
        }
        sum = 0;
        for (int j = n; j > 0; j--) {
        long c = children[j];
        if (valuesSet[j]) {
            c += j;
        }
        if (c > 0) {
        long x = ((c % constant) * ((valuesSum - c) % constant)) % constant;
        if (constant - sum < x) {
            sum -= constant;
        }
        sum += x;
            }
    children[parents[j]] += c;
            }
System.out.println(sum);
        }
        sc.close();
    }

}

