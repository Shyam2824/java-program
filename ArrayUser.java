import java.util.Scanner;

import javax.swing.SpringLayout;

public class ArrayUser {
    public static void main(String arg []){
        System.out.println("Enter the value");
        Scanner sc=new Scanner(System.in);
        int A[]=new int[10];
        for(int i=0;i<A.length;i++){
           A[i]=sc.nextInt();
        }
        for (int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
    }
    
}
