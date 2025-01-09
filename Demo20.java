public class Demo20 {
    public static void main(String[] args) {
      
        long minutes = 5256000;

  
        int minutesInHour = 60;
        int hoursInDay = 24;
        int daysInYear = 365;

        long totalDays = minutes / (minutesInHour * hoursInDay);
        long years = totalDays / daysInYear;
        long remainingDays = totalDays % daysInYear;


        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days.");
    }
}