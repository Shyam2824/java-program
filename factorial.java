import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number :");
        int l= sc.nextInt();
        int f= 1;
        for(int i=1;i<=l;i++){
            f*=i;
        }
        System.out.println("Factorial : " + f);
    }
}
