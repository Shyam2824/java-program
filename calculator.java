import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner shyam = new Scanner(System.in);
        int num1 = shyam.nextInt();
        int num2 = shyam.nextInt();
        int num3 = shyam.nextInt();
        System.out.println("Enter the operator");
        
        String operator= shyam.next();
        double result = 0;
        switch(operator.charAt(0)){
            case'+':
            result= num1+num2+num3;
           break;
            case '-':
             result= num1-num2-num3;
             break;
            case '*':
             result= num1*num2*num3;
             break;
            case '/':
             result= num1/num2/num3;
             break;
            case '%':
             result= num1%num2;
             default :
             System.out.println("Error");
             return;
        }
        System.out.println(result);
    }
    
}
