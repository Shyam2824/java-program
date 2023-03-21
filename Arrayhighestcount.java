import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arrayhighestcount {
    public static void main(String[] args) {
        System.out.println("enter the input");
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int g;
        for(int i =0;i<t;i++){
            int n=sc.nextInt();
             // Declare an array of size 'n'
            int [] a= new int[n];
            for (int j=0;j<n;j++){
                a[j]=sc.nextInt();
            }
             // sorting the array because we want to find most frequent element
             Arrays.sort(a);
             int count=1;
             int highest_count=1;
              int j=0;
             while(j<(n-1))
             {
                if(a[j]==a[j+1]){
                    count = count + 1;
                    if(highest_count <= count){
                        //Updates the global counter
                        highest_count = count;
                    }
                }
                 // If adjacent elements are not equal, resets count to 1
                 else{
                    count = 1;
                }
                j++;

              }
              System.out.println(n-highest_count);
        }
    }
    
}
