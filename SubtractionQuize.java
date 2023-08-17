import java.util.Scanner;

public class SubtractionQuize {
    
    public static void main(String[] args) {
        final int  NUMBER_OF_QUESTION=5; // Number of question
        int correctCount=0; // count the number of the question
        int count =0; // count the number of question
        long startTime= System.currentTimeMillis();
        String output ="";
        Scanner input= new Scanner(System.in);

        // loop
        while(count<NUMBER_OF_QUESTION){
            // Greater two random single digit integers
            int number1= (int)(Math.random()*10);
            int number2= (int)(Math.random()*10);

            // If number1<number2, swap number1 with number2
            if(number1<number2){
                int temp=number1;
                number1=number2;
                number2=temp;
            }
            // Prompt the student to answer 
            System.out.println("What is "+ number1 +"-"+ number2 + "? ");
            int answer=input.nextInt();
            
            // Grade the answer and display the result
            if(number1-number2==answer){
                System.out.println("Correct answer");
                correctCount++;
            }
            else
            System.out.println("Wrong answer \n" + number1 + "-" + number2 +
            "should be " + (number1-number2));
            count ++;
            output +="\n" +number1 + "-" + number2 + "=" + answer +
            ((number1-number2==answer) ? "correct" : "wrong");
        }
        long endTime= System.currentTimeMillis();
        long testTime= endTime-startTime;
        System.out.println("Correct count is " + correctCount + "\n t=Test time is "+
        testTime/1000 + "seconds \n" + output);
    }
}
