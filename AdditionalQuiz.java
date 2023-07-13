import java.util.Scanner;

public class AdditionalQuiz {
    public static void main(String [] args) {
        int number1= (int)(System.currentTimeMillis()%10);
        int number2= (int)(System.currentTimeMillis()*7 %10);

        Scanner sc= new Scanner(System.in);
        System.out.println("What is " + number1 + "+" + number2 + "?");
        int answer = sc.nextInt();
        System.out.println(number1 + "+" + number2 + "=" + answer + "is" + 
        (number1 + number2 == answer));
        
    }
    
}
