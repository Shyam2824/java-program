import java.util.Scanner;

public class Studentname10 {
    public static void main(String[] args) {
        // find the greater number 

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number a : "); 
        int a = sc.nextInt();

        System.out.println("Enter the number b : ");
        int b= sc.nextInt();

        System.out.println("Enter the number c : ");
        int c= sc.nextInt();

        if(a>b && a>c){
            System.out.println("a is greater than b and c.");
        }
        else if (b>a && b>c){
            System.out.println("b is greater than a and c.");
        } 
        else{
            System.out.println("c is greater than a and b.");
        }

        
        
    }
}
