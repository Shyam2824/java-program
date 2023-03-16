import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AddArray {

    public static void main(String arg []) {
        Scanner read= new Scanner(System.in);
        int t= read.nextInt();
        for(int i=0;i<t;i++){ 
            ArrayList<Integer> a= new ArrayList<Integer>();
            int n= read.nextInt();
            for(int j=0;j<=n;j++){
                a.add(j);
            }
            System.out.println(a);
            Collections.sort(a,Collections.reverseOrder());
            System.out.println(a);
            
        }
    
}
    
}
