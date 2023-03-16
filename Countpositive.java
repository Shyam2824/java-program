import java.util.ArrayList;
import java.util.Scanner;

public class Countpositive {

    /**
     * @param arg
     */
    public static void main(String arg []){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        int g;
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            for (int j=0;j<n;j++){
            g=sc.nextInt();
            a.add(g);
            }
        int pos=0;
        int nev=0;
        int div=0;

        int l=0;
        while(l<a.size()){
            if(a.get(l)<0){
                nev=nev+1;
            }
            else if(a.get(l)>0){
                pos=pos+1;
            }
            if(a.get(l)%k==0){
                div=div+1;
            }
            l=l+1;
        }
        System.out.println(pos+" "+nev+" "+div);
    }
    }
    
}
