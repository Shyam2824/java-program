import java.util.Scanner;

public class Checkalphebtic {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        //System.out.println("Enter the value :");
       
       int value = sc.nextInt();
        char chr=sc.next().charAt(0);
        if(chr>='a' && chr<='z' || chr>='A' && chr<='Z' ){
            System.out.println("This is Alphebitic");
        } else if(value >=0 && value<=9) {
            System.out.println("This is numeral value");
        }
        else
        System.out.println("Error");
    }
}
