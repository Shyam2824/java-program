import java.util.Scanner;

public class sumArray {
    public static void main(String[] args) {
        System.out.println("Enter the array length:");
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int a[]= new int[n];
        int sum=0;
        for(int i=0;i<a.length;i++){
            System.out.println("Enter of a[] :" + i);
            a[i]= s.nextInt();
        }
        for (int i : a) {
            sum+=i;
            System.out.println("Sum Value of array : " + sum );
        }
    }
}
