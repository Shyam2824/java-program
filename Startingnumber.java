import java.util.Scanner;

public class Startingnumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the starting number :");
        int Start = sc.nextInt();
        System.out.println("Enter the end number :");
        int End  = sc.nextInt();
        while(Start<= End){
            System.out.println(Start);
            Start++;
        }
    }
    
}
