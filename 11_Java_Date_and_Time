

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        
        Calendar c = Calendar.getInstance();
        
        c.set(year, month-1 , day);
        int dayofnumber = c.get(Calendar.DAY_OF_WEEK); 
        
        String[] days = {"SUNDAY", 
        "MONDAY", 
        "TUESDAY", 
        "WEDNESDAY", 
        "THURSDAY",
         "FRIDAY", 
         "SATURDAY"};
        
         return days[dayofnumber - 1];
    }

}

