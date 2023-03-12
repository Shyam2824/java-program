import java.util.Scanner;

public class JustOneMoreEpisode {
    public static void main(String arg []) {
        System.out.println("Enter the T");
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int x=sc.nextInt();
            if(x>24){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        
    }
    
}
