import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger(); 
        BigInteger b = sc.nextBigInteger();
        
        BigInteger res1 = a.add(b);
        BigInteger res2 = a.multiply(b);
        System.out.println(res1);
        System.out.println(res2);
    }
}
