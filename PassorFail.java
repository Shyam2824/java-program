import java.util.Scanner;

public class PassorFail {
    public static void main(String arg[]){
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0; i<t;i++){
            int x=sc.nextInt();
            int n=sc.nextInt();
            int p=sc.nextInt();
            int s= x*3+(-1)*(n-x);
            if(s>=p){
                System.out.println("Pass");
            }else{
                System.out.println("Fail");
            }
        }
    }
}
