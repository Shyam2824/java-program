import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("Guess the number between 1 to 100");

        Scanner sc = new Scanner(System.in);

        //Prompt the user to guess the number
        int number= (int)(Math.random()*100);
        int guess= sc.nextInt();
        System.out.println("Enter the number");
        if(guess == number)
        System.out.println("yes" + number);  // Correct guess
        else if (guess > number)
        System.out.println("guess is too high");  // too high
        else
        System.out.println("guess is too loo"); // too low
    }
    
}
