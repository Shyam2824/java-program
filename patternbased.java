import java.util.Scanner;

public class patternbased {
    public static void main(String[] args) {
        System.out.println("Enter no of element");
        int n;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();

        // square
        // for(int j=1;j<=n;j++){
        // for(int k=1;k<=n;k++){
        //     System.out.print("*");
        // }
        // System.out.println();
        // }


        //     // triangle increasing
        // for(int j=1;j<=n;j++){
        //     for(int k=1;k<=j;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     }

        //  // triangle decreasing
        //  for(int j=1;j<=n;j++){
        //     for(int k=j;k<=n;k++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        //     }

        // Right triangle 
        for(int j=1;j<=n;j++){
            for(int k=1;k<=j;k++){
                System.out.print(" ");
            }
            for(int i=1;i<=n;i++){
                System.out.print(" * ");
            }
            System.out.println();
            }
    }
}
