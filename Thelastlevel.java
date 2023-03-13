import java.util.Scanner;

public class Thelastlevel {
    public static void main(String arg []) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        for(int i=0;i<x;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=a/3;
            if(a%3==0){
                System.out.println((a*b)+(d-1)*c);
            }else{
                System.out.println((a*b)+(c*d));
            }
        }
        
    }
}
