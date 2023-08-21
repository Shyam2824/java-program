import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number;
        int a_max=Integer.MAX_VALUE; 
        int a_min=Integer.MIN_VALUE;
        char choice;
        do{
            System.out.println("Enter the number :");
             number = sc.nextInt();
            if(number > a_max){
                a_max=number;
            }
            if(number < a_min){
                a_min=number;
            }
            System.out.println("continue (y/n)....");
            choice= sc.next().charAt(0);
        }
        while(choice=='y'|| choice=='Y');
        System.out.println("Largest number "+ a_max); 
        System.out.println("Smallest number "+ a_min); 
    }
}
