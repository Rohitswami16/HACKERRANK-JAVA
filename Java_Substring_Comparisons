

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
         
       
        String inputString = s;
        int length = k;
        
        for(int i = 0;i<=inputString.length()-length;i++){
            String subString = inputString.substring(i,i+length);
            if(i == 0){
                smallest = subString;
            }
            if(subString.compareTo(largest)>0){
                largest = subString;
            }else if(subString.compareTo(smallest)<0)
                smallest = subString;
        }
       // System.out.println(smallest);
        // System.out.println(largest);  
         
         
        return smallest + "\n" + largest;
    }

