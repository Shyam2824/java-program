import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner sc= new Scanner(System.in);
        float num = sc.nextFloat();
        if(num%5==0){
            System.out.println("yes it is doivisible by 5");
        }else if (num %11==0)
        System.out.println("yes it is divisible by 11");
        else
        System.out.println("error");
    }
    
}
