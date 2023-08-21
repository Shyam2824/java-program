import java.util.Scanner;

public class findNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a_pos=0, a_neg=0, a_zero=0;
        char choice;
        do{
                    System.out.println("Enter the number :");
                    int num= sc.nextInt();
                    if(num>0){ 
                        a_pos++;
                    }
                    else if(num<0){ 
                        a_neg++;
                    }
                    else { 
                        a_zero++;
                    }
                    System.out.println("Do you enter your choice (y/n)");
                    choice= sc.next().charAt(0);
        }
          while(choice=='y' || choice=='Y');
          System.out.println("Positive number : " + a_pos);
          System.out.println("Negative number : " + a_neg);
          System.out.println("Zero number : " + a_zero);
    }
}
