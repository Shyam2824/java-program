import java.util.Scanner;

public class Checknumber{
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        int num ;
        Scanner sc= new Scanner(System.in);
        num= sc.nextInt();
        if(num>0){
            System.out.println("positive");
        }else if(num<0)
        System.out.println("negative");
        else
        System.out.println("Zero");
    }
}