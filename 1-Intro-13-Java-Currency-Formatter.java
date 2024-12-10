import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        
        // new Locale("en", "INDIA");
        
        
       String a = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        // String us = a.format(payment);
    
        NumberFormat b = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String i = b.format(payment);
        
        NumberFormat n2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String c = n2.format(payment);
        
        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String f = n3.format(payment);
        
        
        System.out.println("US: " + a);
        System.out.println("India: " + i);
        System.out.println("China: " + c);
        System.out.println("France: " + f);
    }
}
