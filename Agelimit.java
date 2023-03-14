import java.util.Scanner;

public class Agelimit {
    public static void main(String arg[]) {
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for (int i=0;i<t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if(z>=x && z<y){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
    
}
