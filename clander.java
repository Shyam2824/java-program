import java.util.Scanner;

public class clander {
    

    public static void main(String[] args) {
        //System.out.println("Enter the number");
        Scanner shyam = new Scanner(System.in);
        // int num1 = shyam.nextInt();
        
        System.out.println("Enter the number");
        
        int num = shyam.nextInt();
        String result;
        switch(num){
            case 1:
             result= "Sunday";
           break;
            case 2:
             result= "Monday";
             break;
            case 3:
             result= "Wednesday";
             break;
            case 4:
             result= "Thursday";
             break;
            case 5:
             result= "Friday";
             default :
             System.out.println("Error");
             return;
        }
        System.out.println(result);
    }
    
}


