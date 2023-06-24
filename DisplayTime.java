import java.util.Scanner;

public class DisplayTime {
    public static void main(String args []) {
        System.out.println("Enter the time :");
        Scanner sc =new Scanner(System.in);
        int sceonds = sc.nextInt();
        double minitue= sceonds/60;
        double remainingTime=sceonds%60;
        System.out.println("minutue"+ minitue );
        System.out.println( "The remaining time : " + remainingTime);
        
    }
}
