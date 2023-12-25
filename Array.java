import java.util.Scanner;

public class Array {
    public static void main(String arg []){
       System.out.println( "Enter the Element:");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<A.length;i++){
            int x=i;
            x= sc.nextInt();
            System.out.println(x);
        }
    }
}
