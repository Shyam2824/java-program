import java.util.Scanner;

public class TooManyFloor {
    public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
				while (t-- != 0) {
		    int x = read.nextInt();
		    int y = read.nextInt();
		    int x1 = x/10;
		    int y1 = y/10;
		    if((x%10)!=0&&(y%10)!=0)
		        System.out.println(Math.abs(x1-y1));
		     else if((x%10==0)&&(y%10!=0))
		        System.out.println(Math.abs(x1-y1-1));
		    else if ((x%10!=0)&&(y%10==0))
		        System.out.println(Math.abs(x1-y1+1));
		    else 
		      System.out.println(Math.abs(x1-y1));
		}
	}
}
