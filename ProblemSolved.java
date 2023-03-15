import java.util.Scanner;

public class ProblemSolved {
    public static void main(String arg []){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int s= sc.nextInt();
        for(int i=0;i<s;i++){
            int p= sc.nextInt();
            int d=(p/100)+(p%100);
            if(d<=10){
                System.out.println(d);
            }else{
                System.out.println("-1");
            }
        }
    }
}
