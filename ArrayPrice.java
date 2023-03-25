import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrice {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            ArrayList<Integer>a=new ArrayList<Integer>();
            int n=sc.nextInt();
            int k=sc.nextInt();

            for(int j=0;j<n;j++){
                int ele=sc.nextInt();
                a.add(ele);
            }

            ArrayList<Integer> b= new ArrayList<Integer>();
            for(int l=0;l<n;l++){
                if(a.get(l) > k){
		            b.add(k);
		        }
		        else{
		            b.add(a.get(l));
		        }
            }
            int sum = 0;
		    int sum2 = 0;
		    for(int p = 0; p < a.size(); p++){
                sum += a.get(p);
		    }
		    for(int m = 0; m < b.size(); m++){
                sum2 += b.get(m);
		    }
		    System.out.println(sum - sum2);
        }
        
    }
    
}
