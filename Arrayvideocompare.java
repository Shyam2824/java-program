import java.util.Scanner;

public class Arrayvideocompare {
    public static void main (String[] args)
	{
	Scanner sc=new Scanner(System.in);
		int t,n;
		t=sc.nextInt();
		
		while(t--!=0){
		   n=sc.nextInt(); 
		   int a[]=new int[n];
		   for(int i=0;i<n;i++){
		       a[i]=sc.nextInt();
		   }
		   int c=n;
		   for(int i=0;i<n-1;i++){
		       if(a[i]==a[i+1]){
		           c--;
		       }
		   }
		   System.out.println(c);
		   
		}
	}
    
}
