import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter year : ");

        int n= read.nextInt();

        if(n%4 == 0){

            if(n%100 == 0){

                if(n%400 == 0){
                    System.out.println("This is leap year.");
                }
                else{
                    System.out.println("This is not leap year.");
                }

            }
            else{
                System.out.println("This is leap year.");
            }
        }
        else{
            System.out.println("This is not leap year.");
        }
    }
}
