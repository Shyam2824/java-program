import java.util.Scanner;

class BuildingRace{
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            if((a/x)>(b/y)){
                System.out.println("chefine");
            }
            else if((a/x)<(b/y)){
                System.out.println("cheif");
            }else{
                System.out.println("both");
            }
        }
    }
}