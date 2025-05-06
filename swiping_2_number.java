import java.util.Scanner;

public class swiping_2_number {
    
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Value A : ");
        int a= sc.nextInt();

        System.out.println("Enter value B :");
        int b= sc.nextInt();

        int t;
        t=a;
        a=b;
        b=t;

        System.out.println("VAlue of A is : " + a);
        System.out.println("VAlue of B is : " + b);
    }
}
