import java.util.Scanner;

public class ShowCurrenttime {
    public static void main(String args[]) {
        long totalmilisecond= System.currentTimeMillis();
        long totalSecond=totalmilisecond/1000;
        long totalCurrentSecond=(int)(totalSecond%60);
        long totalMinute=totalSecond/60;
        long totalCurrentMinute=totalMinute%60;
        long totalHour=totalMinute/60;
        long totalCurrentHours=totalHour%24;
        System.out.println("current time is : " + totalCurrentHours + ":" + totalCurrentMinute + ":" + totalCurrentSecond +"GMT");
    }
    
}
