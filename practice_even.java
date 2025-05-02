import java.util.Scanner;

public class practice_even {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n= read.nextInt();
        if(n%2==0){
            System.out.println("This is even number.");
        }
        else{
            System.out.println("This is odd number. ");
        }
    }
}
