import java.util.Scanner;

public class Array_03 {
    public static void main(String[] args) {
        final int Number_of_element=5;
        double number []= new double[Number_of_element];  // declare array
        double sum=0;

        Scanner read= new Scanner(System.in);
        for(int i=0; i<Number_of_element;i++){
            System.out.println("Enter the Element");
            number[i]= read.nextDouble();
            sum+=number[i];
        }

        double average= sum/ Number_of_element;
        int count=0;  // number of element above average
        for(int i=0;i<Number_of_element;i++)
        if(number[i]>average)
        count++;

        System.out.println("Average :" + average);
        System.out.println("Number of element above the average" + count);

    }
}
