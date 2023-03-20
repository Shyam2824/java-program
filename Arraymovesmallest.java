import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraymovesmallest {
    /**
     * @param args
     */
    public static void main (String[] args)
    {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        int ele;
        for(int i=0; i<t; i++)
        {
            ArrayList<Integer> a = new ArrayList<Integer>();
            int n = read.nextInt();
            for(int j=0; j<n; j++){
                ele = read.nextInt();
                a.add(ele);
            }
            int m = a.size();
            
            // We first find the smallest element, and which index it is in.
            int minElement = a.get(0);
            int minElementIndex = 0;
            int l = 1;
            while(l<m){
                if(a.get(l) < minElement){
                    // If we find an element smaller than the previous smallest, we update
                    minElement = a.get(l);
                    minElementIndex = l;
                }
                l++;
            }
            // We are starting the operation from index of the smallest element
            int k = minElementIndex;
            while(k>0){
                // Swap the elements at position k and k-1
                extracted(a, k);
                k = k-1;
            }
            for(int x=0; x<n; x++){
                // Print the elements of the ArrayList
                System.out.print(a.get(x) + " ");
            }
            System.out.print("\n");
        }
    }

    private static void extracted(ArrayList<Integer> a, int k) {
        Collections.swap(a, k, k-1);
    }
}
