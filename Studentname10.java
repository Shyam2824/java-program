import java.util.Scanner;

public class Studentname10 {
    public static void main(String[] args) {
        // find the greater number 

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number a : "); 
        int a = sc.nextInt();

        System.out.println("Enter the number b : ");
        int b= sc.nextInt();

        if(a>b){
            System.out.println("a is greater than b.");
        }
        else{
            System.out.println("b is greater than a.");
        }

        
        
    }
}
