import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        //Write your code here
        HashSet hs = new HashSet<>();
        for(int i=0; i<t; i++){
            String name = pair_left[i]+" "+pair_right[i];
            hs.add(name);
            System.out.println(hs.size());
        }
    }
}
