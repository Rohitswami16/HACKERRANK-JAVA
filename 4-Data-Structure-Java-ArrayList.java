import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList> arr = new ArrayList<ArrayList>();
        int n = sc.nextInt(); 
        
        for(int i=0; i<n; i++){
            int noOfElement = sc.nextInt();
            ArrayList<Integer> arr2 =  new ArrayList<Integer>();
            
            for(int j=0; j<noOfElement; j++){
                arr2.add(new Integer(sc.nextInt()));
            }
            
            arr.add(arr2);
        }
        sc.nextLine();
        int op = Integer.parseInt(sc.nextLine());
        for(int i=0; i<op; i++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            sc.nextLine();
            if(x<arr.size() && y<arr.get(x).size()){
                System.out.println(arr.get(x).get(y));
            }
            else
            {
                System.out.println("ERROR!");
            }
        }
    }
}
