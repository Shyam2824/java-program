import java.util.Scanner;

public class Score {
    public static void main(String arg[]){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x = sc.nextInt();
    		int y = sc.nextInt();
    		int z=500-(x*2);
    		int d=1000-((x+y)*4);
    		int result=z+d;
    		int s=1000-(y*4);
    		int w= 500-((x+y)*2);
    		int result2=s+w;
    		if(result>=result2){
    		    System.out.println(result);
    		}else{
    		    System.out.println(result2);
    		}
        }
    }
    
}