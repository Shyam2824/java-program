import java.util.Scanner;

public class evenandodd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the limited no. :");
        int l= sc.nextInt();
        for(int i=0;i<=l;i++){
            if(i%2==0)
            System.out.println("Even number" + i);
           else if(i%2==1)
            System.out.println("Odd  number" + i);
        }
    }
    
}
