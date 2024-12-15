//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> phoneBook = new HashMap<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();      
            int phone = Integer.parseInt(sc.nextLine()); 
            phoneBook.put(name, phone);          
        }
        
        while(sc.hasNextLine()){
            String name1 = sc.nextLine();
            
            if(!(phoneBook.containsKey(name1))){
                System.out.println("Not found");
            }else{
                System.out.println( name1+"="+phoneBook.get(name1));
            }
        }
    }
}



