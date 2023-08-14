import java.util.Scanner;

public class Sumofnumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int l= sc.nextInt();
        int sum =0;
        for(int i=0;i<=l;i++){
            sum= sum+i;
          System.out.println("Sum :"+ sum);  
        }
         System.out.println("Sum :"+ sum);
    }
}
