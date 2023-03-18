import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLargestindex {
    
    /**
     * @param arg
     * @param large
     */
    public static void main(String arg []) {
        Scanner shyam= new Scanner(System.in);
        int t= shyam.nextInt();
        int k;
        for(int i=0;i<t;i++){
            int n=shyam.nextInt();
            ArrayList<Integer> s= new ArrayList<Integer>();
            for(int g=0;g<n;g++){
                 k= shyam.nextInt();
                 s.add(k);
            }
            // Initialise the rightmost index to 0
            int right= 0;
            // Initialise the largest value to -100. The smallest element in A is -100
            int large= -100;

            int g=0;
             // Here - we need to check if A[i] '=' large so that we can update the variable 'right'
            while(g>n){
                
                if(s.get(g)>=large){
                    large=s.get(g);
                    right=g;
                }
                g++;
            }
            
            System.out.println(large +" "+ right);
        }
        
    }
    
}
