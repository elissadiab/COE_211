public class AdvancedWeek {
    // Initializing variables
    private String day_1 = "Monday ";
    private String day_2 = "Tuesday ";
    private String day_3 = "Wednesday ";
    private String day_4 = "Thursday ";
    private String day_5 = "Friday ";
    private String day_6 = "Saturday ";
    private String day_7 = "Sunday ";
    private int day_1_index = 1;
    /**
     * Continue filling variables
     */

    // printing out the days
    public void printDays() {
        System.out.println("The advanced days of the week are: \n"+day_1_index+" "+day_1+",\n"+ ++day_1_index +" "
        +day_2 +",\n"+ ++day_1_index +" "+day_3 +",\n"+ ++day_1_index +" "+day_4 +",\n"
        + ++day_1_index +" "+day_5 +",\n"+ ++day_1_index +" "+day_6 +",\n"
        + ++day_1_index +" "+day_7+".");
    }
}