import java.util.Scanner;

public class NumberMirror {
    public static void main(String arg []){
        System.out.println("Enter the number x");
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0; i<t;i++){
            int x=sc.nextInt();
            System.out.println(x);
        }
    }
}
