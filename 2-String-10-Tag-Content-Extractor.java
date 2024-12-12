import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        
        // Updated pattern to support tags with special characters or spaces
        Pattern pattern = Pattern.compile("<([^<>]+)>([^<]+)</\\1>");
        
        while (testCases > 0) {
            String line = in.nextLine();
            
            Matcher matcher = pattern.matcher(line);
            boolean found = false;
            
            while (matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }
            
            if (!found) {
                System.out.println("None");
            }
            
            testCases--;
        }
        
        in.close();
	}
}



