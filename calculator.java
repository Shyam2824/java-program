import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner read = new Scanner(System.in);
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        System.out.println("Enter the operator");
        
        String operator= read.next();
        double result = 0;
        switch(operator.charAt(0)){
            case'+':
            result= num1+num2;
           break;
            case '-':
             result= num1-num2;
             break;
            case '*':
             result= num1*num2;
             break;
            case '/':
             result= num1/num2;
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
