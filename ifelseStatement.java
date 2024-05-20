import java.util.Scanner;

public class ifelseStatement {
    public static void main(String[] args) {
        System.out.println("enter rupees");
        Scanner deepak= new Scanner(System.in);
        int a= deepak.nextInt();
        // char b= deepak.next().charAt(a);
        if(a==400){
            System.out.println("Buy a t-shirt");
        }else if (a==300){
            System.out.println("go to party");
        } else if(a==600){
            System.out.println("go with girl friend");
        }
        else if (a==700){
            System.out.println("go to dinner");
        }
        else{
            System.out.println("go to home");
        }
    }
}
