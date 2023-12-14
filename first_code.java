import java.util.Scanner;

public class first_code {
    public static void main(String[] args) {
        System.out.println("Enter some point");
        int a, b, c, d;        
        
        Scanner sc = new Scanner(System.in);
         a= sc.nextInt();
         c= sc.nextInt();
         b= sc.nextInt();
         d= sc.nextInt();
         int result = a+b/c*d;
         System.out.println(result);

    }
}
