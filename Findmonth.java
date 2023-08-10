import java.util.Scanner;

public class Findmonth {
    public static void main(String[] args) {
        System.out.println("Enter the months 1-12");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        if(num==1){
            System.out.println("January");
        }
        else if(num==2){
            System.out.println("February");
        }
        else if(num==3){
            System.out.println("March");
        }
        else if(num==4){
            System.out.println("April");
        }
        else if(num==5){
            System.out.println("May");
        }
        else if(num==6){
            System.out.println("June");
        }
        else if(num==7){
            System.out.println("july");
        }
        else if(num==8){
            System.out.println("August");
        }
        else if(num==9){
            System.out.println("September");
        }
        else if(num==10){
            System.out.println("October");
        }
        else if(num==11){
            System.out.println("November");
        }
        else if(num==12){
            System.out.println("December");
        }
        else
        System.out.println("Enter 1-12.....");
    }
}
