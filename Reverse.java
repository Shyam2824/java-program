import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner c= new Scanner(System.in);
        System.out.println("Enter the number :");
        int num= c.nextInt();
        int a= num;
        int rem=0;
        int rev=0;
        while(num>0){
            rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
        }
        System.out.println("Given Digit :"+ a);
        System.out.println("Reverse Digit :"+ rev);
    }
}
