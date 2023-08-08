import java.util.Scanner;

public class FindTheNumber {
    public static void main(String[] args) {
        //System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the num1" );
        int num1 = sc.nextInt();
        
        System.out.println("Enter the num2" );
        int num2 = sc.nextInt();
        System.out.println("Enter the num3" );
        int num3 = sc.nextInt();
        if(num1>num2 && num1>num3){
        System.out.println("greater than num2");
        }
        else if(num1==num2 && num2==num3)
        System.out.println("ALL are equal");
        else
        System.out.println("num1 is smaller than num2");
    }
}
