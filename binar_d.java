import java.util.Scanner;

public class binar_d {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the binary number :");
        int n = sc.nextInt();
        int n1,p=1;
        int dec=0,i=1,j,d;
        n1=n;
        for(j=n;j>0;j=j/10){
            d=j%10;
            if(i==1)
            p=p*1;
            else
            p=p*2;
            dec=dec+(d*p);
            i++;
        }
        System.out.println("Binary number: " + n1);
        System.out.println("Decimal number: " + dec);
    }
    
}
