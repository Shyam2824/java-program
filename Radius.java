import java.util.Scanner;

public class Radius {
    public static void main(String arg []) {
        System.out.println("Enter the radius");
        Scanner sc= new Scanner(System.in);
        double radius= sc.nextDouble();
        double area= radius*radius*3.17;
        System.out.println("Area of circle:" + area);
    }
    
}
