import java.util.Scanner;

public class CoumptChange {
    public static void main(String args []) {
        System.out.println("Enter the Amounts :");
        Scanner sc=new Scanner(System.in);
        double amounts=sc. nextDouble();
        int remainingAmount=(int)(amounts*100);
         // dollors
         int AmountOfDollors=remainingAmount/100;
         remainingAmount=remainingAmount%100;
         //Quarters
         int AmountOfQuarters=remainingAmount/25;
         remainingAmount=remainingAmount%25;
         //dimes
         int AmountOfDimes= remainingAmount/10;
         remainingAmount=remainingAmount%10;
         //nickels
         int AmountOfNickels= remainingAmount/5;
         remainingAmount=remainingAmount%5;
        //  pennies
        int AmountOfPennies= remainingAmount;

        System.out.println("Your Amount is :" + amounts + "\n" + 
        "\t" + AmountOfDollors + "dollers \n" + 
        "\t" + AmountOfQuarters + "quarters \n" +
        "\t" + AmountOfDimes + "dimes \n" + 
        "\t" + AmountOfNickels + "nickels \n" + 
        "\t" + AmountOfPennies + "pennies \n" );
    }
    
}