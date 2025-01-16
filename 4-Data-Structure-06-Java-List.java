import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String str = sc.next();
            if (str.equals("Insert")) {
                int ind = sc.nextInt();
                int v = sc.nextInt();
                list.add(ind, v);
            } else if (str.equals("Delete")) {
                int index = sc.nextInt();
                list.remove(index);
            }
        }
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
