import java.util.Scanner;

public class average_Array {
    public static void main(String[] args) {
        System.out.println("Enter the length of Array : ");
        Scanner sc= new Scanner(System.in);
        int l= sc.nextInt();
        int a[]= new int[l];
        int sum=0;
        for(int i=0;i<a.length;i++){
            System.out.println("Array index " + i);
            a[i]= sc.nextInt();
        }
        for (int i : a) 
            sum+=i;
            double avg= sum/l;
            System.out.println("Sum of Array : " + sum);
            System.out.println("Average of Array : " + avg);
        
    }
}
