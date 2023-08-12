import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the Starting number:");
        int s= read.nextInt();
        System.out.println("Enter the Ending number:");
        int e= read.nextInt();
        System.out.println("Enter the Table  number:");
        int t= read.nextInt();
        while(s<=e){
            System.out.println(s + "*" + t +"="+(s*t));
            s++;
        }
    }
    
}
