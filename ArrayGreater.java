import java.util.ArrayList;
import java.util.Scanner;

public class ArrayGreater {
   
    /**
     * @param arg
     */
    public static void main(String arg []) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        int k;
        for (int i=0;i<t;i++){
            int m=sc.nextInt(); 
           // int n=sc.nextInt(); 
            ArrayList<Integer> a= new ArrayList<Integer>();
            for(int j=0;j<=m;j++){
            k=sc.nextInt();
            a.add(k);
            }
            int l=0;
            Integer large=a.get(0);
            Integer Small=a.get(0
            );
            while(l<a.size()){
                // If any element is larger that the largest element found so far, replace its value
                if(a.get(l)>large){
                    large=a.get(l);
                }
                // If any element is smaller that the smallest element found so far, replace its value
                 if(a.get(l)<Small){
                    Small=a.get(l);
                }
                l=l+1;
            }
            System.out.println(large+" "+Small);
        }
        
    }
    
}
