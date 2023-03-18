import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArraynonNegative {
    
    /**
     * @param arg
     */
    public static void main(String arg []) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int g;
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            ArrayList<Integer> a=new ArrayList<Integer>();
            for(int j=0;j<n;j++){
                g=sc.nextInt();
                a.add(g);
            }
            int count_neg=0;
            // count the occurence of '0' in the ArrayList
             final int count_zero=Collections.frequency(a ,0);
            if(count_zero>0){
                System.out.println(0);
            }
            else{
    		    int l = 0;
    		    while(l<n){
    		        if(a.get(l) < 0){
    		            count_neg = count_neg + 1;
    		        }
    		        l = l + 1;
    		    }
    		    if(count_neg%2 == 0){
    		        System.out.println(0);
    		    } // this condition was missing - where count_neg is odd
                else{
                    System.out.println(1);
                }
            }
        }
        
    }
    
}
