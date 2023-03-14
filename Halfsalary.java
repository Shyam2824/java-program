import java.util.Scanner;

public class Halfsalary {
    public static void main(String arg []){
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int a=(int) (Math.pow(2, x));
            int b=(int) (Math.pow(2, y));
            System.out.println(b/y);
        }
    }
}
