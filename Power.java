import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base :");
        int b= sc.nextInt();
        System.out.println("Enter the power :");
        int p=sc.nextInt();
        int result=1;
        for(int i=1;i<=p;i++){
            result*=b;
        }
        System.out.println(result);
    }
}
